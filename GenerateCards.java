
public class GenerateCards{

    /**
    *******************************************************************
    *This method creates a new Card object for each card in a standard
    *deck. ie 52 cards or objects are created.
    *******************************************************************
    */  

    GenerateCards(){

        for(int i=0;i<13;i++){

            Card newHeartCard= new Card(i+1,Card.suits.HEARTS);         //CREATE HEEART CARD

            newHeartCard.setIsFaceCard(i>10?true:false);

            Deck[i]=newHeartCard;

            Card newClubCard= new Card(i+1,Card.suits.CLUBS);           //CREATE Club CARD

            newClubCard.setIsFaceCard(i>10?true:false);

            Deck[i+13]=newClubCard;

            Card newSpadeCard= new Card(i+1,Card.suits.SPADES);         //CREATE Spade CARD

            newSpadeCard.setIsFaceCard(i>10?true:false);

            Deck[i+26]=newSpadeCard;

            Card newDiamondCard= new Card(i+1,Card.suits.DIAMONDS);     //CREATE Diamond CARD

            newDiamondCard.setIsFaceCard(i>10?true:false);

            Deck[i+39]=newDiamondCard;

        }

    }

    public Card[] getDeck(){
        return Deck;
        }

    private Card[] Deck=new Card[52];
}
