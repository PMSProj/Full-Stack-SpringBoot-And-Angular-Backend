package com.rest.webservices.restfulwebservices;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptPasswordEncoderTest {

	public static void main(String[] args) {
	BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
	
	for(int i=0;i<10;i++){
	String encodedString=encoder.encode("Prity@123");
	System.out.println(encodedString);
	}

	}

}
