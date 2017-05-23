package Gra;


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
}
