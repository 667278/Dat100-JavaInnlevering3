package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		boolean skrevet = true;
		PrintWriter writer = null;

		try {
			writer = new PrintWriter(mappe + filnavn);
			writer.print(samling.toString());
			writer.close();
		} catch (FileNotFoundExecption e) {
			System.out.println("Fant ikkje fil, så skriver ikkje ut");
			Skrevet = false;
		}
		return skrevet;
		throw new UnsupportedOperationException(TODO.method());
	}
}
