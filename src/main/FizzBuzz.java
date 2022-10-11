package main;

public class FizzBuzz {

	public String checkBuzzFizz(int input) {
		if(input%3==0) {
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
