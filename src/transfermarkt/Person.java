package transfermarkt;

/**
 * @author Rene Zucker
 * @author Christopher Brueckmann
 * @author Oliver Buenting
 * @author Simon Undt
 * Repr�sentiert eine Person
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
	 * @param Gr��e in cm
	 */
	Person(String firstName, String lastName, int age, int size) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.size = size;
	}
	
	/**
	 * gibt Vornamen der Person zur�ck
	 * @return Vorname
	 */
	public String getfirstName(){
		return this.firstName;
	}
	
	/**
	 * Gibt Nachnamen der Person zur�ck
	 * @return Nachname
	 */
	public String getlastName(){
		return this.lastName;
	}
	
	/**
	 * gibt Alter der Person zur�ck
	 * @return Alter
	 */
	public int getAge(){
		return this.age;
	}
	
	/**
	 * gibt Gr��e der Person zur�ck
	 * @return Groesse
	 */
	public int getSize(){
		return this.size;
	}
	
	/**
	 * gibt den vollen Namen der Person zur�ck
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
