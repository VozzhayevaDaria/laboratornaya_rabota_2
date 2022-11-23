package Pokemons;

import Attacs.AerialAce;
import Attacs.Rest;
import ru.ifmo.se.pokemon.*;

public class NidoranF extends Pokemon {
    public NidoranF(String name, int lvl){
        super(name, lvl);
        setType(Type.POISON);
        setStats(55.0, 47.0, 52.0, 40.0, 40.0, 41.0);
        setMove(new AerialAce(), new Rest(55.0));
    }
}
