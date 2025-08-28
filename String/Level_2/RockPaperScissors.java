import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();

        String[][] results = new String[n][3];
        int userWins = 0, compWins = 0, draws = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String userChoice = sc.next().toLowerCase();
            String compChoice = computerChoice();

            String winner = findWinner(userChoice, compChoice);
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
            else draws++;

            results[i][0] = userChoice;
            results[i][1] = compChoice;
            results[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, compWins, draws, n);
        displayResults(results, stats);
    }

    static String computerChoice() {
        int choice = (int)(Math.random() * 3);
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }

    static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("scissors") && comp.equals("paper")) ||
            (user.equals("paper") && comp.equals("rock"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    static String[][] calculateStats(int userWins, int compWins, int draws, int total) {
        String[][] stats = new String[3][3];
        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.valueOf((userWins * 100) / total) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.valueOf((compWins * 100) / total) + "%";

        stats[2][0] = "Draws";
        stats[2][1] = String.valueOf(draws);
        stats[2][2] = String.valueOf((draws * 100) / total) + "%";

        return stats;
    }

    static void displayResults(String[][] results, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("User\tComputer\tWinner");
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i][0] + "\t" + results[i][1] + "\t\t" + results[i][2]);
        }

        System.out.println("\nStats:");
        System.out.println("Player\tWins\tPercentage");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }
}
