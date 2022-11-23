package Pokemons;

import Attacs.Bite;

public class Nidorina extends NidoranF{
    public Nidorina(String name, int lvl){
        super(name, lvl);
        setStats(70.0, 62.0, 67.0, 55.0, 55.0, 56.0);
        addMove(new Bite());
    }
}
