package com.company.service;

import com.company.model.Model;

public class ChessBoard {

    public String chessBoard(Model param) {

        for (int i = 0; i < param.getHeight(); i++) {
            for (int j = 0; j < param.getWidth(); j++) {
                if ((i + j) % 2 == 1) {
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
