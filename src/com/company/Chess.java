package com.company;

public class Chess {

    private int width;
    private int height;

    Chess(){}

    Chess(int w, int h){
        width=w;
        height=h;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String chessBoard() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i + j)% 2 == 1) {
                    System.out.print(' ');
                } else {
                    System.out.print('*');
                }
            }
            System.out.print('\n');
        }
        return "";
    }
}
