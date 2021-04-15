package com.pp.sun.scheduler;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/*cron expretion
 *|	*	  |  *   |  *   |  *   |  *   |   *
 *| sec   | min  | hrs  | day  | month| Weekday
 *| 1-60  | 1-60 | 1-60 | 1-31 | 1-12 |sun-sat
 * 
 * second method
 * @Scheduled(fixedDelay = 1000L)
 * 
 * */
@Component
public class AutoRun {
//	@Scheduled(fixedDelay = 1000L)
//	public void data() {
//
//		System.out.println("running " + new Date());
//
//	}
@Scheduled(cron = "* * * * * *") //per sec
	public void cronExpretion() {

		System.out.println("running cron " + new Date());

	}

}
