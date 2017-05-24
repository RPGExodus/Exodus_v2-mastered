package Gra;


import java.util.ArrayList;

/**
 * Created by Użytkownik on 2017-05-24.
 */
public enum Handlarz {
    STATEK_HANDLARZ(new Itemss[]{
            Itemss.Pożywienie,
            Itemss.Miecz
    });


    Itemss[] itemy;

    Handlarz(Itemss[] itemy){
        this.itemy=itemy;
    }


}
