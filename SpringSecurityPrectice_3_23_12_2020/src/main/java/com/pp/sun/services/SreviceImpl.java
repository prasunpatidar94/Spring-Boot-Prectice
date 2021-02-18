package com.pp.sun.services;

import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.pp.sun.models.User;
import com.pp.sun.repo.UserRepository;

@Service
@Transactional
public class SreviceImpl implements Services, UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public String saveUser(User user) {

		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		return userRepository.save(user).getName() + " is inserted ";

	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Optional<User> opt =   userRepository.findByEmail(username);
		if (!opt.isPresent())
			throw new UsernameNotFoundException("User Is Not Found"+username);
		User   user = opt.get();
		
		return new org.springframework.security.core.userdetails.User(
				username,// user name 
				user.getPassword(),//password
				user.getRoles().stream()//roles with granted authority
				.map(role-> new SimpleGrantedAuthority(role))
				.collect(Collectors.toSet())
				);
	}

}
