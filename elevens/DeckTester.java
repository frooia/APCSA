/**
 * This is a class that tests the Deck class.
 *
 *  @author Lydia Chung
 *  @version 06/12/2019
 */

public class DeckTester
{
   /**
    * The main method in this class checks the Deck operations for consistency.
    * @param args is not usemyDeck.
    */
   public static void main(String[] args)
   {
	   
      /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
      /* Uncomment blocks of code to test the Deck class */

	   /*
      String[] myRanks = {"queen", "ace", "four", "two", "ten"};
      String[] mySuits = {"hearts", "spades"};
      int[] myPointValues = {12, 1, 4, 2, 10};
      M18_Deck myDeck = new M18_Deck(myRanks, mySuits, myPointValues);

      System.out.println("**** Original Deck Methods ****");
      System.out.println("  toString: \n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println();
      System.out.println();

      System.out.println("**** Deal a Card ****");
      System.out.println("  deal: " + myDeck.deal());
      System.out.println();
      System.out.println();

      System.out.println("**** Deck Methods After 1 Card Dealt ****");
      System.out.println("  toString:\n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println();
      System.out.println();

      System.out.println("**** Deal Remaining 9 Cards ****");
      for (int i = 0; i < 9; i++) {
    	  System.out.println(" deal: " + myDeck.deal());
      }
      System.out.println();
      System.out.println();

      System.out.println("**** Deck Methods After All Cards Dealt ****");
      System.out.println("  toString:\n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: "  + myDeck.size());
      System.out.println();
      System.out.println();

      System.out.println("**** Deal a Card From Empty Deck ****");
      System.out.println("  deal: " + myDeck.deal());
      System.out.println();
      System.out.println();
      */


      /* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */

      System.out.println("\n**** 52 Card Deck shuffle Tests ****");
      String[] myRanks = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
      String[] mySuits = {"spades", "hearts", "clubs", "diamonds"};
      int[] myPointValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
      M18_Deck myDeck = new M18_Deck(myRanks, mySuits, myPointValues);

      System.out.println("  The Starting Deck ");
      System.out.println(myDeck.toString());

      System.out.println("  The Deck After Dealing a Card" );
      System.out.println("deal: " + myDeck.deal());
      System.out.println("remaining: " + myDeck.toString());

      System.out.println("  Shuffling the Deck ");
      myDeck.shuffle();
      System.out.println(myDeck.toString());


   }
}