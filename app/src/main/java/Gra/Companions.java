package Gra;

/**
 * Created by Raver on 2017-05-23.
 */
public enum Companions {
    MissingNO(),
    Nóż();

    String id;
    public String getID() {
        return id;
    }

    public static Gra.Companions get(String id) {
        for(Companions com: Companions.values()){
            if(com.id.equals(id)){
                return com;
            }
        }
        return MissingNO;
    }
}
