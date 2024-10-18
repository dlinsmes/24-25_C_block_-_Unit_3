public class CardGame {

    public static void main(String [] args) {

        String [] suits = {"spades", "hearts", "diamonds", "clubs"};
        String [] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        //randomly generate a card and output it as Rank of Suit
        int rankI = (int)(Math.random() * ranks.length); //[0, 12]
        int suitI = (int)(Math.random() * suits.length); //[0, 3]

        System.out.println(ranks[rankI] + " of " + suits[suitI]);
        System.out.println();

        //produce every combination of cards
        //Ace of spades, 2 of spades, ... king of spades, ace of hearts, ...,
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {

                System.out.println(ranks[j] + " of " + suits[i]);
            }
        }

        System.out.println();

        int count = 0;
        //for each loops - use String as the var type bc the arrays hold Strings
        for(String suit: suits){
            for (String rank: ranks){
                //use the loop variable directly as the value - don't use it as an index
                System.out.println("Card " + count + ": " +rank + " of " + suit);
                count++;
            }
        }

        //card 0 is Ace of Spades, card 1 is 2 of spades, ... card 12 is  king of spades
        //card 13 is Ace of Hearts
        //card 26 is Ace of Diamonds
        //card 39 is Ace of Clubs, ... card 51 is king of clubs

        for (int i = 0; i < 52; i++) {
            rankI = i % 13; // use modulo to produce [0, 12]
            suitI = i / 13; //use int div to produce [0, 3]
            System.out.println("Card " + i + ": " + ranks[rankI] + " of " + suits[suitI]);

        }


        int [] deck = new int [52];
        for (int i = 0; i < 52; i++) {
            deck[i] = i;
        }

        //shuffle the deck - swap multiple times - use at least one random index in the swap
        for (int i = 0; i < 52; i++) {

            int randIndex = (int)(Math.random() * 52);

            //swap the values at position i and position randIndex
            int temp = deck[i];
            deck[i] = deck[randIndex];
            deck[randIndex] = temp;
        }

        System.out.println();
        for (int i = 0; i < 52; i++) {
            int value = deck[i];
            rankI = value % 13;
            suitI = value / 13;

            System.out.println(value + " - " + ranks[rankI] + " of " + suits[suitI]);
        }

        System.out.println();
        int [] hand = new int [7];

        int top = 0; //increment top every time a card is drawn bc length of an array needs to stay the same

        for (int i = 0; i < hand.length; i++) {
            hand[i] = deck[top];
            top++;

            int value = hand[i];
            rankI = value % 13;
            suitI = value / 13;

            System.out.println("Card " + i + " in hand: " + ranks[rankI] + " of " + suits[suitI]);
        }

        //game: ask the user which card in their hand they want to swap for a new card from the deck
        //until they have four of a kind of the same rank, ex: 4 Aces


    }

}
