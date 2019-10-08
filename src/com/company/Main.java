package com.company;

import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        int width ;

        Scanner h = new Scanner(System.in);
        int height;

        System.out.print("Input the width: ");
        width = w.nextInt();

        while (width <= 0 ){
            System.out.print("Input positive number: ");
            while (!w.hasNextInt()) {
                System.out.println("Incorrect value. Input value more than 0 ");
                w.next();
                System.out.print("Input the width: ");
            }

             width = w.nextInt();
        }

        System.out.print("Input the height: ");
        height = h.nextInt();
        while (height <= 0) {
            System.out.print("Input positive number: ");
            while (!h.hasNextInt()) {
                System.out.println("Incorrect value. Input value more than 0 ");
                System.out.print("Input the height: ");
                h.next();
            }
            height = h.nextInt();

        }


        Chess board= new Chess(width, height);
        System.out.println(board.chessBoard());}


    }

