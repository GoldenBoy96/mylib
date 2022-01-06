/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylib.util;

import java.util.Scanner;

/**
 *
 * @author Huu Minh
 */
public class Input {

    private static final Scanner SC = new Scanner(System.in);

    public static int inputInteger(String inputMsg, String outputMsg, String reInputMsg) {
        int input = 0;

        System.out.print(inputMsg);
        while (true) {
            try {
                input = Integer.parseInt(SC.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.print(reInputMsg);
            }
        }
        outputMsg = outputMsg.trim();
        if (!outputMsg.equals("")) {
            System.out.println(outputMsg);
        }
        return input;
    }

    public static int inputInteger(String inputMsg, String outputMsg, String reInputMsg, int bottomValue, int topValue) {
        int input = 0;
        if (bottomValue > topValue) {
            int t = bottomValue;
            bottomValue = topValue;
            topValue = t;
        }
        System.out.print(inputMsg);
        while (true) {
            try {
                input = Integer.parseInt(SC.nextLine());
                if (bottomValue != topValue) { //default infinity
                    if (input >= bottomValue && input <= topValue) {
                        break;
                    } else {
                        System.out.print("Please input an integer between " + bottomValue + " and " + topValue + ": ");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.print(reInputMsg);
            }
        }
        outputMsg = outputMsg.trim();
        if (!outputMsg.equals("")) {
            System.out.println(outputMsg);
        }
        return input;
    }

    public static double inputDouble(String inputMsg, String outputMsg, String reInputMsg) {
        double input = 0;

        System.out.print(inputMsg);
        while (true) {
            try {
                input = Double.parseDouble(SC.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.print(reInputMsg);
            }
        }
        outputMsg = outputMsg.trim();
        if (!outputMsg.equals("")) {
            System.out.println(outputMsg);
        }
        return input;
    }

    public static double inputDouble(String inputMsg, String outputMsg, String reInputMsg, double bottomValue, double topValue) {
        double input = 0;
        if (bottomValue > topValue) {
            double t = bottomValue;
            bottomValue = topValue;
            topValue = t;
        }
        System.out.print(inputMsg);
        while (true) {
            try {
                input = Double.parseDouble(SC.nextLine());
                if (bottomValue != topValue) { //default infinity
                    if (input >= bottomValue && input <= topValue) {
                        break;
                    } else {
                        System.out.print("Please input an Double between " + bottomValue + " and " + topValue + ": ");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.print(reInputMsg);
            }
        }
        outputMsg = outputMsg.trim();
        if (!outputMsg.equals("")) {
            System.out.println(outputMsg);
        }
        return input;
    }
    
    public static String inputString(String inputMsg, String outputMsg, String reInputMsg) {
        String input = null;
        System.out.print(inputMsg);
        while (true) {
            try {
                input = SC.nextLine();
                break;               
            } catch (NumberFormatException e) {
                System.out.print(reInputMsg);
            }
        }
        outputMsg = outputMsg.trim();
        if (!outputMsg.equals("")) {
            System.out.println(outputMsg);
        }
        return input;
    }
    
}
