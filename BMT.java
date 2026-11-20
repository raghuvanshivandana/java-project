	package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BMT {
    public static void main(String arg[]) {
        String name, user;
        int p = 1117, pass, choice, seat = 0, price = 0;
        String u = "juoct";
        String movieName = "";

        Scanner s = new Scanner(System.in);

        System.out.println("enter name");
        name = s.nextLine();

        System.out.println("enter username");
        user = s.nextLine();

        if (user.equals(u)) {
            System.out.println("enter password");
            pass = s.nextInt();
            if (p == pass) {
                System.out.println("1.DHURANDAR     230");
                System.out.println("2.WAR                    250");
                System.out.println("3.TOXIC                  300");
                System.out.println("4.SPIDERMAN       380");
                System.out.println("enter choice");
                choice = s.nextInt();

                // Determine price and movie name based on choice
                switch (choice) {
                    case 1:
                        movieName = "DHURANDAR";
                        price = 230;
                        break;
                    case 2:
                        movieName = "WAR";
                        price = 250;
                        break;
                    case 3:
                        movieName = "TOXIC";
                        price = 300;
                        break;
                    case 4:
                        movieName = "SPIDERMAN";
                        price = 380;
                        break;
                    default:
                        System.out.println("Movie not found");
                        
                }

                System.out.print("How many seats do you want to book? ");
                seat = s.nextInt();
                int totalAmount = seat * price;

                System.out.println("====================================");
                System.out.println("       TICKET BOOKED SUCCESSFULLY");
                System.out.println("====================================");
                System.out.println("Movie      : " + movieName);
                System.out.println("Seats      : " + seat);
                System.out.println("Total      : Rs. " + totalAmount);
                System.out.println("Status     : CONFIRMED");
                System.out.println("Thank you for booking with us!");
                System.out.println("====================================");
                String url = "jdbc:mysql://localhost:3306/stud";
                String query = "INSERT INTO customer (name,movieName,seat) VALUES (?, ?, ?)";

                try (Connection c = DriverManager.getConnection(url, "root", "4568Hell@");
                     PreparedStatement smt = c.prepareStatement(query)) {
                    
                    System.out.println("Database connection established.");
                    
                    // Bind your inputs safely to match your table columns
                    
                    smt.setString(1, name);
                    smt.setString(2, movieName);
                    smt.setInt(3, seat);
                    
                    smt.executeUpdate();
                    System.out.println("Record successfully created in database!");

                } catch (SQLException e) {
                    System.out.println("Database error: " + e.getMessage());
                }

            } else {
                System.out.println("please enter correct password");
            }
        } else {
            System.out.println("please enter correct username");
        }
        s.close();
    }
}
