package Attacs;

import ru.ifmo.se.pokemon.*;

public class AerialAce extends PhysicalMove {
    public AerialAce(){
        super(Type.FLYING, 60.0, 1.0);
    }
    protected String describe() {

        return "использует Aerial Ace";
    }
}
