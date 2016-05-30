package com.company;
import java.awt.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        char getnum;
        int firstval,second ;
        String Ones[] = {"Zero","one","two","three","four","five","six","seven","eight","nine"};
        String ten[] = {"one","ten","twenty","thirty","fourty","fivety","sixty","seventy","eighty","ninety","hundred"};

        Scanner getval = new Scanner(System.in);
        System.out.println("Enter Number Like 25 ,15...");
        int get = getval.nextInt();
        char  cast[] = String.valueOf(get).toCharArray();
        firstval = Integer.valueOf(cast[0]);
        second = Integer.valueOf(cast[1]);
        firstval -= 48;
        second -= 48;

        System.out.println(get + " : " + ten[firstval] + Ones[second]);
        System.out.println(firstval + " "+second);
    }
}
