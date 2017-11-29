package ru.bstu.iitus.vt41.bli;

import lombok.Setter;
import lombok.ToString;

import java.util.Scanner;

@Setter
@ToString(callSuper = true)
public class TennisBall extends Ball {
    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
    }
}
