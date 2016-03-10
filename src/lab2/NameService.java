package lab2;

import javax.swing.JOptionPane;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
    private final int MIN_FULLNAME_LENGTH = 4;
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     * @throws IllegalArgumentException if fullName is null or empty or has 
     * fewer than two parts
     */
    
    //Full name cannot be null or empty
    // must me greater than 4 characters
    public String extractLastName(String fullName) throws IllegalArgumentException, StringIndexOutOfBoundsException {
        if (fullName == null || fullName.isEmpty() || fullName.length() < MIN_FULLNAME_LENGTH){
            throw new IllegalArgumentException("Full name cannot be empty and must be greater than 4 characters.");
        }
        int index = 0;
        String lastName = null;
        try {
            index = fullName.indexOf(" ");
            lastName = fullName.substring(index);
        } catch (StringIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Full name must be seperated by space");
        }
        
        // write your code here to extract the lastName and store in the
        // above local variable
        
        return lastName;
    }
    

    
    
}
