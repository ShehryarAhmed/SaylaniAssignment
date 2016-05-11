package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
             // write your code /**

                final int num = 6;
                int getnum,i=0;
                String name,game;
                char getchar=' ';
                do {


                    game = "\n \n \t \t \t Number  GAME!!!";
                    Scanner getval = new Scanner(System.in);
                    System.out.println(game);
                    System.out.print("Enter Gamer Name : ");
                    name  = getval.nextLine();
                    System.out.println("Now Game Start...");
                    System.out.println("\n\t\tEnter Number Between \'0\' To \'9\'");
                    getnum = getval.nextInt();

                    switch (getnum) {
                        case num:
                            System.out.println("\t\tYou Win Hurry!!!");
                            //getnum = null;

                            //System("pause");
                            break;
                        case 2:
                            System.out.println("\t\tYou lose Opps...");
                            //getnum = null;
                            break;
                        default:
                            System.out.println("Not Recoginnzed ");
                    }

                    System.out.println("Do You Want To more press Y");

                    i++;
                }
                while((getchar == 'y'||getchar == 'Y')&& i<4);


            }

        }



