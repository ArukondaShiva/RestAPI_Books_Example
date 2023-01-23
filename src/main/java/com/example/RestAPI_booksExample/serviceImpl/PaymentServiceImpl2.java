package com.example.RestAPI_booksExample.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.RestAPI_booksExample.service.PaymentService;


@Service
public class PaymentServiceImpl2 implements PaymentService {

	private static Logger logger = LoggerFactory.getLogger(PaymentServiceImpl2.class);
	
	@Override
	public void printMessage() {
		 logger.info("In PaymentServiceImpl2");
	}

}
