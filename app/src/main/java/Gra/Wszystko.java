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
    public static Czas arkaGdynia;
    public static int dzień=1;
    public static int godzina=12;



    public static File zapis;
    public static File questy;
    public static File lok;
    public static File item;
    public static void saveTheGame() throws IOException {

        new FileOutputStream(zapis).write(player.getAllData().getBytes());
        new FileOutputStream(questy).write(Quests.exportDane().getBytes());
        new FileOutputStream(lok).write(lokacja.getBytes());
        new FileOutputStream(item).write(Itemss.save().getBytes());
    }
    public static void wczytajGrę() throws FileNotFoundException {
        player.wczytajDane(zapis);
        Quests.importDane(questy);
        lokacja= new Scanner(lok).next();
        Itemss.wczytaj(item);
    }

}
