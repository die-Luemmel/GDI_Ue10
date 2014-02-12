package transfermarkt;

/**
 * @author Rene Zucker
 * @author Christopher Brueckmann
 * @author Oliver Buenting
 * @author Simon Undt
 * kann besten Spieler herausgeben
 */
public class RatingSystem {


	/**
	 * gibt den besten Fußballer aus allen im Array gespeicherten Spielern zurück
	 * @param Auflistung mehrerer Spieler
	 * @return bester Spieler
	 */
	static SoccerPlayer getBestPlayer(SoccerPlayer [] playerArray) {
		int n=1;
		SoccerPlayer bestPlayer = playerArray[0];
		while(n<playerArray.length){
			if(playerArray[n].rating()>bestPlayer.rating()){
				bestPlayer = playerArray[n];
			}
			n++;
		}
		return bestPlayer;
	}

}
