package Gra;

/**
 * Created by Raver on 2017-05-23.
 */
public enum Itemss {
    MissingNO("0","MISSING ITEM",0,"W sumie item do debugowania");

    String id;
    String nazwa;
    int cena;
    String opis;

    public String getID() {
        return id;
    }
    Itemss(String id,String nazwa,int cena,String opis){
        this.id=id;
        this.nazwa=nazwa;
        this.cena=cena;
        this.opis=opis;
    }

    public static Gra.Itemss get(String next) {
        for (Itemss itm:Itemss.values()){
            if(itm.id.equals(next)){
                return itm;
            }
        }
        return MissingNO;
    }
}
