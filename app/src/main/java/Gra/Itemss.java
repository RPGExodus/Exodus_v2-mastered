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
    public String nazwa;
    public int cena;
    public String opis;
    public int ilość;

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
}
