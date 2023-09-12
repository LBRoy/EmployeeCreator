
/**
 * <p> The purpose of this class is to create a Sales Chief and return their name, age, location, and department.</p>
 * @author Braden Howard
 */
public class SalesChief extends SalesSupervisor{
	// Declaration
	private String department;
	/**
	 * This constructor sets the name, age, location and department of the Sales Chief.
	 * <p>Exceptions:</p>
     * <p>Does not validate if age passed is reasonable(between 1-130 years)</p>
	 * @param n the name of the Sales Chief
	 * @param a the age of the Sales Chief
	 * @param location the location of the Sales Chief
	 * @param department the department of the Sales Chief
	 */
	public SalesChief(String n, int a, String location, String department) {
		super(n, a, location);
		this.department = department;
	}
	/**
	 * Returns the department for this Sales Chief
	 * @return department for this Sales Chief
	 */
	private String getDepartment() {
		return department;
	}
	/**
	 * Returns the string of information about the Sales Chief.
     * @return a string of information about the Sales Chief
	 */
	public String toString(){
		return "Sales Chief  [super=" + super.toString() + ", department ="+ department+ "]";
	}
	/**
	 * The equals() method is used to see if two SalesChief objects are equal based on their name, age, location and department.
	 * @param obj The object to compare with the SalesChief object
     * @return true if the object is equal to the current SalesChief object, return false if not true
	 */
	@Override
	public boolean equals(Object obj){
		// Checks to see if it is a instanceof SalesChief
		if (!(obj instanceof SalesChief)) return false; 
		// Cast obj as a SalesChief
	    SalesChief salesC = (SalesChief)obj;
	    // Returns true if equal, uses super.equals(obj) to use equals() method from SalesSupervisor implementing DRY principle
	    return super.equals(obj) && ((this.department).equals(salesC.getDepartment())); 
	}
}
