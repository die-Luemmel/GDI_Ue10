package transfermarkt;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Rene Zucker
 * @author Christopher Brueckmann
 * @author Oliver Buenting
 * @author Simon Undt
 * Zum testen von rating() der jeweiligen Klassen und der Methode getBestPlayer() in RatingSystem
 */
public class TransfermarketTests {

	/**
	 * Zum Speichern einer Mannschaft mit der Tests durchgeführt werden können 
	 */
static SoccerPlayer[] mannschaft1;

/**
 * Zum Speichern einer Mannschaft mit der Tests durchgeführt werden können 
 */
static SoccerPlayer[] mannschaft2;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		mannschaft1 = new SoccerPlayer[3];
		mannschaft1[0] = new Keeper("Mr.","Smith",18,160,true,9,9,8,7,6);
		mannschaft1[1] = new Striker("Bäcker","Müller",33,200,false,6,7,5);
		mannschaft1[2] = new Center("Neo","Auserwählter",25,180,true,10,10,10); //Bester Spieler
		
		mannschaft2 = new SoccerPlayer[5];
		mannschaft2[0] = new Defender("Spieler", "1", 20, 180,true,8,8,9);
		mannschaft2[1] = new Center("Spieler", "2",20,180,true,6,7,10);
		mannschaft2[2] = new Center("Spieler", "3",20,180,true,10,9,8); //Bester Spieler
		mannschaft2[3] = new Striker("Spieler", "4",20,180,true,9,1,3);
		mannschaft2[4] = new Keeper("Detlef", "Fünf",19,190,false,10, 11, 1, 1, 4);
	}

	@Test
	
	/**
	 * testet rating() von Klasse Keeper
	 */
	public void KeeperRatingTest() {
		assertEquals(6, mannschaft1[1].rating(), 0.01);
		assertEquals(5.5, mannschaft2[4].rating(), 0.1);
	}
	
	@Test
	public void CenterRatingTest(){
		assertEquals(7.7, mannschaft2[1].rating(), 0.1);
		assertEquals(9, mannschaft2[2].rating(), 0.1);
	}
	
	@Test
	public void DefenderRatingTest() {
		assertEquals(8.3, mannschaft2[0].rating(), 0.1);
	}
	
	@Test
	public void StrikerRatingTest() {
		assertEquals(6, mannschaft1[1].rating(), 0.1);
		assertEquals(4.3, mannschaft2[3].rating(), 0.1);
	}
	
	@Test
	public void RatingSystemTest() {
		assertEquals(mannschaft1[2], RatingSystem.getBestPlayer(mannschaft1));
		assertEquals(mannschaft2[2], RatingSystem.getBestPlayer(mannschaft2));
	}

}
