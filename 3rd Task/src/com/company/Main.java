package com.company;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner getchar = new Scanner(System.in);
        System.out.println("\n\t\t Find character ");
        System.out.println("Enter Character :  ");
        String chara = getchar.nextLine();
        System.out.println("Which character You find");
        String findchara = getchar.nextLine();
        char ch = findchara.charAt(0);
        int count = 0;
        for(int i =0 ; i<chara.length();i++){
      if(ch==chara.charAt(i)){
         count++;
          }

        }
        if(count != 0){
            System.out.println("This Character is available for above String : " +"\'" + ch + "\' Is" + count
            + "Timmes");
        }
        else{
            System.out.println("opps!!!");
        }


    }
}
