package com.company.controller;

import com.company.model.Model;
import com.company.util.Info;
import com.company.util.Input;
import com.company.util.Instruction;
import com.company.util.Validator;

public class Controller {

    Instruction instruction=new Instruction();
    Input input= new Input();
    Info info= new Info();
    Validator validator= new Validator();


    public int  runWidth() {
        boolean flag;
        int number;
        do {
            System.out.print(info.getInfo("width"));
            number = input.getNumber();
            if (validator.isPositiveNumber(number)) {
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
            System.out.print(info.getInfo("height"));
            number = input.getNumber();
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

}
