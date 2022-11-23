package Attacs;

import ru.ifmo.se.pokemon.*;

public class PoisonJab extends PhysicalMove {
    public PoisonJab() {

        super(Type.POISON, 80, 1);
    }

    public void applyOppEffects(Pokemon pokemon) {

        if (Math.random() <= 0.3) Effect.poison(pokemon);
    }

    protected String describe() {

        return "использует Attacs.PoisonJab";
    }
}
