package com.company.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    public int getNumber() {
        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }
}
