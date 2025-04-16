import java.util.Scanner;
import java.util.Random;
public class Subjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        int[][] scores = generateRandomScores(numStudents);
        double[][] calculations = calculateResults(scores);
        String[][] grades = calculateGrades(calculations);
        displayScorecard(scores, calculations, grades);
    }
    public static int[][] generateRandomScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = random.nextInt(50) + 50;
            scores[i][1] = random.nextInt(50) + 50;
            scores[i][2] = random.nextInt(50) + 50;
        }
        return scores;
    }
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = average;
            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }
    public static String[][] calculateGrades(double[][] calculations) {
        String[][] grades = new String[calculations.length][2];
        for (int i = 0; i < calculations.length; i++) {
            double percentage = calculations[i][2];
            if (percentage >= 80) {
                grades[i][0] = "A";
                grades[i][1] = "Level 4, above agency-normalized standards";
            } else if (percentage >= 70) {
                grades[i][0] = "B";
                grades[i][1] = "Level 3, at agency-normalized standards";
            } else if (percentage >= 60) {
                grades[i][0] = "C";
                grades[i][1] = "Level 2, below, but approaching agency-normalized standards";
            } else if (percentage >= 50) {
                grades[i][0] = "D";
                grades[i][1] = "Level 1, well below agency-normalized standards";
            } else if (percentage >= 40) {
                grades[i][0] = "E";
                grades[i][1] = "Level 1-, too below agency-normalized standards";
            } else {
                grades[i][0] = "R";
                grades[i][1] = "Remedial standards";
            }
        }
        return grades;
    }
    public static void displayScorecard(int[][] scores, double[][] calculations, String[][] grades) {
        System.out.println("\nScorecard:");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade\tRemarks");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t%.2f\t%.2f%%\t%s\t%s%n",
                    i+1, scores[i][0], scores[i][1], scores[i][2],
                    calculations[i][0], calculations[i][1], calculations[i][2],
                    grades[i][0], grades[i][1]);
        }
    }
}