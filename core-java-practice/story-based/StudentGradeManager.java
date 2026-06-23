import java.io.*;
import java.util.*;

public class StudentGradeManager {

    static String[] names = new String[100];
    static int[] totals = new int[100];
    static double[] averages = new double[100];
    static char[] grades = new char[100];
    static int count = 0;

    public static void main(String[] args) {

        readStudents("students.txt");

        System.out.println("Student Records:");
        displayStudents();

        System.out.println("\nSearching for Rahul:");
        searchStudent("Rahul");

        bubbleSort();

        System.out.println("\nAfter Sorting by Total Marks:");
        displayStudents();

        writeReport("report.txt");
    }

    static void readStudents(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String name = data[0];

                int total = 0;

                for (int i = 1; i <= 5; i++) {
                    total += Integer.parseInt(data[i]);
                }

                double avg = total / 5.0;
                char grade = calculateGrade(avg);

                names[count] = name;
                totals[count] = total;
                averages[count] = avg;
                grades[count] = grade;

                count++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid marks format.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }

    static char calculateGrade(double avg) {

        if (avg >= 90) {
            return 'A';
        } else {
            if (avg >= 75) {
                return 'B';
            } else {
                if (avg >= 60) {
                    return 'C';
                } else {
                    if (avg >= 40) {
                        return 'D';
                    } else {
                        return 'F';
                    }
                }
            }
        }
    }

    static void searchStudent(String name) {

        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                System.out.println(
                        names[i] + " Total: " + totals[i] +
                        " Average: " + averages[i] +
                        " Grade: " + grades[i]
                );
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

    static void bubbleSort() {

        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {

                if (totals[j] < totals[j + 1]) {

                    int tempTotal = totals[j];
                    totals[j] = totals[j + 1];
                    totals[j + 1] = tempTotal;

                    double tempAvg = averages[j];
                    averages[j] = averages[j + 1];
                    averages[j + 1] = tempAvg;

                    char tempGrade = grades[j];
                    grades[j] = grades[j + 1];
                    grades[j + 1] = tempGrade;

                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }
    }

    static void displayStudents() {

        for (int i = 0; i < count; i++) {
            System.out.println(
                    names[i] +
                    " | Total: " + totals[i] +
                    " | Average: " + averages[i] +
                    " | Grade: " + grades[i]
            );
        }
    }

    static void writeReport(String fileName) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {

            bw.write("STUDENT REPORT");
            bw.newLine();
            bw.write("==============================");
            bw.newLine();

            for (int i = 0; i < count; i++) {

                bw.write(
                        names[i] +
                        " | Total: " + totals[i] +
                        " | Average: " + averages[i] +
                        " | Grade: " + grades[i]
                );

                bw.newLine();
            }

            System.out.println("\nReport written successfully.");

        } catch (IOException e) {
            System.out.println("Error writing report file.");
        }
    }
}