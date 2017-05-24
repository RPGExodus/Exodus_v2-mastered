package Gra;

/**
 * Created by Raver on 2017-05-23.
 */
public enum Itemss {
    MissingNO("0","MISSING ITEM",0,"W sumie item do debugowania."),
    Pożywienie("1","Pożywienie",10,"Redukuje głod o 20."),
    Miecz("2","Prosty Miecz",50,"Zwykły miecz, nic specjalnego.")
    ;

    String id;
    String nazwa;
    int cena;
    String opis;
    int ilość;

    public String getID() {
        return id;
    }
    Itemss(String id,String nazwa,int cena,String opis){
        this.id=id;
        this.nazwa=nazwa;
        this.cena=cena;
        this.opis=opis;
        ilość=0;
    }

    public static Gra.Itemss get(String next) {
        for (Itemss itm:Itemss.values()){
            if(itm.id.equals(next)){
                return itm;
            }
        }
        return MissingNO;
    }
    public void purchase(){
        if(Wszystko.player.gold>=this.cena){
            Wszystko.player.gold-=this.cena;
            boolean jestWEq=false;
            for (Itemss it: Wszystko.player.equipmnent){
                if(it==this) {
                    jestWEq = true;
                    break;
                }
            }
            if(!jestWEq){
                for (Itemss it:Wszystko.player.equipmnent){
                    if (it==null || it==Itemss.MissingNO){
                        it=this;
                    }
                }
            }
            this.ilość++;
        }
    }
}
