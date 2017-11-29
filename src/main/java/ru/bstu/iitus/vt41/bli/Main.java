package ru.bstu.iitus.vt41.bli;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите колличество спортивного инвентаря ");
        int count = Integer.parseInt(scanner.nextLine());
        SportsEquipment[] sportsEquipments = new SportsEquipment[count];
        initSportsEqs(sportsEquipments);
    }

    private static void initSportsEqs(SportsEquipment[] sportsEquipments) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < sportsEquipments.length; i++) {

            System.out.print("Выберете тип инвентаря: \n"
                    + "1 - Волейбольный_мяч;\n"
                    + "2 - Теннисный_мяч;\n"
                    + "3 - Ракетка;\n"
                    + "4 - Метательное_копье;\n"
                    + "5 - Штанга;\n"
                    + "6 - Гиря;\n");

            sportsEquipments[i] = createEquipment(scanner);
            sportsEquipments[i].init(scanner);
        }
        ArrayList<SportsEquipment> tennis = anTennis(sportsEquipments);

        System.out.println("Инвентарь, относящийся к теннису:\n");
        for (SportsEquipment anTennis : tennis)
            System.out.println(anTennis.toString());
    }

    private static SportsEquipment createEquipment(Scanner scanner) {
        switch (Integer.parseInt(scanner.nextLine())) {
            case 1:
                return new VolleyBall();
            case 2:
                return new TennisBall();
            case 3:
                return new Racket();
            case 4:
                return new Javelin();
            case 5:
                return new Barbell();
            case 6:
                return new Poise();
            default:
                return null;
        }
    }

    private static ArrayList<SportsEquipment> anTennis(SportsEquipment[] sportsEquipments) {

        ArrayList<SportsEquipment> tennis = new ArrayList<SportsEquipment>();
        for (SportsEquipment anSportsEquipments : sportsEquipments)
            if (anSportsEquipments instanceof TennisBall || anSportsEquipments instanceof Racket)
                tennis.add(anSportsEquipments);
        return tennis;
    }
}
