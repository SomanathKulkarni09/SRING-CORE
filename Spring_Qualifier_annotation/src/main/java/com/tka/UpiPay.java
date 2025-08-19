package com.tka;

import org.springframework.stereotype.Component;

@Component("upi")
public class UpiPay implements Payment {

	@Override
	public void  pay() {

		System.out.println("UPI payment");
	}

}
