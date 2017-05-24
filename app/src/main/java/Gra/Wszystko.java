package Gra;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by Użytkownik on 2017-05-24.
 */
public class Wszystko {
    public static Player player;

    public static void saveTheGame() throws FileNotFoundException {
        File zapis=new File("save");
        File questy=new File("quests");
        new PrintWriter(zapis).write(player.getAllData());
        new PrintWriter(questy).write(Quests.exportDane());
    }
}
