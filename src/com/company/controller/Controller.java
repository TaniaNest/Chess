package com.company.controller;

import com.company.model.Model;
import com.company.util.Info;
import com.company.util.Input;
import com.company.util.Instruction;
import com.company.util.Validator;

public class Controller {

    private Model model;
    private Instruction instruction;
    private Input input;
    private Info info;
    private Validator validator;


    public int  runWidth() {
        boolean flag;
        int number;
        do {
            new Info().getInfo("width");
            number = new Input().getNumber();
            if (new Validator().isPositiveNumber(number)) {
                flag = true;
                return number;
            } else {
                instruction.getInstruction();
                flag = false;
            }
        }
        while (flag == false);

return 0;
    }

    public int  runHeight() {
        boolean flag;
        int number;
        do {
            new Info().getInfo("height");
            number = new Input().getNumber();
            if (new Validator().isPositiveNumber(number)) {
                flag = true;
                return number;
            } else {
                new Instruction().getInstruction();
                flag = false;
            }
        }
        while (flag == false);
return 0;
    }

}
