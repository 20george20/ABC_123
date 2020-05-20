/**
 * computer asks the user to input numerical data and performs various calculations with it
 * @author 20george
 * @version 09/13/2018
 * please enter in 
 */
import java.util.Scanner;

public class SimpleIOMath {
	private String name;
	private int age;
	private int favNumber;
	
	
	public SimpleIOMath() {
		name = new String();
		age = 0;
		favNumber = 0;
		
	}
	public void promptUser() {
		Scanner in = new Scanner(System.in);
		System.out.print("Question 1: What is your name? ");
		name = in.nextLine();
		
		
			while (true) {
				try {
				System.out.print("Question 2: How old are you? ");
				age = in.nextInt();
				
				break;
			}
			catch(Exception e) {
				System.out.println("Need integer input for age");
				in.nextLine();
				
			}
			}
			while (true) {
				try {
				System.out.print("Question 3: What is your favorite number? ");
				favNumber = in.nextInt();
				break;
			}
			catch(Exception e) {
				System.out.println("Need integer input for fav num");
				in.nextLine();	
			}
			}
	}
//adapted from https://gist.github.com/joseporiol/8559440
	public int smallestPrimeFactor(int number) {
        int i;
  
        for (i = 2; i <= number; i++) {
            //benchmark algorithm 
        		// % is used for expressing the remainder of a number after it has been divided by another number
        		// == is a comparison operator
        		if (number % i == 0) { 
            return i;
            }	
        }
        if (number == 1) {
			return number;
		}
        return i;
    }
	public int largestPrimeFactor(int number) {
		
		for (int i = number; i >= 2; i--) {
			
			if (number % i == 0 && isPrime(i)) {
				return i;
			}
		}
		return 200000;
	}

	public boolean isPrime (int number) {
		for(int i = 2; i < Math.sqrt(number)+ 1; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}
	
	public void printInfo() {
		System.out.println("I'm gonna teach you how to sing it out\n" + 
				"Come on, come on, come on\n" + 
				"Let me tell you what it's all about\n" + 
				"Reading, writing, arithmetic\n" + 
				"Are the branches of the learning tree\n" + 
				"Your name is: " + name + "\n" + 
				"Your age is: " + age + "\n" + 
				"At your next birthday, you will turn " + (age+1) + ".\n" + 
				"The first prime factor of " + age + " is: " + smallestPrimeFactor(age) + "\n" + 
				"Your favorite number is: " + favNumber + "\n" + 
				"Your favorite number squared is: " + favNumber * favNumber + "\n" + 
				"The largest prime factor of your age is " + largestPrimeFactor(age) + "\n" +
				"* end of program *");
	}
	/**
	 * main entry
	 * @param args command line arguments if needed
	 */
	public static void main(String[] args) {
		SimpleIOMath app = new SimpleIOMath();
		System.out.println("* Sit yourself down, take a seat *");
		System.out.println("* All you gotta do is repeat after me *");
		app.promptUser();
		app.printInfo();
		
	}
}
