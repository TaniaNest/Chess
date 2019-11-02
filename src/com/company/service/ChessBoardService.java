package com.company.service;

import com.company.model.ChessBoardModel;

public class ChessBoardService {

    private StringBuilder str = new StringBuilder();

    public String chessBoard(ChessBoardModel param) {
        for (int i = 0; i < param.getHeight(); i++) {
            for (int j = 0; j < param.getWidth(); j++) {
                if ((i + j) % 2 == 1) {
                    str.append(' ');
                } else {
                    str.append('*');
                }
            }
            str.append('\n');
        }

        return str.toString();
    }
}
