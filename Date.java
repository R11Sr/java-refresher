
/**
 * Write a description of class Date here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Date
{
    // instance variables - replace the example below with your own
    int year,month,day;
    

    /**
     * Constructor for objects of class Date
     */
    public Date()
    {
        // initialise instance variables
       this.year = 2000;
       this.month = 12;
       this.year = 31;
    }
    
    public Date(int yr,int mo,int day){
    
        this.year = year;
        this.month = mo;
        this.day = day;
    }
    
    public static void main(String[] args){
        Date Birthday = new Date(2004,1,15);
        
    }
}
