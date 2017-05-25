package Gra;

import java.lang.reflect.Method;
import java.util.function.Function;

/**
 * Created by Raver on 2017-05-23.
 */
public enum Itemss {
    MissingNO("0","MISSING ITEM",0,"W sumie item do debugowania.",0,0,0,0,0,0),
    Pożywienie("1","Pożywienie",10,"Redukuje głod o 20.",0,0,0,20,0,0),
    Miecz("2","Prosty Miecz",50,"Zwykły miecz, nic specjalnego.",5,0,0,0,0,0)
    ;

    String id;
    public String nazwa;
    public int cena;
    public String opis;
    public int ilość;
    public int str;
    public int dex;
    public int inta;
    public int food;
    public int sleep;
    public int peste;
    public Rodzaj rdzj;

    public String getID() {
        return id;
    }
    Itemss(String id, String nazwa, int cena, String opis, int str, int dex, int inta, int food, int sleep, int peste){
        this.id=id;
        this.nazwa=nazwa;
        this.cena=cena;
        this.opis=opis;
        this.str=str;
        this.dex=dex;
        this.inta=inta;
        this.food=food;
        this.sleep=sleep;
        this.peste=peste;
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
                for (int i=0;i<Wszystko.player.equipmnent.length;i++){
                    if (Wszystko.player.equipmnent[i]==null || Wszystko.player.equipmnent[i]==Itemss.MissingNO){
                        Wszystko.player.equipmnent[i]=this;
                        break;
                    }
                }
            }
            this.ilość++;
        }
    }

    public void sell() {
        if(this.ilość>0){
            Wszystko.player.setGold(Wszystko.player.getGold()+this.cena);
            this.ilość--;
            if(ilość==0){
                for(int i=0;i<Wszystko.player.equipmnent.length;i++){
                    if(Wszystko.player.equipmnent[i]==this){
                        Wszystko.player.equipmnent[i]=MissingNO;
                        break;
                    }
                }
            }
        }
    }
    public String dane(){
        return String.valueOf(this.nazwa+"\n"+this.opis+"\n"+"Cena: "+this.cena+"\nIlość: "+this.ilość);
    }

    public void zdejmij() {
        this.załóż(-1);
    }

    public void załóż(int i) {
        switch (rdzj){
            case MIECZ:{
                
            }
            case LUK:{
                
            }
            case UŻYTKOWY:{
                
            }
            case ZBROJA:{
                
            }
            case TARCZA:{
                
            }
            case QUEST:{
                
            }
            case INNE:{
                
            }
        }
    }

    public boolean czySpełniaWarunki() {
    }


    enum Rodzaj{
        MIECZ,
        LUK,
        UŻYTKOWY,
        ZBROJA,
        TARCZA,
        QUEST,
        INNE;
        Rodzaj(){

        }
    }

}
