package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggtabell;
	private int nesteledig;
	

	public Blogg() {
		innleggtabell = new Innlegg[20];
		nesteledig = 0;
		
		throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
		nesteledig = 0;
		
		throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public int getAntall() {
		return nesteledig;
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;
		
		throw new UnsupportedOperationException(TODO.method());

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for (int i = 0; i < nesteledig; i++) {
			if (innleggtabell[i].erLik(innlegg)) {
				return i;
			}
		}
		return -1;
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean finnes(Innlegg innlegg) {
		return (finnInnlegg(innlegg) != -1);
		
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean ledigPlass() {
		return (nesteledig < innleggtabell.length);
		
		throw new UnsupportedOperationException(TODO.method());

	}
	
	public boolean leggTil(Innlegg innlegg) {
		if(!finnes(innlegg) && ledigPlass()) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			return true;
		}
		return false;
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public String toString() {
		String s = Integer.toString(nesteledig) + "\n";
		
		for(int i = 0; i < nesteledig; i++) {
			s += innleggtabell[i].toString();
		}
		return s;
		throw new UnsupportedOperationException(TODO.method());
	}
}
