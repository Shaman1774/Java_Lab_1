package ru.bstu.iitus.vt41.bli;

import lombok.ToString;

import java.util.Scanner;

@ToString(callSuper = true)
public class Poise extends Coaching {

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
    }
}
