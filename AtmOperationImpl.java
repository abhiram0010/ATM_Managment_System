package ATM;

import java.util.*;

public class AtmOperationImpl implements AtmInterface{

	Atm atm=new Atm();
	Map<Double,String>ministmt=new HashMap<>();
	public void viewBalance() {
		System.out.println("Available Balance:"+atm.getBalance());
	}
	public void withdrawAmount(double withdrawAmount) {
		
		if(withdrawAmount%500==0) {
			if(withdrawAmount<=atm.getBalance()) {
				System.out.println("Collect The Cash"+withdrawAmount);
				atm.setBalance(atm.getBalance()-withdrawAmount);
				ministmt.put(withdrawAmount,"Amount Withdrawn");
				viewBalance();
			}
		else {
			System.out.println("Insufficient Balance");
		}
		}
		else {
			System.out.println("enter money in terms of 500");
		}
	}
	public void depositAmount(double depositAmount) {
		System.out.println("deposited Amount:"+depositAmount);
	     atm.setBalance(atm.getBalance()+depositAmount);
	     ministmt.put(depositAmount, "Deposited Successfully");
	     viewBalance();
	}

	public void viewMiniStatement() {
		
		Set<Double>set=ministmt.keySet();
		for(Double d:set) {
			System.out.println(d+"="+ministmt.get(d));
		}
	}

}
