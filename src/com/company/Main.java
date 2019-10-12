package com.company;

import com.company.chessBoard.ChessBoard;
import com.company.controller.Controller;
import com.company.model.Model;

public class Main  {

    private static Model model;

    public static void main(String[] args) {
        ChessBoard board=new ChessBoard();
        System.out.println(board.chessBoard(new Controller().runWidth(),new Controller().runHeight()));}


    }

