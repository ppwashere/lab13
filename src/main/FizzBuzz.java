package main;

public class FizzBuzz {

	public void BuzzFizz(int input) {
		
		
		for(int i=1;i<=input;i++) {
			 if(i%3 == 0 && i%5 == 0 ) {
				 System.out.println("FizzBuzz");
	
			 }else if(i%3 == 0) {
				 System.out.println("Fizz");
			
			 }else if(i%5 == 0) {
				 System.out.println("Buzz");
				 
			 }else {
				 System.out.println(i);
			 }
			   
		}
		
		
	}
	
	public String checkBuzzFizz(int input) {
		if(input%3==0 && input%5==0) {
			System.out.println("FizzBuzz");
			return "FizzBuzz";
		}else if(input%3==0) {
			System.out.println("Fizz");
			return "Fizz";
			
		}else if(input%5==0){
			System.out.println("Buzz");
			return "Buzz";
			
		}else {
			System.out.println(input);
			return String.valueOf(input);
		}
	}
	
}
