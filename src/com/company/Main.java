package com.company;

import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {
        Scanner scanWidth = new Scanner(System.in);
        int width ;

        Scanner scanHeight = new Scanner(System.in);
        int height;

        System.out.print("Input the width: ");
        System.out.print("guhikhioi ");
        width = scanWidth.nextInt();

        while (width <= 0 ){
            System.out.print("Input positive number: ");
            while (!scanWidth.hasNextInt()) {
                System.out.println("Incorrect value. Input value more than 0 ");
                scanWidth.next();
                System.out.print("Input the width: ");
            }

             width = scanWidth.nextInt();
        }

        System.out.print("Input the height: ");
        height = scanHeight.nextInt();
        while (height <= 0) {
            System.out.print("Input positive number: ");
            while (!scanHeight.hasNextInt()) {
                System.out.println("Incorrect value. Input value more than 0 ");
                System.out.print("Input the height: ");
                scanHeight.next();
            }
            height = scanHeight.nextInt();

        }


        Chess board= new Chess(width, height);
        System.out.println(board.chessBoard());}


    }

