package Pokemons;

import Attacs.MudBomb;
import Attacs.MudSlap;
import Attacs.ShadowBall;
import ru.ifmo.se.pokemon.*;

public class Grimer extends Pokemon {
    public Grimer(String name,int lvl){
        super(name, lvl);
        setStats(80.0, 80.0, 50.0, 40.0, 50.0, 25.0);
        setType(Type.POISON);
        setMove(new MudBomb(), new ShadowBall(), new MudSlap());
    }
}
