                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


       
       package com.mycompany.gameconsolereport;

public class Gameconsolereport {

    public static void main(String[] args) {
        // Step 1: Declare arrays
        String[] cities = new String[3];
        String[] consoles = new String[3];
        int[][] sales = new int[3][3];

        // Step 2: Assign console headers
        consoles[0] = "PS5";
        consoles[1] = "XBOX";
        consoles[2] = "SWITCH";

        // Step 3: Assign cities
        cities[0] = "CAPE TOWN";
        cities[1] = "PORT ELIZABETH";
        cities[2] = "PRETORIA";

        // Step 4: Assign sales values
        sales[0][0] = 1000;
        sales[0][1] = 2000;
        sales[0][2] = 3000;

        sales[1][0] = 2000;
        sales[1][1] = 3000;
        sales[1][2] = 4000;

        sales[2][0] = 1500;
        sales[2][1] = 1100;
        sales[2][2] = 1200;

        // Step 5: Display header & columns
        System.out.println("--------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-18s %-8s %-8s %-8s%n", "", consoles[0], consoles[1], consoles[2]);

        // Step 6: Display row data
        System.out.printf("%-18s %-8d %-8d %-8d%n", cities[0], sales[0][0], sales[0][1], sales[0][2]);
        System.out.printf("%-18s %-8d %-8d %-8d%n", cities[1], sales[1][0], sales[1][1], sales[1][2]);
        System.out.printf("%-18s %-8d %-8d %-8d%n", cities[2], sales[2][0], sales[2][1], sales[2][2]);

        // Step 7: Display totals header
        System.out.println("--------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("--------------------------------------------------");

        // Step 8: Calculate totals
        int totalCapeTown = sales[0][0] + sales[0][1] + sales[0][2];
        int totalPortElizabeth = sales[1][0] + sales[1][1] + sales[1][2];
        int totalPretoria = sales[2][0] + sales[2][1] + sales[2][2];

        System.out.printf("%-18s %-8d%n", cities[0], totalCapeTown);
        System.out.printf("%-18s %-8d%n", cities[1], totalPortElizabeth);
        System.out.printf("%-18s %-8d%n", cities[2], totalPretoria);

        // Step 9: Determine top city
        int maxSales = totalCapeTown;
        String topCity = cities[0];

        if (totalPortElizabeth > maxSales) {
            maxSales = totalPortElizabeth;
            topCity = cities[1];
        }

        if (totalPretoria > maxSales) {
            maxSales = totalPretoria;
            topCity = cities[2];
        }

        // Step 10: Display final result
        System.out.println("--------------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + topCity);
        System.out.println("--------------------------------------------------");
    }
}
public interface Iconsoles {
    String getConsoleType

}
