/**
 * 
 * This is a driver file that will test our the card class and it will test our the deck class. 
 * 
 * Author (Amanda Cheng)
 * Version v1
 * 
 */
public class CardDriver {
    public static void main(String[]args)
    {
        System.out.println("Testing the default card class: "); 
        Card c1= new Card();//calling and testing out default card class (no-args))
        c1 = new Card(10, "Heart", "Ten"); //overloaded the constructor with the value, the suit, and the face

        System.out.println(c1);//print out the card.
        System.out.println("\n\n\n");




        System.out.println("Before Shuffling The Deck  : "); 
        Deck d1 = new Deck();//using our deck class to print default deck
        d1.toString(); //calling it's tostring method to show all the cards in its default positions. 

        System.out.println("\n\n\n");


        System.out.println("\t\tShuffling the cards"); //Shuffle the cards.
        d1.shuffle(); //using the same object to shuffle the cards
        d1.toString();//calling the tostring method to show textual representation of the cards in new positions. 

        System.out.println("\n\nDrawing the first two top cards: ");
        //calling the getTopCard method and returning the first
        //two top cards from the shuffled deck.

        System.out.println(d1.getTopCard(0)); //overloaded each getTopcard with (0) which is the first card in the array
        System.out.println(d1.getTopCard(1)); //overloaded the method with 1 to get the next or second card in the array. 

    }
}
