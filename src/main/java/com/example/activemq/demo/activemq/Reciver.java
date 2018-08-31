package com.example.activemq.demo.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Reciver {
	@JmsListener(destination = "mailbox", containerFactory = "myFactory")
	public void recevieMessage(Email email) {
		System.out.println("Recived <" + email + ">");

	}
	
	

}
