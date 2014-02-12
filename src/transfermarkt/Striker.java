package transfermarkt;

/**
 * @author Rene Zucker
 * @author Christopher Brueckmann
 * @author Oliver Buenting
 * @author Simon Undt
 * Repräsentiert einen Stürmer
 */
public class Striker extends SoccerPlayer{
	
	/**
	 * git die Torgefahr an
	 */
	private int goalProlific;
	
	/**
	 * gibt die Sprintgeschwindigkeit an
	 */
	private int sprintSpeed;
/**
 * Konstruktor, mit dem man alle Variablen initialisiert
 * @param Vorname
 * @param Nachname
 * @param Alter
 * @param Groesse in cm
 * @param Liebings Fuss
 * @param Schusskraft
 * @param Torgefährlichkeit
 * @param Sprintgeschwindigkeit
 */
	public Striker(String firstName, String lastName, int age, int size,
			  boolean prefferedFoot, int shotForce, int goalProlific, int sprintSpeed){
		
	super(firstName, lastName, age, size, prefferedFoot, shotForce);
	this.goalProlific = goalProlific;
	this.sprintSpeed = sprintSpeed;
	
	}
	/**
	 * gibt Wertung des Spielers
	 * @return wertung des Spielers
	 */
		public double rating (){
			return (double) (getshotForce() + this.goalProlific + this.sprintSpeed)/3;
		}	
}
