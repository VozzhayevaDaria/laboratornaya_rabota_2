import Pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args){
        Battle b = new Battle();
        Pokemon p1 = new Pheromosa("Алена", 1);
        b.addFoe(p1);
        Pokemon p2 = new Grimer("Алиса", 1);
        b.addFoe(p2);
        Pokemon p3 = new Muk("Вероника", 1);
        b.addAlly(p3);
        Pokemon p4 = new NidoranF("Василиса", 1);
        b.addAlly(p4);
        Pokemon p5 = new Nidorina("Валерия", 1);
        b.addAlly(p5);
        Pokemon p6 = new Nidoqueen("Аделина", 1);
        b.addFoe(p6);
        b.go();
    }
}
