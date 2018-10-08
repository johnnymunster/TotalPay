/*
PayApp.java
J Munster
8 10 2018
*/

import java.util.*;

public class PayApp{
    public static void main(String[] args) {
        //declaring variables
        double basicRate;
        double basicHours;
        double overTimeHours;
        double basicPay;
        double overTimePay;
        double totalPay;

        //objects - external(require the Scanner and Instan class)
        Scanner keyboard;
        keyboard=new Scanner(System.in);
        Pay myPay;
        myPay=new Pay();

        //Input
        //ask the question
        System.out.println("Enter Basic Pay Rate:");
        //store the answer
        basicRate=keyboard.nextDouble();
        myPay.setBasicRate(basicRate);

		//ask the question
        System.out.println("Enter Basic Number of Hours:");
        //store the answer
        basicHours=keyboard.nextDouble();
        myPay.setBasicHours(basicHours);

		//ask the question
        System.out.println("Enter Overtime Number of Hours:");
        //store the answer
        overTimeHours=keyboard.nextDouble();
        myPay.setOverTimeHours(overTimeHours);

        //compute - calcs on Instan class
        myPay.compute();

        //Output
        //returning basicPay hours
        basicPay=myPay.getBasicPay();
        //returning overTimePay hours
        overTimePay=myPay.getOverTimePay();
        //returning totalPay hours
        totalPay=myPay.getTotalPay();

        System.out.println("Total basic Pay = " + basicPay);
        System.out.println("Total overtime Pay = " + overTimePay);
        System.out.println("Total Pay = " + totalPay);
    }
}//ends class