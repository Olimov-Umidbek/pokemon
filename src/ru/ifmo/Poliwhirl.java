package ru.ifmo;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Poliwhirl extends Poliwag {
    public Poliwhirl(String name, int lvl) {
        super(name, lvl);
        setStats(65, 65, 65, 50, 50, 90);
        setType(Type.WATER);
        setMove(new Rest(), new Swagger(), new MudBomb());
    }
}

class MudBomb extends SpecialMove {
    public MudBomb() {
        super(Type.GROUND, 65, 0.85);
    }

    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 3.0) {
            p.setMod(Stat.ACCURACY, -1);
        }
    }
}