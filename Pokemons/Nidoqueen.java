package Pokemons;

import Attacs.RockSlide;
import ru.ifmo.se.pokemon.*;
public class Nidoqueen extends Nidorina{

    public Nidoqueen(String name, int lvl){
        super(name, lvl);
        addType(Type.GROUND);
        setStats(90.0, 92.0, 87.0, 75.0, 85.0, 76.0);
        addMove(new RockSlide());
    }
}
