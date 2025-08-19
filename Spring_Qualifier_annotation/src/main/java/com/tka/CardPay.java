package com.tka;

import org.springframework.stereotype.Component;

@Component("card")
public class CardPay implements Payment {

	@Override
	public void pay() {

		System.out.println("pay by card");
	}

}
