import java.util.ArrayList;
public class GameDeck{

   private ArrayList<Card> p1 = new ArrayList<>();
   private ArrayList<Card> p2 = new ArrayList<>(); 
   
   /**
      Constructor creates a 52 card deck and splits the cards into an arraylist for each of the two players
   */
   public GameDeck(){
      Deck deck = new Deck();

      deck.shuffle();
      int i = 1;
      while (deck.isEmpty() == false){
         if (i % 2 == 0)
            p1.add(deck.dealCard());
         else
            p2.add(deck.dealCard());
         i++;
      }
   }
   
   
//    /**
//       Returns a player's deck
//       @param player The player whose deck will be returned
//       @return The players deck
//    */
//    public ArrayList getDeck(int player){
//       if (player == 1)
//          return p1;
//       else
//          return p2;
//    }

   /**
      Returns card from top of the deck
      @param player The player that is drawing a card
      @return The card at the top of the players deck
   */
   public Card getCard(int player){
      if (player == 1){
         Card c = p1.get(0);
         p1.remove(0);
         return c;
      }
      else{
         Card c = p2.get(0);
         p2.remove(0);
         return c;
      }
   }
   
   /**
      Adds a card to either deck
      @param player The player whose deck the card will be added to 
      @param c The card to be added

   */
   public void addCard(int player, Card c){
      if (player == 1){
         p1.add(c);
      }
      else{
         p2.add(c);
      }
   }
   
   /**
      Returns the size of either player's deck
      @param player The player whose deck will be examined
      @return The number of cards in the given player's deck
   */   
   public int getDeckSize(int player){
      if (player == 1){
         p1.trimToSize();
         return p1.size();
      }
      else{
         p2.trimToSize();
         return p2.size();
      } 
   }

}