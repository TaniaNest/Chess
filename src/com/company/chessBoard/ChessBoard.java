package com.company.chessBoard;

import com.company.model.Model;

public class ChessBoard {

    public String chessBoard(int height,int width) {

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i + j)% 2 == 1) {
                    System.out.print(' ');
                } else {
                    System.out.print('*');
                }
            }
            System.out.println();
        }
        return "";
    }
}
