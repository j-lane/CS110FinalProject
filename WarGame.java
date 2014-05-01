import java.util.ArrayList;
public class WarGame
{
   Card p1Card;
   Card p1WarCard;
   Card p1WarFlipCard;
   Card p2Card;
   Card p2WarCard;
   Card p2WarFlipCard;
   int turns = 0;       
   int winner;   //when the game is won, this value will be 1 or 2, signifying player number
   
   public void war(GameDeck gD){
      try{
         p1WarCard = gD.getCard(1);
         p1WarFlipCard = gD.getCard(1);
         p2WarCard = gD.getCard(2);
         p2WarFlipCard = gD.getCard(2);
         
      }
      catch(IndexOutOfBoundsException e){
         if (gD.getDeckSize(1) == 0)
            winner = 2;
         else
            winner = 1;
      }
       
   }
   
   public void draw(GameDeck gD){
      p1Card = gD.getCard(1);
      p2Card = gD.getCard(2);
      
      if (p1Card.getRank() > p2Card.getRank()){
         gD.addCard(1, p1Card);
         gD.addCard(1, p2Card);
         turns++; 
      }
      
      else if (p1Card.getRank() < p2Card.getRank()){
         gD.addCard(2, p2Card);
         gD.addCard(2, p1Card);
         turns++; 
      }
      
      else if (p1Card.getRank() == p2Card.getRank()){
         war(gD);
      }
      else;
   }

   public static void main(String [] args){
   
      GameDeck gD = new GameDeck();



  
      while ((gD.getDeckSize(1) != 0) && (gD.getDeckSize(2) != 0)){
      }
      

      
      

         
//       p1Stack.remove(0);
//       p1Stack.add(p2Stack.get(0));
//       p2Stack.remove(0);
//       System.out.println(p1Stack.size());
//       System.out.println(p2Stack.size());
//       
//       System.out.println("Player 1:");
//       for (Card x : p1Stack)
//          System.out.println(x);
//       System.out.println("Player 2:");
//       for (Card x : p2Stack)
//          System.out.println(x);
   }
   
}