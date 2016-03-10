package lab0;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    public static final int MAX_VACATION_DAYS = 28;
    public static final int MIN_VACATION_DAYS = 0;
    public static final int MAX_FNAME_LENGTH = 20;
    public static final int MIN_FNAME_LENGTH = 1;
    public static final int MAX_LNAME_LENGTH = 25;
    public static final int MIN_LNAME_LENGTH = 2;
    private String firstName;
    private String lastName;
    private String ssn;
    private int daysVacation;

    public Employee() {
        // initialize a bunch of default values
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        setDaysVacation(daysVacation);
    }
    
    public final int getDaysVacation() {
        return daysVacation;
    }
    
    // days vacation must be greater than 0 and less than 28
    public final void setDaysVacation(int daysVacation) throws IllegalArgumentException {
        if (daysVacation < MIN_VACATION_DAYS || daysVacation > MAX_VACATION_DAYS){
            throw new IllegalArgumentException("Vacation Days must be between 1-28 days");
        } else
            this.daysVacation = daysVacation;
    }

    public final String getFirstName() {
        return firstName;
    }
    
    // First name cannot be null or empty
    // must be between 2 and 20 characters
    public final void setFirstName(String firstName) throws IllegalArgumentException {
       if (firstName == null || firstName.isEmpty() ||
               firstName.length() < MIN_FNAME_LENGTH || firstName.length() > MAX_FNAME_LENGTH){
            throw new IllegalArgumentException("first Name must be between 1-28 days");
        }
        this.firstName = firstName;
    }

    public final String getLastName() {
        return lastName;
    }
    
    // First name cannot be null or empty
    // must be between 2 and 20 characters
    public final void setLastName(String lastName) throws IllegalArgumentException {
        if (lastName == null || lastName.isEmpty() ||
               lastName.length() < MIN_LNAME_LENGTH || lastName.length() > MAX_LNAME_LENGTH){
            throw new IllegalArgumentException("Last Name must be between 1-28 days");
        } 
        this.firstName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    public final void setSsn(String ssn) {
        
        this.ssn = ssn;
    }
    
    
    
}
