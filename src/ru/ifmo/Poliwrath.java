package ru.ifmo;

import ru.ifmo.se.pokemon.*;

public class Poliwrath extends Poliwhirl{
	public Poliwrath( String name, int lvl) {
		super( name, lvl );
		setStats( 90, 95, 95, 70, 90, 70 );
		setType( Type.WATER, Type.FIGHTING );
		setMove( new Rest(), new Swagger(), new MudBomb(), new IceBeam());
	}
}

class IceBeam extends SpecialMove {
	public IceBeam() {
		super( Type.ICE, 90, 1.0 );
	}
	protected void applyOppEffects(Pokemon p) {
		if ( Math.random() < 1.0 ) {
			Effect.freeze(p);
		}
	}
}