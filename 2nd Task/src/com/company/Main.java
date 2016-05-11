package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
        int jj = 0;
        Scanner getnum = new Scanner(System.in);
        System.out.println("\n\t\tGenerated Prime Number for 0 To 1000!!. ");
        int generateprimenum[] = new  int[1000];
        for(int i = 3; i<=1000; i++) {
            int count = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    count += 1;
                }
            }
            if (count == 2) {
                generateprimenum[jj] = i;
                jj++;
            }
        }
        System.out.println("\t\tenter the Size Of Series Of Primer Numbers.. : ");
        int getval = getnum.nextInt();

        for(int i = 0; i<getval ; i++){
            System.out.println("Prime Number : " + generateprimenum[i]);
        }

    }
}
