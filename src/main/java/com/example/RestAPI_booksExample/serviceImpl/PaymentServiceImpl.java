package com.example.RestAPI_booksExample.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.RestAPI_booksExample.service.PaymentService;


@Service("p1")
@Primary
public class PaymentServiceImpl implements PaymentService {

	private static Logger logger = LoggerFactory.getLogger(PaymentServiceImpl.class);
	
	@Override
	public void printMessage() {
		 logger.info("In PaymentServiceIml");
	}

}
