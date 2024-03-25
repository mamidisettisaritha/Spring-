package com.sathya.springex;

public class GreetingImpl implements Greeting {
		@Override
		public void greet() {
			System.out.println("This is spring first example");
			System.out.println("Ratan sir woww");
			
		}
	public GreetingImpl() {
		System.out.println("GreetingImpl constructor::Object created");
	}
	}
