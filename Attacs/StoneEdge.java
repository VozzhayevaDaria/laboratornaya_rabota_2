package Attacs;

import ru.ifmo.se.pokemon.*;

public class StoneEdge extends PhysicalMove{
    public StoneEdge(){
        super(Type.ROCK, 100, 0.8);

    }

    protected String describe() {
        return "использует Attacs.StoneEdge";
    }
}
