import java.util.ArrayList;
public class WarGame
{
   GameDeck gD = new GameDeck();
   Card p1Card;
   Card p2Card;

   int turns = 0;       
   int winner = 0;   //when the game is won, this value will be 1 or 2, signifying player number
   int warWinner;
   public void war(){
      try{
         Card p1WarCard = gD.getCard(1);
         Card p1WarFlipCard = gD.getCard(1);
         Card p2WarCard = gD.getCard(2);
         Card p2WarFlipCard = gD.getCard(2);
         int warWinner;
         
         if (p1WarFlipCard.getRank() > p2WarFlipCard.getRank()){
            warWinner = 1;

         }
         else if (p1WarFlipCard.getRank() < p2WarFlipCard.getRank()){
            warWinner = 2;
            gD.addCard(2, p2Card);      
            gD.addCard(2, p2WarCard);
            gD.addCard(2, p2WarFlipCard);
            gD.addCard(2, p1Card);
            gD.addCard(2, p1WarCard);
            gD.addCard(2, p1WarFlipCard);
         }
         else{
            war();
            gD.addCard(warWinner, p1Card);
            gD.addCard(warWinner, p1WarCard);
            gD.addCard(warWinner, p1WarFlipCard);
            gD.addCard(warWinner, p2Card);
            gD.addCard(warWinner, p2WarCard);
            gD.addCard(warWinner, p2WarFlipCard);
         }

         
      }
      catch(IndexOutOfBoundsException e){
         if (gD.getDeckSize(1) == 0)
            winner = 2;
         else
            winner = 1;
      } 
   }

   public void draw(GameDeck gD){
      
      try{
      
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
            war();
         }
         else;
         }
      catch(IndexOutOfBoundsException e){
         if (gD.getDeckSize(1) == 0)
            winner = 2;
         else
            winner = 1;
         
      }
   }
}