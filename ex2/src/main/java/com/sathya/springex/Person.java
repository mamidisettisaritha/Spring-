package com.sathya.springex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
private HomeLoanService homeLoanService;
private RealstateService realstateService;
@Autowired
public Person(HomeLoanService homeLoanService, RealstateService realstateService) {
	super();
	this.homeLoanService = homeLoanService;
	this.realstateService = realstateService;
}
public void details()
{
	homeLoanService.LoanInfo();
	realstateService.RealStateInfo();
}
}
