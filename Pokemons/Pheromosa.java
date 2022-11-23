package Pokemons;

import Attacs.DoubleTeam;
import Attacs.LeechLife;
import Attacs.PoisonJab;
import Attacs.StoneEdge;
import ru.ifmo.se.pokemon.*;

public class Pheromosa extends Pokemon {
    public Pheromosa(String name,int lvl) {
        super(name, lvl);
        setStats(71.0, 137.0, 37.0, 137.0, 37.0, 151.0);
        setType(Type.BUG, Type.FIGHTING);
        setMove(new PoisonJab(), new StoneEdge(), new DoubleTeam(), new LeechLife());
    }
    }