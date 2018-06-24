package com.infoshare.workshops;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Aplikacja do zarządzania magazynem");
        showMenu();

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        if (choice.equals("1")) {
            System.out.println("Towary w magazynie:");
            WarehouseState state = new WarehouseState();
            state.init();
            state.showReport();
        } else {
            System.out.println("Koniec programu");
        }
    }

    public static void showMenu() {
        System.out.println("Wybierz opcję:");
        System.out.println("1 - wypisanie towarów z magazynu");
    }
}