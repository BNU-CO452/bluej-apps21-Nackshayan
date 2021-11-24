
/**
 * This class modules a which forms part of a course .
 *
 * @author Nackshayan
 * @version 3.50
 */
public class Module
{
    // Variables
    private String code;
    private String title;
    private int credit;

    /**
     * Constructor for objects of class Module
     */
    public Module(String code, String title)
    { 
        // initialise instance varibales
        this.code = code;
        this.title = title;
        credit = 0;
    }

    /**
     * This method will printout the Module code and title
     * 
     * @param
     * @return code
     */
    public String getCode()
    {
         return this.code;   
    }
    /**
     * This method will printout the Module code and title
     * 
     * @param
     * @return code
     */

    public String getTitle()
    {
         return this.title;   
    }
    
        public int getCredit()
    {
         return this.credit;   
    }
    
    public void setCredit(int credit)
    {
        this.credit = credit;
    }
    
    /**
     * Print the details of the course, the list
     * of students enrolled and the module
     */
    public void print()
    {
        printHeading();
        
        System.out.println(" Module Code: " + code + ": " + title+ "Credit" + credit);
        System.out.println();
    }
    
    /**
     * Print out the details of the course to the terminal.
     */
    private void printHeading()
    {
        System.out.println(" --------------------------------");
        System.out.println("   App211: Module Details");
        System.out.println(" --------------------------------");
        System.out.println();
    }
 }
