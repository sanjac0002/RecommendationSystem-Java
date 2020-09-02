
/**
 * Write a description of Rater here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class Rater {
    
    private ArrayList<Rating> myRatings;
    private String myID;
    
    public Rater(String id)
    {
        //constructor
        myID=id;
    }
    
    public void addRating(String item,double rating)
    {
        // A new Rating is created and added to myRatings.
        myRatings.add(new Rating(item,rating));
        //here Rating creates an object and item,rating comes from Rating class
    }
    
    public String getID()
    {
        return myID;
    }
    
    public double getRating(String item)
    {
        for(int k=0;k<myRatings.size();k++)
        {
            if(myRatings.get(k).getItem().equals(item))//here k is a position in myRatings where we get Item declared in class Rating
            {
                return myRatings.get(k).getValue();  // we return value declared in class Rating corresponding to item
            }        
        
    }
    }
    public ArrayList numRatings()
    {
        int n=myRatings.size();
        return n;
    }
    
}
