package Gra;

/**
 * Created by Raver on 2017-05-23.
 */
public enum Abillitiess {
    MissingNO;

    String id;
    public String getID() {
        return id;
    }

    public static Gra.Abillitiess get(String id) {
        for(Abillitiess abil:Abillitiess.values()){
            if(abil.id.equals(id)){
                return abil;
            }
        }
        return MissingNO;
    }
}
