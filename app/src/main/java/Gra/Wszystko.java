package Gra;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Użytkownik on 2017-05-24.
 */
public class Wszystko {
    public static Player player;
    public static String lokacja;

    public static File zapis;
    public static File questy;
    public static File lok;
    public static void saveTheGame() throws FileNotFoundException {
        new PrintWriter(zapis).write(player.getAllData());
        new PrintWriter(questy).write(Quests.exportDane());
        new PrintWriter(lok).write(lokacja);
    }
    public static void wczytajGrę() throws FileNotFoundException {
        player.wczytajDane(zapis);
        Quests.importDane(questy);
        lokacja= new Scanner(lok).next();
    }
}
