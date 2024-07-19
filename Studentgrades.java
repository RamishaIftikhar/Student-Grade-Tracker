import java.util.Scanner;
import java.util.ArrayList;

public class Studentgrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> grades = new ArrayList<>();

        System.out.println("Enter the number of students: ");
        int totalStudents = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < totalStudents; i++) {
            System.out.println("Enter the grade for student " + (i + 1) + " (A, B, C, D, F): ");
            String grade = scanner.nextLine().toUpperCase();
            grades.add(grade);
        }

        double sum = 0.0;
        int highest = convertGrade(grades.get(0));
        int lowest = convertGrade(grades.get(0));

        for (String grade : grades) {
            int g = convertGrade(grade);
            if (g > highest) {
                highest = g;
            }
            if (g < lowest) {
                lowest = g;
            }
            sum += g;
        }

        double average = sum / grades.size();

        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
    }

    private static int convertGrade(String grade) {
        switch (grade) {
            case "A": return 90;
            case "B": return 80;
            case "C": return 70;
            case "D": return 60;
            case "F": return 50;
            default: return 0;
        }
    }

}
