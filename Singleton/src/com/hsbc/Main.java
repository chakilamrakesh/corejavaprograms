package com.hsbc;

  class Singleton {

	private static Singleton singleInstance;

	public int x = 10;

	private Singleton() {

		// s = "Hello I am a string part of Singleton class";
	}

	public static Singleton getInstance() {

		if (singleInstance == null) {
			singleInstance = new Singleton();
		}
		return singleInstance;

	}

}

 public class Main  {
	
	public static void main(String[] args) {

		Singleton s1 = Singleton.getInstance();

		
		 Singleton s2 = Singleton.getInstance();
		 
		// Singleton s3 = Singleton.getInstance();
		 
		s1.x=s1.x+10;
		s2.x=s2.x+20;
		
		System.out.println("value of s1 is "+s1.x);
		System.out.println("value of s2 is "+s2.x);
	}

}
