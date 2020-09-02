
/**
 * Write a description of Rater here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class Rater {
    
    public ArrayList<Rating> myRatings;
    public String myID;
    
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
        double m=0.0;
        for(int k=0;k<myRatings.size();k++)
        {
            if(myRatings.get(k).getItem().equals(item))//here k is a position in myRatings where we get Item declared in class
                                                       // Rating. The getItem is the variable in class Rating.
            {
                m= myRatings.get(k).getValue();  // we return value declared in class Rating corresponding to item.
            } 
            else
            {
                m= -1;
            }
        
        }
        return m;
    }
    public int numRatings()
    {
        int n=myRatings.size();
        return n;
    }
    
    public ArrayList getItemsRated()
    {
        ArrayList<String> listofItems = new ArrayList<String>();
        for(int i=0;i<myRatings.size();i++)
        {
            listofItems.add(myRatings.get(i).getItem());
        }
        return listofItems;
    }
    
}
