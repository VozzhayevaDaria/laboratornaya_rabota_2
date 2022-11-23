package Attacs;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    protected double HP;
    public Rest(double hp){
        super(Type.PSYCHIC, 0.0, 1.0);
        HP = hp;
    }
    protected void	applySelfEffects(Pokemon pokemon){
        pokemon.addEffect(new Effect().condition(Status.SLEEP).turns(2));
        pokemon.setStats(HP, pokemon.getStat(Stat.ATTACK), pokemon.getStat(Stat.DEFENSE), pokemon.getStat(Stat.SPECIAL_ATTACK), pokemon.getStat(Stat.SPECIAL_DEFENSE), pokemon.getStat(Stat.SPEED));
    }
    protected String describe() {

        return "использует Attacs.Rest";
    }
}
