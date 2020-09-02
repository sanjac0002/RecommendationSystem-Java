
/**
 * Write a description of Rating here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rating {
    
    private String item;
    private double value;
    
    public Rating (String itm, double val)
    {
        item=itm;
        value=val;
    }

    private String getItem()
    {
        return(item);
    }
    private double getValue()
    {
        return(value);
    }
    public String toString()
    {
        //represents rating information as a String.
        return("Item:"+item +" Value: "+value);
    }
    public String compareTo()
    {
        //compare this rating with another rating.
        
    }
    
}
