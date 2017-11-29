package ru.bstu.iitus.vt41.bli;

import lombok.ToString;

import java.util.Scanner;

@ToString
public class Javelin extends SportsEquipment {

    @Override
    public void init(Scanner scanner) {
        System.out.println("Введите тип инвентаря ");
        this.setSportType(scanner.nextLine());
        System.out.println("Введите название производителя ");
        this.setName(scanner.nextLine());
    }
}
