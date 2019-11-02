package com.company.controller;

import com.company.model.ChessBoardModel;
import com.company.service.ChessBoardService;
import com.company.util.Info;
import com.company.util.Input;
import com.company.util.Instruction;
import com.company.util.Validator;

public class ChessBoardController {

    private Instruction instruction = new Instruction();
    private Info info = new Info();
    private Validator validator = new Validator();
    private ChessBoardService service = new ChessBoardService();

    public void run() {
        ChessBoardModel chessBoardModel = new ChessBoardModel(getNumber("width"), getNumber("height"));
        info.getOutput(service.chessBoard(chessBoardModel));
    }

    private int getNumber(String param) {
        info.getInfo(param);
        int number = new Input().getNumber();
        while (!validator.isValidNumber(number)) {
            instruction.getInstruction();
            number = new Input().getNumber();
        }
        return number;
    }


}
