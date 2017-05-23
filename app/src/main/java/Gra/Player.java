package Gra;


public class Player {
    int strenght;
    int dextirity;
    int intelligence;
    int food;
    int sleep;
    int peste;

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

    int gold;
    Itemss[] equipmnent;
    Abillitiess[] abillities;
    Companions[] team;
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
}
