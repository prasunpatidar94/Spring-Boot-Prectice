package com.pp.sun.utility;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailUtility {

	@Autowired
	private JavaMailSender sender;

	public Boolean emailSend(
			
			//for cc and bcc array of string use 

			String to, String cc, String bcc, String sub, String text, String filepath) {

		try {

			boolean flag = false;

			// 1 take attachment in file system resources
			FileSystemResource fileSystemResource = new FileSystemResource(filepath);

			// 2 create empty mail
			MimeMessage message = sender.createMimeMessage();

			// 3 create massage by using helper class
			MimeMessageHelper helper = new MimeMessageHelper(message, (fileSystemResource != null) ? true : false);
			// set all mail info
			helper.setTo(to);
			helper.setSubject(sub);
			helper.setText(text);
			if (cc != null && !cc.isEmpty())
				helper.setCc(cc);
			if (bcc != null && !bcc.isEmpty())
				helper.setBcc(bcc);
			if (fileSystemResource != null)
				helper.addAttachment(fileSystemResource.getFilename(), fileSystemResource);

			// 4 send mail
			sender.send(message);
			flag = true;
			return flag;
		} catch (Exception e) {
			System.out.println("Some exception is comming ");
			e.printStackTrace();
			return false;
		}

	}

}
