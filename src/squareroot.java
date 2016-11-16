import java.util.Scanner;

/**
 * 
 */

/**
 * @author z.liu
 *
 */
public class squareroot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
        *

        * Name: Zichao Liu

        * Teacher: Mr.Hardman
 
        * Assignment 4, Program 2

        * Date Last Modified: 11/16/2016
        *
        */
		
		Scanner userInput = new Scanner(System.in);
		  int number;
		 
		  System.out.print("Hi, user! Please think of a number, we will calculate the square root of this number.");
		  number=userInput.nextInt();
		  
		  if (number>=0){
		   System.out.println("The answer is:"+Math.sqrt(number));
		  }
		  while (number<=0){
		   System.out.println("you can’t take the square root of this number.");
		   System.out.print("Please think of a number again:");
		   number=userInput.nextInt();
		   
		   if (number>=0){
		    System.out.println("The answer is:"+Math.sqrt(number));
		   }
		  }
		  
		  
		  
		  userInput.close();
	    }

}
