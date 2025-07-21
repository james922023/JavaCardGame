public class Card {

    Card(int Inputnum, suits InputSuit){

        suit=InputSuit.toString();
        number=Inputnum;

    }

    enum suits{

        CLUBS,
        DIAMONDS,
        SPADES,
        HEARTS;

    };

    public String getSuit(){
        return suit;
    }

    public int getNumber(){
        return number;
    }

    public boolean getIsFaceCard(){
        return isFaceCard;
    }
    public void setIsFaceCard(boolean TrueorFalse){
        isFaceCard=TrueorFalse;
    }

    private String suit;

    private int number;

    private boolean isFaceCard;   
}
