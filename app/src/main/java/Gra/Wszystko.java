package Gra;

import android.content.Context;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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
    public static void saveTheGame() throws IOException {

        new FileOutputStream(zapis).write(player.getAllData().getBytes());
        new FileOutputStream(questy).write(Quests.exportDane().getBytes());
        new FileOutputStream(lok).write(lokacja.getBytes());
    }
    public static void wczytajGrę() throws FileNotFoundException {
        player.wczytajDane(zapis);
        Quests.importDane(questy);
        lokacja= new Scanner(lok).next();
    }
}
