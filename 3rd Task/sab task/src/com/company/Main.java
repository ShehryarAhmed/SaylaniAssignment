package com.company;
import java.awt.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    char getnum;
    int firstval,second ;
        Scanner getval = new Scanner(System.in);
        System.out.println("Enter Number Like 25 ,15...");
        getnum = getval.next().charAt(0);
        firstval = getnum;
        System.out.println(firstval);
    }
}
