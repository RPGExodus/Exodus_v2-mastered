package Gra;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Player {
    int strenght;
    int dextirity;
    int intelligence;
    int food;
    int sleep;
    int peste;
    int gold;
    Itemss[] equipmnent;
    private Itemss[] założone;
    Abillitiess[] abillities;
    Companions[] team;

    public int getStrenght() {
        return strenght;
    }

    public int getDextirity() {
        return dextirity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getFood() {
        return food;
    }

    public int getSleep() {
        return sleep;
    }

    public int getPeste() {
        return peste;
    }

    public int getGold() {
        return gold;
    }

    public Itemss[] getEquipmnent() {
        return equipmnent;
    }

    public Abillitiess[] getAbillities() {
        return abillities;
    }

    public Companions[] getTeam() {
        return team;
    }


    public Player()
    {
        strenght = 0;
        dextirity =0;
        intelligence =0;
        food= 0;
        sleep = 0;
        peste =0;
        gold =0;
        equipmnent = new Itemss[100];
        abillities = new Abillitiess[50];
        team = new Companions[5];
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public void setDextirity(int dextirity) {
        this.dextirity = dextirity;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void setSleep(int sleep) {
        this.sleep = sleep;
    }

    public void setPeste(int peste) {
        this.peste = peste;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void setEquipmnent(Itemss[] equipmnent) {
        this.equipmnent = equipmnent;
    }

    public void setAbillities(Abillitiess[] abillities) {
        this.abillities = abillities;
    }

    public void setTeam(Companions[] team) {
        this.team = team;
    }


    public String getAllData(){
        String dane=this.getStrenght()+"\n"+this.getDextirity()+"\n"+this.getIntelligence()+"\n"+this.getFood()+"\n"+this.getSleep()+"\n"
                +this.getPeste()+"\n"+this.getGold()+"\n";
        for(Itemss a:this.equipmnent){
            if(a !=null)
                dane+=a.getID();
            else
                dane+="null";
            dane+="\n";
        }
        for(Abillitiess a:this.abillities){
            if(a!=null)dane+=a.getID();
            else
                dane+="null";
            dane+="\n";
        }
        for(Companions a:this.team){
            if(a!=null)dane+=a.getID();
            else
                dane+="null";
            dane+="\n";
        }
        return dane;
    }

    public void wczytajDane(File dane) throws FileNotFoundException {
        Scanner in=new Scanner(dane);
        setStrenght(in.nextInt());
        setDextirity(in.nextInt());
        setIntelligence(in.nextInt());
        setFood(in.nextInt());
        setSleep(in.nextInt());
        setPeste(in.nextInt());
        setGold(in.nextInt());
        for(int i=0;i<equipmnent.length;i++){
            equipmnent[i]=Itemss.get(in.next());
        }
        for(int i=0;i<abillities.length;i++){
            abillities[i]=Abillitiess.get(in.next());
        }
        for (int i=0;i<team.length;i++){
            team[i]=Companions.get(in.next());
        }

    }

    public String getStatystyki(){
        String wyn="";
        wyn+= String.format("Siła = %d%n", this.strenght);
        wyn+= String.format("Zręczność = %d%n",this.dextirity);
        wyn+= String.format("Inteligencja = %d%n",this.intelligence);
        wyn+= String.format("Głód = %d%n",this.food);
        wyn+= String.format("Zmęczenie = %d%n", this.sleep);
        wyn+= String.format("Choroba = %d",this.peste);
        return wyn;
    }
    public String getItems(){
        String wyn="";
        for (Itemss it:equipmnent){
            if(it !=Itemss.MissingNO){
                wyn+=it.nazwa+" : "+it.opis+". "+"Cena: "+it.cena+"\n";
            }
        }

        return wyn;
    }
    public String getAbilities(){
        String wyn="";
        for(Abillitiess ab:abillities){
            if(ab !=Abillitiess.MissingNO){
                wyn+=ab.nazwa;
                wyn+="\n";
            }
        }

        return wyn;
    }
    public void załóż(int id_w_eq){
        switch (equipmnent[id_w_eq].rdzj){
            case MIECZ:{
                if(equipmnent[id_w_eq].czySpełniaWarunki()) {
                    Itemss pom = założone[0];
                    pom.zdejmij();
                    założone[0] = equipmnent[id_w_eq];
                    założone[0].załóż(1);
                    equipmnent[id_w_eq] = pom;
                }
            }
        }
    }
}
