package transfermarkt;

/**
 * @author Rene Zucker
 * @author Christopher Brueckmann
 * @author Oliver Buenting
 * @author Simon Undt
 * Repräsentiert eine Person
 */
public class Person {

	private String firstName;
	private String lastName;
	private int age;
	private int size;
	
	/**
	 * Konstruktor, mit dem man alle Variablen initialisiert
	 * @param Vorname
	 * @param Nachname
	 * @param Alter
	 * @param Größe in cm
	 */
	Person(String firstName, String lastName, int age, int size) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.size = size;
	}
	
	/**
	 * gibt Vornamen der Person zurück
	 * @return Vorname
	 */
	public String getfirstName(){
		return this.firstName;
	}
	
	/**
	 * Gibt Nachnamen der Person zurück
	 * @return Nachname
	 */
	public String getlastName(){
		return this.lastName;
	}
	
	/**
	 * gibt Alter der Person zurück
	 * @return Alter
	 */
	public int getAge(){
		return this.age;
	}
	
	/**
	 * gibt Größe der Person zurück
	 * @return Groesse
	 */
	public int getSize(){
		return this.size;
	}
	
	/**
	 * gibt den vollen Namen der Person zurück
	 * @return Vor- und Nachname
	 */
	public String getFullName(){
		return (this.firstName + " " + this.lastName);
	}
	

@Override
    public boolean equals(Object obj){
		if(obj instanceof Person) {
			return (((Person) obj).getFullName().equals(this.getFullName()));
		}
		return false;
		
	}

}
