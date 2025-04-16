import java.util.Scanner;
public class RockPaper {
    public static String getComputerChoice() {
        int rand = (int)(Math.random() * 3);
        if (rand == 0) return "rock";
        else if (rand == 1) return "paper";
        else return "scissors";
    }
    public static String getWinner(String user, String computer) {
        if (user.equals(computer)) return "draw";
        if (user.equals("rock")) return computer.equals("scissors") ? "user" : "computer";
        if (user.equals("paper")) return computer.equals("rock") ? "user" : "computer";
        if (user.equals("scissors")) return computer.equals("paper") ? "user" : "computer";
        return "invalid";
    }
    public static String[][] getGameResults(String[][] results, int totalGames) {
        int userWins = 0, computerWins = 0, draws = 0;
        for (int i = 0; i < totalGames; i++) {
            if (results[i][2].equals("user")) userWins++;
            else if (results[i][2].equals("computer")) computerWins++;
            else draws++;
        }
        String[][] summary = new String[3][3];
        summary[0][0] = "User";
        summary[0][1] = String.valueOf(userWins);
        summary[0][2] = String.format("%.2f%%", (userWins * 100.0) / totalGames);
        summary[1][0] = "Computer";
        summary[1][1] = String.valueOf(computerWins);
        summary[1][2] = String.format("%.2f%%", (computerWins * 100.0) / totalGames);
        summary[2][0] = "Draws";
        summary[2][1] = String.valueOf(draws);
        summary[2][2] = "-";
        return summary;
    }
    public static void displayResults(String[][] results, String[][] summary, int totalGames) {
        System.out.println("\nGame\tUser\tComputer\tWinner");
        for (int i = 0; i < totalGames; i++)System.out.println((i+1) + "\t" + results[i][0] + "\t" + results[i][1] + "\t\t" + results[i][2]);
        System.out.println("\nSummary:");
        System.out.println("Player\tWins\tWin%");
        for (int i = 0; i < 3; i++) System.out.println(summary[i][0] + "\t" + summary[i][1] + "\t" + summary[i][2]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int totalGames = sc.nextInt();
        sc.nextLine();
        String[][] results = new String[totalGames][3];
        for (int i = 0; i < totalGames; i++) {
            System.out.print("Game " + (i+1) + " - Enter your choice (rock/paper/scissors): ");
            String userChoice = sc.nextLine().toLowerCase();
            String computerChoice = getComputerChoice();
            String winner = getWinner(userChoice, computerChoice);
            results[i][0] = userChoice;
            results[i][1] = computerChoice;
            results[i][2] = winner;
        }
        String[][] summary = getGameResults(results, totalGames);
        displayResults(results, summary, totalGames);
    }
}
