package com.example.java;

import java.text.NumberFormat;

import java.util.Scanner;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter price of individual items, enter a zero when complete.");

        Scanner in = new Scanner(System.in);

        ArrayList<Double> values = new ArrayList<>();

        Boolean stop=false;


        while (stop==false) {

            values.add(in.nextDouble());

            stop=in.hasNext("0");

        }

       double sum=0;

        for (int e = 0; e<values.size();e++){
           double totalevent = values.stream().mapToDouble(f -> f).sum();
            sum = totalevent;
        }

        double total=sum;
        double tax= sum*.025;
        double totalWithTax = total + (total * .025);
        double tip=totalWithTax*.175;
        String fSum;
        String fTax;
        String fTotalWithTax;
        String fTip;

        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setGroupingUsed(true);
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);

        fSum = nf.format(total);
        fTax=nf.format(tax);
        fTotalWithTax=nf.format(totalWithTax);
        fTip=nf.format(tip);


        System.out.println("Subtotal is $"+ fSum);
        System.out.println("Tax is $"+ fTax);
        System.out.println("Total with tax is $"+ fTotalWithTax);
        System.out.println(" Tip should be $"+fTip);


    }




        //dou/ble[] numbers = new double[i];

    }

