package Gra;

/**
 * Created by Raver on 2017-06-13.
 */
public class Czas {
    int dzien=0;
    int pora_dnia=0;
    public void zwieksz_pora_dnia(int czas)
    {
        pora_dnia+=czas;
        for(int i=pora_dnia/12;i>0;i--)
        {
            nastepny_dzien();
            pora_dnia=pora_dnia-12;
        }
    }
    private void nastepny_dzien()
    {
        dzien++;
        Wszystko.player.setSleep(Wszystko.player.getSleep()+50);
        Wszystko.player.setFood(Wszystko.player.getFood()+50);

    }

    public String Pora_dnia()
    {
        if (pora_dnia<3) return "Ranek";
        else if (pora_dnia>3&& pora_dnia<6)return "Południe";
        else if (pora_dnia>6&& pora_dnia<9)return "Południe";
        else if (pora_dnia>9)return "Południe";
        else return "Bartek pedau";
    }
}
