package transfermarkt;

/**
 * @author Rene Zucker
 * @author Christopher Brueckmann
 * @author Oliver Buenting
 * @author Simon Undt
 * Repr‰sentiert einen Mittelfeldspieler
 */
public class Center extends SoccerPlayer{
	
/**
 * Antrittsgeschwindigkeit 
 */
	private int accesssion;
	/**
	 * Ballkontrolle
	 */
	private int ballcontrol;
/**
 * Konstruktor, mit dem man alle Variablen initialisiert
 * @param Vorname
 * @param Nachname
 * @param Alter
 * @param Grˆﬂe in cm
 * @param bevorzugter Fuﬂ
 * @param Schuﬂpower
 * @param Antrittsgeschwindigkeit
 * @param Ballkontrolle
 */
	public Center(String firstName, String lastName, int age, int size,
			  boolean prefferedFoot, int shotForce, int accesssion, int ballcontrol){
		
	super(firstName, lastName, age, size, prefferedFoot, shotForce);
	this.accesssion = accesssion;
	this.ballcontrol = ballcontrol;
	
	}
	
/**
 * gibt Wertung des Spielers
 * @return Wertung des Spielers
 */
	public double rating (){
		return (double) (getshotForce() + this.accesssion + this.ballcontrol)/3;
	}

}
