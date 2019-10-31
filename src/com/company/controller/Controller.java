package com.company.controller;

import com.company.model.Model;
import com.company.service.ChessBoard;
import com.company.util.Info;
import com.company.util.Input;
import com.company.util.Instruction;
import com.company.util.Validator;

public class Controller {

    private Instruction instruction = new Instruction();
    private Info info = new Info();
    private Validator validator = new Validator();
    private ChessBoard service = new ChessBoard();

    public void run() {
        Model model = new Model(createSide("width"), createSide("height"));
        service.chessBoard(model);
    }

    private int createSide(String param) {
        info.getInfo(param);
        int number = new Input().getNumber();
        while (!validator.isPositiveNumber(number)) {
            instruction.getInstruction();
            number = new Input().getNumber();
        }
        return number;
    }


}
