package transfermarkt;

/**
 * @author Rene Zucker
 * @author Christopher Brueckmann
 * @author Oliver Buenting
 * @author Simon Undt
 * Konzept f�r einen Fu�baller allgemein mit seinen Eigenschaften
 */
public abstract class SoccerPlayer extends Person {
	
	/**
	 * bevorzugter Fu� des Spielers, true bedeutet rechter Fu�, false linker
	 */
	private boolean prefferedFoot;
	
	/**
	 * Schu�st�rke des Spielers
	 */
	private int shotForce;
	
	
	/**
	 * @param Vorname
	 * @param Nachname	
	 * @param Alter
	 * @param Groesse in cm
	 * @param liebligs Fuss
	 * @param Schusskraft
	 * Konstrukter mit welchem alle Variablen gesetzt werden
	 */
	public SoccerPlayer(String firstName, String lastName, int age, int size,
						boolean prefferedFoot, int shotForce){
		super(firstName, lastName, age, size);
		this.prefferedFoot = prefferedFoot;
		this.shotForce = shotForce;
	}
	
	/**
	 * @return Lieblingsfuss
	 * gibt bevorzugten Fu� zur�ck
	 */
	public boolean getprefferedFoot(){
		return this.prefferedFoot;
	}
	
	/**
	 * @return Schusst�rke
	 * gibt Schu�st�rke zur�ck
	 */
	public int getshotForce(){
		return this.shotForce;
	}
	
	/**
	 * @return wertung des Spielers
	 * gibt Wertung des Spielers zur�ck
	 */
	abstract double rating();
	
	
	

}
