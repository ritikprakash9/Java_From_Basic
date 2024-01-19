package Java01_Basic;

import java.util.Scanner;

public class con01_DataType {
    public static void main(String[] args) {
        /*
        Data Type in Java
        1. Primitive Data Type -> (boolean, char, byte, short, int, long, double, float)
        2. Non-Primitve -> (String, Array)
         */

        /*
        Write a Java Program to calculate percentage of a given student in CBSE board Exam.
        His marks from 5 Subject must be taken as input.
        => Note: return marks upto 2 decimal places

        input1: 56.8 89.8 95.4 33.2 45.4

        output:
         */

        Scanner sc = new Scanner(System.in); // To take input we need to import scanner class

        double sub1 = sc.nextDouble();
        double sub2 = sc.nextDouble();
        double sub3 = sc.nextDouble();
        double sub4 = sc.nextDouble();
        double sub5 = sc.nextDouble();

        double marks =  sub1 + sub2 + sub3 + sub4 + sub5;

        double percentage = marks/5;

        System.out.printf("%.2f", percentage);
    }
}
