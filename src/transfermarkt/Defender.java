package transfermarkt;

/**
 * @author Rene Zucker
 * @author Christopher Brueckmann
 * @author Oliver Buenting
 * @author Simon Undt
 * Repr‰sentiert einen Verteidiger
 */
public class Defender extends SoccerPlayer{
	
	/**
	 * Gr‰tschgenauigkeit
	 */
	private int straddle;
	
	/**
	 * Stellungspiel
	 */
	private int positionalPlay;
	
	/**
	 * Konstruktor, mit dem man alle Variablen initialisiert
	 * @param Vorname
	 * @param Nachname
	 * @param Alter
	 * @param Grˆﬂe in cm
	 * @param bevorzugter Fuﬂ
	 * @param Schuﬂpower
	 * @param Gr‰tschgenauigkeit
	 * @param Stellungsspiel
	 */
	public Defender(String firstName, String lastName, int age, int size,
			  boolean prefferedFoot, int shotForce, int straddle, int positionalPlay){
		
	super(firstName, lastName, age, size, prefferedFoot, shotForce);
	this.straddle = straddle;
	this.positionalPlay = positionalPlay;
	}
	
	/**
	 * gibt Wertung des Spielers
	 * @return gibt die Wertung des Spielers ab
	 */
		public double rating (){
			return (double) (getshotForce() + this.straddle + this.positionalPlay)/3;
		}	
	
}
