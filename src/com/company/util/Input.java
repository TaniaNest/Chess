package com.company.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);

    public int getNumber() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }
}
