package ru.bstu.iitus.vt41.bli;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Scanner;


@Getter
@Setter
@ToString
public abstract class SportsEquipment {

    protected String sportType;
    protected String name;

    public abstract void init(Scanner scanner);
}
