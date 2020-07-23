package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        ArrayList<String> words=new ArrayList<String>();
        ArrayList<String> hint1 = new ArrayList<String>();
        words.add("MICROSOFT"); hint1.add("Windows OS");
        words.add("AMAZON");  hint1.add("Online Shopping");
        words.add("INFOSYS");  hint1.add("Mass Recruitment");
        words.add("ADOBE");    hint1.add("Photohop");
        words.add("WIPRO");    hint1.add("Personal Care");
        words.add("APPLE");     hint1.add("iPhone");
        words.add("GOOGLE");     hint1.add("Android OS");
        String s=" ";
        int genRandom=random.nextInt(words.size());
        s=words.get(genRandom);
        int len=s.length();
        System.out.println(s);
        char hidden[] =new char[len];
        for(int i=0;i<len;i++){
            hidden[i]='#';
        }
        System.out.println("MAKE A CHOICE");
        System.out.println("1--> GUESS THE LETTER");
        System.out.println("2--> HINT 1");
        System.out.println("3--> HINT 2");
        for(int i=3;i>0;i--) {
            System.out.print("LIVES REMAINING");
            for (int j = 0; j < i; j++) {
                System.out.print(" ♥ ");
            }
            System.out.println();
            System.out.println(hidden);
            System.out.println("MAKE A CHOICE");

            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter The Letter ==> ");
                    char input = sc.next().charAt(0);
                    for (int j=0;j <len; j++) {
                        if (s.charAt(j) == input) {
                            hidden[j] = input;
                            if(i<=3){
                                i++;
                            }
                        }
                    }
                    System.out.println(hidden);
                    break;
                case 2:
                    System.out.println("Your Hint Is ::"+hint1.get(genRandom));
                    break;
                    }
            }
        }








    }

