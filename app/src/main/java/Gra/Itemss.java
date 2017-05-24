package Gra;

/**
 * Created by Raver on 2017-05-23.
 */
public enum Itemss {
    MissingNO;

    String id;
    public String getID() {
        return id;
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
