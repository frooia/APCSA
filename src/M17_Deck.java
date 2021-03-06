import java.util.List;
import java.util.ArrayList;

/**
 * The M17_Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 *
 *
 *  @author Lydia Chung
 *  @version 06/07/2019
 */
public class M17_Deck
{
   private List<M17_Card> cards;    //contains all the cards in the deck

   private int size;   // size is the number of not-yet-dealt cards.
                       // Cards are dealt from the top (highest index) down.
                       // The next card to be dealt is at size - 1.

   /**
    * Creates a new M17_Deck instance.<BR>
    * It pairs each element of ranks with each element of suits,
    * and produces one of the corresponding card.
    * @param ranks is an array containing all of the card ranks.
    * @param suits is an array containing all of the card suits.
    * @param values is an array containing all of the card point values.
    */
   public M17_Deck(String[] ranks, String[] suits, int[] values)
   {

      /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */

      // initialize cards as a new ArrayList
	   cards = new ArrayList<M17_Card>();
      // loop through the parameter arrays to add new cards
	   for (int i = 0; i < ranks.length; i++) {
		   for (int j = 0; j < suits.length; j++) {
			   cards.add(new M17_Card(ranks[i], suits[j], values[i]));
		   }
	   }
      // assign size of cards to the size instance variable
	   size = cards.size();
      // shuffle cards
	   this.shuffle();
   }

   /**
    * Determines if this deck is empty (no undealt cards).
    * @return true if this deck is empty, false otherwise.
    */
   public boolean isEmpty()
   {
      /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	   if (size == 0) {
		   return true;
	   }
	   return false;
   }

   /**
    * Accesses the number of undealt cards in this deck.
    * @return the number of undealt cards in this deck.
    */
   public int size()
   {
      /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	   return size;
   }

   /**
    * Randomly permute the given collection of cards
    * and reset the size to represent the entire deck.
    */
   public void shuffle()
   {
      /* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
      /* For Activity 2, this method will do nothing. */
   }

   /**
    * Deals a card from this deck.
    * @return the card just dealt, or null if all the cards have been
    *         previously dealt.
    */
   public M17_Card deal()
   {
      /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	   if (this.size() == 0) {
		   return null;
	   }
	   size--;
	   return cards.get(size);
   }

   /**
    * Generates and returns a string representation of this deck.
    * @return a string representation of this deck.
    */
   @Override
   public String toString()
   {
      String rtn = "size = " + size + "\nUndealt cards: \n";

      for (int k = size - 1; k >= 0; k--)
      {
         rtn = rtn + cards.get(k);
         if (k != 0)
         {
            rtn = rtn + ", ";
         }
         if ((size - k) % 2 == 0)
         {
            // Insert carriage returns so entire deck is visible on console.
            rtn = rtn + "\n";
         }
      }

      rtn = rtn + "\nDealt cards: \n";
      for (int k = cards.size() - 1; k >= size; k--)
      {
         rtn = rtn + cards.get(k);
         if (k != size)
         {
            rtn = rtn + ", ";
         }
         if ((k - cards.size()) % 2 == 0)
         {
            // Insert carriage returns so entire deck is visible on console.
            rtn = rtn + "\n";
         }
      }
      rtn = rtn + "\n";
      return rtn;
   }
}