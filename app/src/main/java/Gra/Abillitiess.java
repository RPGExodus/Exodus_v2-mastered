package Gra;

/**
 * Created by Raver on 2017-05-23.
 */
public enum Abillitiess {
    MissingNO("0","Zaginiona umiejętność(tylko dla hakerów)");

    String id;
    String nazwa;

    public String getID() {
        return id;
    }
    Abillitiess(String id,String nazwa){
        this.id=id;
        this.nazwa=nazwa;
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
