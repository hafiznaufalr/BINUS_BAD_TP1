package com.hafizbinusian;


import java.util.Scanner;

public class Main {

    public static void fahrenheitConverter() {
        double celciusToFahrenheitFormula = 9.0 / 5.0;

        Scanner input = new Scanner(System.in);
        System.out.print("Suhu dalam skala celcius: ");

        double calculate = celciusToFahrenheitFormula * input.nextInt() + 32;
        System.out.printf("Suhu dalam skala Fahrenheit = %s", calculate);
    }

    public static void calculatePPN() {
        int basePPN = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Total Pembelian (RP): ");

        int price = input.nextInt();
        int calculatePPN = basePPN * price / 100;
        int calculateTotal = price + calculatePPN;

        System.out.printf("PPN = %s", calculatePPN);
        System.out.printf("\nTotal pembayaran = %s", calculateTotal);
    }

    public static void main(String[] args) {
        // to run the apps just uncomment the needed function

        //fahrenheitConverter();
        //calculatePPN();
    }

}
