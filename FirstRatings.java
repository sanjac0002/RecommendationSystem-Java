
/**
 * Write a description of FirstRatings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.util.*;
import org.apache.commons.csv.*;
import java.io.*;
import java.lang.String;
public class FirstRatings 
{
    public ArrayList<Movie> movieinfo;
    public int yr,min;
    public String id,ttle,cnty,gnr,dir,pstr;
    public ArrayList loadMovies(FileResource fr) 
    {
        fr= new FileResource();
        CSVParser parser=fr.getCSVParser();
        
        for(CSVRecord rec : parser)
        {
            id = rec.get("id");
            ttle= rec.get("title");
            yr = Integer.parseInt(rec.get("year"));
            cnty= rec.get("country");
            gnr= rec.get("genre");
            dir=rec.get("director");
            min = Integer.parseInt(rec.get("minutes"));
            pstr= rec.get("poster");
        }      
        movieinfo.add(Movie m=new Movie(id,ttle,yr,gnr,dir,cnty,min,pstr));
        
    }
    public void testLoadMovies()
    {
        ArrayList<String> data =new ArrayList<String>();
        FileResource fr=new FileResource();
        data= loadMovies(fr);
    }
}
