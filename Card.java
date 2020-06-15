/**
 * This is a class definition file for cards.
 * Author (Amanda Cheng)
 * Version v1
 *
 */
public class Card {
    private int value; //value field set to private [1-13]
    private String suit;//suit field set to private [hearts, diamonds, clubs, spades]
    private String face;//face field set to private[ace, king, queen, jack]


    /**
     * No-args/default construct used to create an object of
     * the card class and set it with default values.
     */
    public Card() {
        value = 0;
        suit = "unknwon";
        face = "unknown";

    }

    /**
     * This is a constructor used to construct a card
     * class that will take in values/arguments in the
     * parameter.
     *
     * @param int fullValue
     * @param String cardSuit
     * @param String  faceCard
     */
    public Card(int fullValue, String cardSuit, String faceCard)
    {
        value = fullValue;
        suit = cardSuit;
        face = faceCard;
    }

    /**
     * This is the copy constructor that will accept a reference to a card object and copy it, and
     * return another card reference.
     *
     * @param Card other
     */

    public Card (Card other)
    {
        this.value = other.value;
        this.suit = other.suit;
        this.face= other.face;
    }

    /**
     * This is a get method that will return the value
     * of the card. The number should be from 1-13
     *
     * @return int 
     */
    public int getValue()
    {
        return value;
    }

    /**
     * This is a get method that will return the suit of the card
     * being either Heart, Clubs, Diamonds, or Spades.
     * @return String
     */
    public String getSuit()
    {
        return suit;
    }

    /**
     * This is a get method that will return the face of the card
     * either being a number card or a card with a face on it
     * (Jack, Queen, King, Ace)
     * 
     * @return String
     */
    public String getFace()
    {
        return face;
    }

    /**
     * This is a toString method for our card class file
     * and when called will return a string that gives
     * us a textual representation of our object.
     *
     * @return String
     */
    public String toString()
    {
        return "\nThe suit: " +suit + " \t The Face: " +face +
                " \t Thus the value: " + value;
    }

    /**
     *This compareTo method will compare the values
     * of the calling card and the other card that was
     * inputted.
     * @Param Card otherCard
     * @return int
     */

    public int compareTo(Card otherCard)
    {   //created a local variable called answer that will hold an int.
        int answer;
        //calling card - inputted card value if
        //greater than 0, the calling card has a greater value.
        if(value-otherCard.value>0)
        {
            answer = 15;
        }
        //if calling card - other card <0 , then calling card
        //value is less than otherCard.
        else if(value-otherCard.value<0)
        {
            answer = -15;
        }
        //else if they are subtracted and returns 0, they are equal and of same value
        else
        {
            answer = 0;
        }
        return answer;
    }

    /**
     * This is an equals method that will first compare the suit
     * of the card using string methods to compare the string.
     * Then if the values are equal it will compare the face.
     * If the face of the card are equal, then it will return true.
     * Otherwise, it will return false.
     *
     * @paramCard otherCard
     * @return boolean
     */
    public boolean equals(Card otherCard)
    {
        boolean answer;
        if (suit.equals(otherCard.suit)) {
            if (face.equals(otherCard.face)) {
                answer = true;
            } else {
                answer = false;
            }

        } else {
            answer = false;
        }
    return answer;
    }

}
