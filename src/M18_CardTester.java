/**
 * This is a class that tests the M18_Card class.
 *
 *  @author Lydia Chung
 *  @version 06/12/2019
 */

public class M18_CardTester
{
   /**
    * The main method in this class checks the Card operations for consistency.
    * @param args is not used.
    */
   public static void main(String[] args) {

      /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

      // Establish new cards
      M18_Card aceHearts = new M18_Card("ace", "hearts", 1);
      M18_Card sixSpades = new M18_Card("six", "spades", 6);
      M18_Card jackDiamonds = new M18_Card("jack", "diamonds", 11);

      // Test card 1 and methods
      System.out.println("**** Tests Card 1: ace of hearts ****");
      System.out.println("  rank: " + aceHearts.rank());
      System.out.println("  suit: " + aceHearts.suit());
      System.out.println("  pointValue: " + aceHearts.pointValue());
      System.out.println("  toString: " + aceHearts.toString());
      System.out.println();

      // Test card 2
      System.out.println("**** Tests Card 2: six of spades ****");
      System.out.println("  rank: " + sixSpades.rank());
      System.out.println("  suit: " + sixSpades.suit());
      System.out.println("  pointValue: " + sixSpades.pointValue());
      System.out.println("  toString: " + sixSpades.toString());
      System.out.println();

      // Test card 3
      System.out.println("**** Tests Card 3: jack of diamonds ****");
      System.out.println("  rank: " + jackDiamonds.rank());
      System.out.println("  suit: " + jackDiamonds.suit());
      System.out.println("  pointValue: " + jackDiamonds.pointValue());
      System.out.println("  toString: " + jackDiamonds.toString());
      System.out.println();

      // Test matches() method
      System.out.println("Card 1 matches Card 2: " + aceHearts.matches(sixSpades));

   }
}