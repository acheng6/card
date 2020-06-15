import java.util.*; 
/**
 * This program is used to play craps. 
 *
 * @author Amanda Cheng
 * @version v1
 */
public class DieDriver
{
    public static void main(String [] args)
    {
        int first; 
        int second;
        int sum; 
        int throwerPoint;
        char a; 
        int third; 
        int fourth; 
        int newSum; 

        Die firstRoll = new Die();
        Die secondRoll = new Die(); 
        Scanner input = new Scanner(System.in); 
        a='y';
        do{
            firstRoll.roll(); 
            secondRoll.roll(); 
            System.out.println("Hi, for the first roll you got "); 
            System.out.println(firstRoll);
            System.out.println("Your second roll is:");
            System.out.println(secondRoll); 
            first = firstRoll.getFace(); 
            second = secondRoll.getFace(); 
            sum = first + second; 
            System.out.println("Your total is : " +sum);
            if (sum == 7 || sum == 11)
            {
                System.out.println("You win");
                System.out.println("Would you like to play?If so, type 'y'"); 
                a=input.next().charAt(0);

            }
            else if (sum ==2 || sum ==3 || sum ==12)
            {
                System.out.println("You lose"); 
                System.out.println("Would you like to play?If so, type 'y'"); 
                a=input.next().charAt(0);
            }
            else
            {
                System.out.println("Your throwers point: "+ sum); 
                System.out.println("Rolling again to equal the throwers point"); 

                do{
                    firstRoll.roll(); 
                    secondRoll.roll(); 
                    third = firstRoll.getFace(); 
                    fourth = secondRoll.getFace(); 
                    newSum= third + fourth; 
                    System.out.println("Your new sum is : " + newSum);
                    if (newSum == sum)
                    {
                        System.out.println("You won"); 
                        break;
                    }
                    else if (newSum == 7)
                    {
                        System.out.println("You lost");
                        break;   
                    }
                    else{

                        System.out.println("Rerolling");

                    }

                }
                while (newSum != sum && newSum !=7);
                System.out.println("Would you like to play?If so, type 'y'"); 
                a=input.next().charAt(0);
            }
        }while(a == 'y');
        System.out.println("Goodbye"); 
    }
}
