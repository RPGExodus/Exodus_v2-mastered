package Gra;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Raver on 2017-05-23.
 */
public enum Quests {

    STATEK(false, false),
    PORT_KUPCY(false, true),
    PEST_GILDIA_NAJEMNICY(false, false),
    PEST_ZAGINIONY_KOWAL(false, true),
    PEST_GREG_WILK(false, true),
    PEST_KONKURENCJA(false,true),
    PEST_KARAWANA_do_Frount(false,false),
    PEST_REKRUTACJA_DO_STRAZY_MIEJSKIEJ(false, false),
    PEST_KARCZMA_PRZYJACIEL_CHOPINA(false, true);
    public boolean completed, available;

    Quests(boolean completed, boolean available) {
        this.completed = completed;
        this.available = available;
    }

    public static String exportDane() {
        String dane = "";
        for (Quests q : Quests.values()) {
            dane += (q.completed == false) ? 0 : 1;
            dane += ' ';
            dane += (q.available == false) ? 0 : 1;
            dane += '\n';
        }
        return dane;
    }

    public static void importDane(File dane) throws FileNotFoundException {
        Scanner in = new Scanner(dane);
        for (Quests q : Quests.values()) {
            q.completed = (in.nextInt() == 0) ? false : true;
            q.completed = (in.nextInt() == 0) ? false : true;

        }
    }

    public void edit(boolean com, boolean ava) {
        completed = com;
        available = ava;
    }
}
