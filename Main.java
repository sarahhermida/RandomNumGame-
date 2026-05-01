import java.util.Random;
import java.util.Scanner; 

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int target = rand.nextInt(100);
        int num;
        System.out.println("Welcome to the random number generator game!");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("The rules are simple: ");
        System.out.println("#1 - Guess a Number between 0 and 99");
        System.out.println("#2 - If you are incorrect, guess again!");
        System.out.println("#3 - Make sure you pay attention to if your guess was higher or lower than the target each time!");
        System.out.println("#4 - Try and get the number in the least amount of tries !");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("Ready? Guess the number:");
       
        num = sc.nextInt();
        int count = 0;
        
        while (target != num){
           if ( target < num){
            System.out.println("The number is lower. Guess Again:");
            count++;
           }
           else if ( target > num){
            System.out.println("The number is higher. Guess Again:");
            count++;
           }

           num = sc.nextInt();    
        }  

        System.out.println("Correct! The number is "+ target + ". It took you " + count + " guesses!"); 
        sc.close();      
    }
}