import java.util.Scanner;
public class GuessingNumber {

	public static void main(String[] args) {
		
    number_guessing();
	}
	public static void number_guessing()
	{
		Scanner sc=new Scanner(System.in);
		int num=(int)(100*Math.random());
		int no_of_attempts=5;
		int guess,i;
		System.out.println("--------------------Number Guessing Game-----------------------");
		System.out.println("You have to guess a Number Between 1 to 100.And having 5 attemts to guess");
		for(i=0;i<no_of_attempts;i++)
		{
			System.out.println("Enter Your Guess:");
			guess=sc.nextInt();
			if(num==guess)
			{
				System.out.println("Your Guess is correct.");
				break;
			}
			else if(num>guess && i!=no_of_attempts-1)
			{
				System.out.println("The Generated number is greater than "+guess);
			}
			else if(num<guess && i!=no_of_attempts-1)
			{
				System.out.println("The Generated number is smaller than "+guess);
			}
		}	
		 if(i==no_of_attempts)
			{
				System.out.println("You did not guess the number.");
				System.out.println("The number is "+num);
				
			}
			
		
	}

}
