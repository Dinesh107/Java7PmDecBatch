package com.abstraction;

public class AmazonBackendTeam extends AmazonDemoUser {
	
	@Override
	public void demoUserName(String uname) {

		super.demoUserName(uname);
		
	}

	@Override
	public void demoUserPassword() {

		System.out.println("1234567");
		
	}
	
   public static void main(String[] args) {
	
	   AmazonBackendTeam obj = new AmazonBackendTeam();
	   
	   obj.demoUserName("demouser1");
	   
	   obj.demoUserPassword();
	   
   }
  
}
