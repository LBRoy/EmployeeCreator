
/**
 * <p> The purpose of this class is to create a Sales VP and return their name, age, location, department and bonus.</p>
 * @author Braden Howard
 */
public class SalesVP extends SalesChief{
	// Declarations
	private static final double BONUS_TOLERANCE = 0.01;
	private double bonus;
	/**
	 * This constructor sets the name, age, location, department and bonus of the Sales VP.
	 * <p>Exceptions:</p>
     * <p>Does not validate if age passed is reasonable(between 1-130 years)</p>
	 * @param n the name of the Sales VP
	 * @param a the age of the Sales VP
	 * @param location the location of the Sales VP
	 * @param department the department of the Sales VP
	 * @param bonus the bonus of the Sales VP
	 */
	public SalesVP(String n, int a, String location, String department, double bonus) {
		super(n, a, location, department);
		this.bonus = bonus;
	}
	/**
	 * Returns the bonus for this Sales VP
	 * @return bonus for this Sales VP
	 */
	private double getBonus() {
		return bonus;
	}
	
	public String toString(){
		return "SalesVP  [super=" + super.toString() + ", bonus ="+ bonus+ "]";
	}
	/**
	 * The equals() method is used to see if two SalesVP objects are equal based on their name, age, location, department and bonus.
	 * @param obj The object to compare with the SalesVP object
     * @return true if the object is equal to the current SalesVP object, return false if not true
	 */
	@Override
	public boolean equals(Object obj){
		// Checks to see if it is a instanceof SalesVP
		if (!(obj instanceof SalesVP)) return false;
		// Cast obj as a SalesVP
	    SalesVP salesVP = (SalesVP)obj; 
	    // Returns true if equal, uses super.equals(obj) to use equals() method from SalesChief implementing DRY principle
	    return super.equals(obj) && Math.abs(this.bonus - salesVP.getBonus()) <= BONUS_TOLERANCE; // Citing for Math.abs checking tolerance below [1]
	}
}

/*
 * References:
 * Found how to check if a value is within tolerance using Math.abs from StackOverflow.com.
 * [1] Check values with tolerance. StackOverflow.com.
 * https://stackoverflow.com/questions/12383975/check-values-with-tolerance (accessed Jul. 22, 2023). 
 */
