package Attacs;

import ru.ifmo.se.pokemon.*;

public class RockSlide extends PhysicalMove {
    public RockSlide(){
        super(Type.ROCK, 75.0, 0.9);
    }
    protected void applyOppDamage(Pokemon pokemon){
        if (Math.random() <= 0.3) {
            Effect.flinch(pokemon);
        }
    }
    protected String describe() {

        return "использует Rock SLide";
    }
}
