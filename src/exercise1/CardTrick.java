package exercise1;

import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks
 * the user to pick a card. It then searches the array of cards for the match to
 * the user's card. To be used as starting code in Exercise
 *
 *
 * @author Manh Phu Giang Jan 23, 2023
 */
public class CardTrick {

    public static void main(String[] args) {

        Card[] hand = new Card[7];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue((int) (1 + Math.random() * 13));
            card.setSuit(Card.SUITS[(int) (0 + Math.random() * 3)]);
            hand[i] = card;
//         System.out.println(hand[i].getSuit() + " " + hand[i].getValue());
        }
        System.out.println("On my hand is having 7 card random from the deck. Can you guess?");
        System.out.print("Enter your guess Card suit (Hearts, Diamonds, Spades, Clubs): ");
        String suit = input.next();
        System.out.print("Enter your guess Card value (1 to 13): ");
        int value = input.nextInt();

        for (int i = 0; i < hand.length; i++) {
            if ((suit == hand[i].getSuit()) || (value == hand[i].getValue())) {
                printInfo();
            }
        }
    }

    /**
     * A simple method to print out personal information. Follow the
     * instructions to replace this information with your own.
     *
     * @author Manh Phu Giang Jan 2023
     */
    private static void printInfo() {

        System.out.println("Congratulations, you guessed right!");
        System.out.println();

        System.out.println("My name is ManhPhu Giang. My student number is 991685007");
        System.out.println();

        System.out.println("My career ambitions:");
        System.out.println("-- Write code without duplicates too much. ");
        System.out.println("-- Have a semester with no violations of academic integrity!");
        System.out.println("-- Have a semester a good grade");
        System.out.println();

        System.out.println("My hobbies:");
        System.out.println("-- Play games");
        System.out.println("-- Study");
        System.out.println("-- Working");
        System.out.println("-- Reading books about economy");

        System.out.println();
    }
}
