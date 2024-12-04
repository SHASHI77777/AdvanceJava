package advancejava;


import java.io.*;
import java.util.Scanner;

public class App {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Save Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Exit");
            int key = s.nextInt();
            switch (key) {
                case 1:
                    saveEmp();
                    break;
                case 2:
                    displayAllEmp();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid key. Please try again.");
            }
        }
    }

    public static void saveEmp() throws Exception {
        System.out.println("Enter ID:");
        int id = s.nextInt();
        System.out.println("Enter Name:");
        String name = s.next();
        System.out.println("Enter Email:");
        String email = s.next();
        System.out.println("Enter Phone:");
        long phone = s.nextLong();
        System.out.println("Enter Salary:");
        double salary = s.nextDouble();

        String emp = "ID: " + id + "\n" +
                     "Name: " + name + "\n" +
                     "Email: " + email + "\n" +
                     "Phone: " + phone + "\n" +
                     "Salary: " + salary + "\n\n";

        // Ensure the file path is correct
        File file = new File("/Users/shashisingh/Desktop/empdetails.txt"
        		+ "");

        // Write to the file
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write(emp);
            System.out.println("Employee details saved successfully.");
        }
    }

  public static void displayAllEmp() throws Exception {
        File file = new File("/Users/shashisingh/Desktop/empdetails.txt");

        // Read the file
        if (!file.exists()) {
            System.out.println("No employee records found.");
            return;
        }

        try (FileReader fr = new FileReader(file)) {
            int ch = fr.read();
            while (ch != -1) {
                System.out.print((char) ch);
                ch = fr.read();
            }
            System.out.println();
        }
    }
}
