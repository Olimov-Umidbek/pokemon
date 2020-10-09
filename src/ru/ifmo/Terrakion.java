package ru.ifmo;

import ru.ifmo.se.pokemon.*;

public class Terrakion extends Pokemon {
	public Terrakion(String name, int level) {
		super(name, level);
		setStats(91, 129, 90, 72, 90, 108);
		setType(Type.ROCK, Type.FIGHTING);
		setMove(new TakeDown(), new CloseCombat(), new DoubleTeam(), new Rest());

	}
}

class DoubleTeam extends StatusMove {

	public DoubleTeam() {
		super(Type.NORMAL, 0, 1.0);
	}

	protected void applySelfEffects(Pokemon p) {
		p.setMod(Stat.EVASION, 1);
	}

}

class TakeDown extends PhysicalMove {
	public TakeDown() {
		super(Type.NORMAL, 90, 0.85);
	}
}

class CloseCombat extends PhysicalMove {
	public CloseCombat() {
		super(Type.FIGHTING, 120, 1.0);
	}
}

class Rest extends StatusMove {
	public Rest() {
		super(Type.PSYCHIC, 0, 1.0);
	}

	protected void applySelfEffects(Pokemon p) {
		p.setMod(Stat.HP, -((int) (p.getStat(Stat.HP) - p.getHP())));
		Effect e = new Effect().turns(2).condition(Status.SLEEP);
		p.setCondition(e);
	}

}