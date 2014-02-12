package transfermarkt;

/**
 * @author Rene Zucker
 * @author Christopher Brueckmann
 * @author Oliver Buenting
 * @author Simon Undt
 * Konzept für einen Fußballer allgemein mit seinen Eigenschaften
 */
public abstract class SoccerPlayer extends Person {
	
	/**
	 * bevorzugter Fuß des Spielers, true bedeutet rechter Fuß, false linker
	 */
	private boolean prefferedFoot;
	
	/**
	 * Schußstärke des Spielers
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
	 * gibt bevorzugten Fuß zurück
	 */
	public boolean getprefferedFoot(){
		return this.prefferedFoot;
	}
	
	/**
	 * @return Schusstärke
	 * gibt Schußstärke zurück
	 */
	public int getshotForce(){
		return this.shotForce;
	}
	
	/**
	 * @return wertung des Spielers
	 * gibt Wertung des Spielers zurück
	 */
	abstract double rating();
	
	
	

}
