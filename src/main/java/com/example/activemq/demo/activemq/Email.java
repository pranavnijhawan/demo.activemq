package com.example.activemq.demo.activemq;

public class Email {
	
	String to;
	String body;

	public Email(){
		
	}
	
	public Email(String to , String body){
		this.to=to;
		this.body=body;
	}

	public String getTo() {
		return to;
	}

	@Override
	public String toString() {
		return String.format("Email {to=%s, body=%s} ", getTo(),getBody());
	}

	public void setTo(String to) { 	
		this.to = to;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
}
