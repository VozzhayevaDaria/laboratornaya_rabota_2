package Attacs;

import ru.ifmo.se.pokemon.*;

public class Bite extends PhysicalMove {
    public Bite(){
        super(Type.DARK, 60.0, 1.0);
    }
    protected void applyOppDamage(Pokemon pokemon){
        if (Math.random() <= 0.3) {
            Effect.flinch(pokemon);
        }
    }
    protected String describe() {

        return "использует Attacs.Bite";
    }
}
