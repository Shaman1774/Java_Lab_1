package ru.bstu.iitus.vt41.bli;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Scanner;

@Getter
@Setter
@ToString(callSuper = true)
public class Coaching extends SportsEquipment {

    protected int weight;

    @Override
    public void init(Scanner scanner) {
        System.out.println("Введите тип инвентаря ");
        this.setSportType(scanner.nextLine());
        System.out.println("Введите название производителя ");
        this.setName(scanner.nextLine());
        System.out.println("Введите вес инвентаря ");
        this.setWeight(scanner.nextInt());
        scanner.nextLine();
    }
}
