package transfermarkt;

/**
 * @author Rene Zucker
 * @author Christopher Brueckmann
 * @author Oliver Buenting
 * @author Simon Undt
 * Lösung für 7.6
 */
public class ObjectEquality {

	/**
	 * Gibt boolean zurück für o1=o2
	 * @param Argumente bzw. Spieler
	 */
	public static void main(String[] args) {
		Striker o1= new Striker("Zlatan", "Ibrahimovic", 32, 195, true, 99, 99, 99);
		Striker o2= new Striker("Zlatan", "Ibrahimovic", 32, 195, true, 99, 99, 99);
		
		System.out.println(o1==o2);
		System.out.println(o1.equals(o2));
		

	}
/*
 *	7.6 
 *	Der Ausdruck "System.out.println(o1==o2)" gibt "false" aus, weil es sich bei den beiden
 *	Objekten o1 und o2, obwohl sie sich in jeder Hinsicht gleichen, um zwei verschiedene,
 *	ergo nicht identische Objekte handelt, worauf der Vergleichsoperator "==" jedoch achtet.
 *	Die Methode "public boolean equals(Object obj)" schaut eben nur ob sich die beiden Objekte
 *	gleichen, daher also beim zweiten Aufruf "true".
 */

}
