package Gra;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.function.Function;

/**
 * Created by Raver on 2017-05-23.
 */
public enum Itemss {
    MissingNO("0","MISSING ITEM",0,"W sumie item do debugowania.",0,0,0,0,0,0,0,0,0,Rodzaj.TARCZA),
    Pożywienie("1","Pożywienie",10,"Redukuje głod o 20.",0,0,0,20,0,0,0,0,0, Rodzaj.UŻYTKOWY),
    Miecz("2","Prosty Miecz",50,"Zwykły miecz, nic specjalnego.",5,0,0,0,0,0,1,0,0,Rodzaj.MIECZ),
    ZardzewiałyMiecz("3","Zardzewiały Miecz",1,"Bardzo stary, lekko zardzewiały miecz.",0,0,0,0,0,0,0,0,0,Rodzaj.MIECZ),
    SpruchniałyLuk("4","Spruchniały Łuk",1,"Bardzo stary, spruchniały łuk.",0,0,0,0,0,0,0,0,0,Rodzaj.LUK),
    StareUbranie("5","Stare Ubranie",1,"Stare podarte ciuchy",0,0,0,0,0,0,0,0,0,Rodzaj.ZBROJA),

    ;

    String id;
    public String nazwa;
    public int cena;
    public String opis;
    public int wymagania_str;
    public int wymagania_dex;
    public int wymagania_int;
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
    Itemss(String id, String nazwa, int cena, String opis, int str, int dex, int inta, int food, int sleep, int peste, int wymagania_str, int wymagania_dex, int wymagania_int, Rodzaj rdzj){
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
        this.wymagania_str= wymagania_str;
        this.wymagania_dex= wymagania_dex;
        this.wymagania_int= wymagania_int;
        this.rdzj=rdzj;
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
    public static String save(){
        String dane="";
        for (Itemss it: Itemss.values())
            dane+=it.ilość+"\n";

        return dane;
    }
    public static void wczytaj(File dane) throws FileNotFoundException {
        Scanner sc=new Scanner(dane);
        for (Itemss it:Itemss.values())
            it.ilość=sc.nextInt();
    }
    public void zdejmij() {
        this.załóż(-1);
    }

    public void załóż(int i) {
        switch (rdzj){
            case MIECZ:{
                Wszystko.player.setStrenght(Wszystko.player.getStrenght()+i*this.str);
                Wszystko.player.setDextirity(Wszystko.player.getDextirity()+i*this.dex);
                Wszystko.player.setIntelligence(Wszystko.player.getIntelligence()+i*this.inta);
                break;
            }
            case LUK:{
                Wszystko.player.setStrenght(Wszystko.player.getStrenght()+i*this.str);
                Wszystko.player.setDextirity(Wszystko.player.getDextirity()+i*this.dex);
                Wszystko.player.setIntelligence(Wszystko.player.getIntelligence()+i*this.inta);
                break;
            }
            case UŻYTKOWY:{
                
            }
            case ZBROJA:{
                Wszystko.player.setStrenght(Wszystko.player.getStrenght()+i*this.str);
                Wszystko.player.setDextirity(Wszystko.player.getDextirity()+i*this.dex);
                Wszystko.player.setIntelligence(Wszystko.player.getIntelligence()+i*this.inta);
                break;
            }
            case TARCZA:{
                Wszystko.player.setStrenght(Wszystko.player.getStrenght()+i*this.str);
                Wszystko.player.setDextirity(Wszystko.player.getDextirity()+i*this.dex);
                Wszystko.player.setIntelligence(Wszystko.player.getIntelligence()+i*this.inta);
                break;
            }
            case QUEST:{
                
            }
            case INNE:{
                
            }
        }
    }

    public boolean czySpełniaWarunki() {
        if(Wszystko.player.getStrenght()>=this.wymagania_str && Wszystko.player.getDextirity() >= this.wymagania_dex && Wszystko.player.getIntelligence() >= this.wymagania_int) {
            return true;
        }
        else return false;
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
