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
        food= 100;
        sleep = 100;
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
            dane+=a.toString();
            dane+="\n";
        }
        for(Abillitiess a:this.abillities){
            dane+=a.toString();
            dane+="\n";
        }
        for(Companions a:this.team){
            dane+=a.toString();
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
            equipmnent[i]=Itemss.forName(in.next());
        }
        for(int i=0;i<abillities.length;i++){
            abillities[i]=Abillitiess.forName(in.next());
        }
        for (int i=0;i<team.length;i++){
            team[i]=Companions.forName(in.next());
        }

    }
}
