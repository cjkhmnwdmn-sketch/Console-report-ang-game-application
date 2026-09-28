/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consoleapplication;

import java.util.Scanner;

interface IConsoles {
    String getConsoleType();
    String getStore();
    int getTotalSales();
}

abstract class Consoles implements IConsoles {
    private String consoleType;
    private String storeName;
    private int totalSales;

    public Consoles(String consoleType, String storeName, int totalSales) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public String getStore() {
        return storeName;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }
}

class ConsoleSales extends Consoles {

    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }

    public void displayReport() {
        System.out.println("--------------------------------------------------");
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("--------------------------------------------------");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE NAME: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
        System.out.println("--------------------------------------------------");
    }
}

public class Consoleapplication {

    public static void main(String[] args) {
        String[] cities = new String[3];
        String[] consoles = new String[3];
        int[][] sales = new int[3][3];

        consoles[0] = "PS5";
        consoles[1] = "XBOX";
        consoles[2] = "SWITCH";

        cities[0] = "CAPE TOWN";
        cities[1] = "PORT ELIZABETH";
        cities[2] = "PRETORIA";

        sales[0][0] = 1000; sales[0][1] = 2000; sales[0][2] = 3000;
        sales[1][0] = 2000; sales[1][1] = 3000; sales[1][2] = 4000;
        sales[2][0] = 1500; sales[2][1] = 1100; sales[2][2] = 1200;

        System.out.println("--------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-18s %-8s %-8s %-8s%n", "", consoles[0], consoles[1], consoles[2]);

        System.out.printf("%-18s %-8d %-8d %-8d%n", cities[0], sales[0][0], sales[0][1], sales[0][2]);
        System.out.printf("%-18s %-8d %-8d %-8d%n", cities[1], sales[1][0], sales[1][1], sales[1][2]);
        System.out.printf("%-18s %-8d %-8d %-8d%n", cities[2], sales[2][0], sales[2][1], sales[2][2]);

        System.out.println("--------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("--------------------------------------------------");

        int totalCapeTown = sales[0][0] + sales[0][1] + sales[0][2];
        int totalPortElizabeth = sales[1][0] + sales[1][1] + sales[1][2];
        int totalPretoria = sales[2][0] + sales[2][1] + sales[2][2];

        System.out.printf("%-18s %-8d%n", cities[0], totalCapeTown);
        System.out.printf("%-18s %-8d%n", cities[1], totalPortElizabeth);
        System.out.printf("%-18s %-8d%n", cities[2], totalPretoria);

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

        System.out.println("--------------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + topCity);
        System.out.println("--------------------------------------------------\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the console device type: ");
        String consoleType = scanner.nextLine();

        System.out.print("Enter the store name: ");
        String storeName = scanner.nextLine();

        System.out.print("Enter the total amount of sales: ");
        int totalSales = scanner.nextInt();

        ConsoleSales salesReport = new ConsoleSales(consoleType, storeName, totalSales);

        System.out.println();
        salesReport.display11Report();

        scanner.close();
    }
}