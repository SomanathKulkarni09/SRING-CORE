package com.tka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {
	
	@Qualifier("upi")
	@Autowired
	private Payment payment1;
	
	@Qualifier("card")
	@Autowired
	private Payment payment2;

	public Payment getPayment1() {
		return payment1;
	}

	public void setPayment1(Payment payment1) {
		this.payment1 = payment1;
	}

	public Payment getPayment2() {
		return payment2;
	}

	public void setPayment2(Payment payment2) {
		this.payment2 = payment2;
	}

	@Override
	public String toString() {
		return "User [payment1=" + payment1 + ", payment2=" + payment2 + "]";
	}
	


}
