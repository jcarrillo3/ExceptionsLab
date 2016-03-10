package lab0;

/**
 *
 * @author Instlogin
 */
public class Startup {

    public static void main(String[] args) {

        //Employee emp = new Employee("Jim",null,"3333333333",28);
        
        // Think about this code. It wouldn't work if lastName was null
        try {
            Employee emp = new Employee("Jim",null,"3333333333",28);
            String fullNameInCaps = 
                emp.getFirstName().toUpperCase() 
                + " " + emp.getLastName().toUpperCase();
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
    }
}
