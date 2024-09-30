package com.otavio.email_service.application;

import org.springframework.beans.factory.annotation.Autowired;

import com.otavio.email_service.adapters.EmailSenderGateway;
import com.otavio.email_service.core.EmailSenderUseCase;

public class EmailSenderService implements EmailSenderUseCase {
	
  private final EmailSenderGateway emailSenderGateway;

  @Autowired
  public EmailSenderService(EmailSenderGateway emailGateway) {
    this.emailSenderGateway = emailGateway;
  }
  
  @Override
	public void sendEmail(String to, String subject, String body) {
    this.emailSenderGateway.sendEmail(to, subject, body);
	}
}
