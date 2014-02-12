package transfermarkt;

/**
 * @author Rene Zucker
 * @author Christopher Brueckmann
 * @author Oliver Buenting
 * @author Simon Undt
 * Repr‰sentiert einen Torwart
 */
public class Keeper extends SoccerPlayer{
	
	/**
	 * Sprungkraft
	 */
	private int bounce;
	
	/**
	 * Reflexschnelligkeit
	 */
	private int reflex;
	
	/**
	 * Abstoﬂkraft
	 */
	private int goalKick;
	
	/**
	 * Fangsicherheit
	 */
	private int catchSafety;
	
	/**
	 * Konstruktor, mit dem man alle Variablen initialisiert
	 * @param Vorname
	 * @param Nachname
	 * @param Alter
	 * @param Grˆﬂe in cm
	 * @param bevorzugter Fuﬂ
	 * @param Schuﬂpower
	 * @param Sprungkraft
	 * @param Reflexschnelligkeit
	 * @param Kraft beim abstoﬂ
	 * @param Fangsicherheit
	 */
	public Keeper(String firstName, String lastName, int age, int size,
				  boolean prefferedFoot, int shotForce, int bounce, int reflex,
				  int goalKick, int catchSafety) {
		super(firstName, lastName, age, size, prefferedFoot, shotForce);
		this.bounce = bounce;
		this.reflex = reflex;
		this.goalKick = goalKick;
		this.catchSafety = catchSafety;

	}
	
	/**
	 * gibt Wertung des Spielers
	 * @return gibt die Wertung des Spielers
	 */
		public double rating (){
			return (double) (getshotForce() + this.bounce
					+ this.reflex + this.goalKick + this.catchSafety)/5;
		}	

}
