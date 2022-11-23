package Pokemons;

import Attacs.FocusBlast;

public class Muk extends Grimer{
    public Muk(String name, int lvl) {
        super(name, lvl);
        setStats(105.0, 105.0, 75.0, 65.0, 100.0, 50.0);
        addMove(new FocusBlast());
    }

}
