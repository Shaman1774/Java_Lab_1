package ru.bstu.iitus.vt41.bli;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Scanner;

@Setter
@Getter
@ToString(callSuper = true)
public class Ball extends SportsEquipment {

    protected int radius;

    @Override
    public void init(Scanner scanner) {
        System.out.println("Вводите тип инвентаря ");
        setSportType(scanner.nextLine());
        System.out.println("Введите название производителя ");
        this.setName(scanner.nextLine());
        System.out.println("Вводите радиус мяча ");
        this.radius = scanner.nextInt();
        scanner.nextLine();
    }
}
