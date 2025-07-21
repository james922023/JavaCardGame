public class Main {
    public static void main(String[] args){
        //print out hello to show its doing main properly!!
        GenerateCards GenerateCards= new GenerateCards();
        Card[] deck=GenerateCards.getDeck();
        System.out.println(deck[2].getNumber()+":"+deck[2].getSuit());
    }
}
