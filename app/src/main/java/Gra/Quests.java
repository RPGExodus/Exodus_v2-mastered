package Gra;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Raver on 2017-05-23.
 */
public enum Quests {

    STATEK(false,false),
    PORT_KUPCY(false,true),
    PORT_NAJEMNICY(false,false)
    ;

    boolean completed, available;
    Quests(boolean completed, boolean available){
        this.available=available;
        this.completed=completed;
    }
    public static String exportDane(){
        String dane="";
        for(Quests q:Quests.values()){
            dane+=(q.completed==false)?0:1;
            dane+=' ';
            dane+=(q.available==false)?0:1;
            dane+='\n';
        }
        return dane;
    }
    public static void importDane(File dane) throws FileNotFoundException {
        Scanner in=new Scanner(dane);
        for (Quests q:Quests.values()){
            q.completed=(in.nextInt()==0)?false:true;
            q.completed=(in.nextInt()==0)?false:true;

        }
    }
    public void edit(boolean com,boolean ava){
        completed=com;
        available=ava;
    }
}
