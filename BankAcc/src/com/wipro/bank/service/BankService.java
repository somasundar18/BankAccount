package com.wipro.bank.service;

import com.wipro.bank.acc.RDAccount;
import com.wipro.bank.exception.BankValidationException;

public class BankService{
  public boolean validateDate(float principal,int tenure,int age,String gender) {
	  try {
	  if(principal>=500&&(tenure==5||tenure==10)&&(gender.equalsIgnoreCase("male")||gender.equalsIgnoreCase("female"))&&((age>=1)&&(age<=100))) {
		 return true;
	  }
	  else {
	  throw new BankValidationException();
	  }
  }
	  catch(BankValidationException e) {
		  System.out.println(e.toString());
		  return false;
	  }
  }
  public void calculate(float principal,int tenure,int age,String gender) {
	  if(validateDate(principal,tenure,age,gender)) {
		  RDAccount rd=new RDAccount(tenure,principal);
		  rd.setInterest(age,gender);
		  float interest=rd.calculateInterest();
		  System.out.println("Interest:"+interest);
		  float Amount=rd.calculateAmountDeposited();
		  System.out.println("Amount deposited:"+Amount);
		  float mAmount=rd.calculateMaturityAmount(Amount,interest);
		  System.out.println("Maturity Amount:"+mAmount);
	  }
  }
}
