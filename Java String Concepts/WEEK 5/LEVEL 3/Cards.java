import java.util.Scanner;
public class Cards {
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }
    public static String[][] distributeCards(String[] deck, int n, int players) {
        if (n > deck.length || n % players != 0)return null;
        int cardsPerPlayer = n / players;
        String[][] distributed = new String[players][cardsPerPlayer];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                distributed[i][j] = deck[index++];
            }
        }
        return distributed;
    }
    public static void printPlayers(String[][] playersCards) {
        if (playersCards == null) {
            System.out.println("Cannot distribute the cards evenly.");
            return;
        }
        for (int i = 0; i < playersCards.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < playersCards[i].length; j++)System.out.println(playersCards[i][j]);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of cards to distribute: ");
        int n = scanner.nextInt();
        System.out.print("Enter number of players: ");
        int players = scanner.nextInt();
        String[] deck = initializeDeck();
        shuffleDeck(deck);
        String[][] playersCards = distributeCards(deck, n, players);
        printPlayers(playersCards);
    }
}
