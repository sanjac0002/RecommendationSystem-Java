
/**
 * Write a description of Movie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Movie {
    private int yr,mins;
    private String Id,ttl,gnr,dir,cnty,pstr;
    // Constructor for initializing the 8 private variable.
    private Movie(String id,String title,int year,String genres,String director,String country,int minutes,String poster)
    {
        Id=id;
        ttl=title;
        yr=year;
        gnr=genres;
        dir=director;
        cnty=country;
        mins=minutes;
        pstr=poster;        
    }
    
    //8 getter methods which returns the details about a movie.
    private String getID()
    {
        return(Id);
    }
    private String getTitle()
    {
        return(ttl);
    }
    private int getYear()
    {
        return(yr);
    }
    private String getGenre()
    {
        return(gnr);
    }
    private String getCountry()
    {
        return(cnty);
    }
    private int getMinutes()
    {
        return(mins);
    }
    private String getPoster()
    {
        return(pstr);
    }
    
    public String toString()
    {
        //represents movie information to be printed.
        return("id:"+Id +" Title: "+ttl + " year:" +yr+ " genres:"+gnr+" country:"+cnty+" minutes:"+mins+" poster:"+pstr);
    }
    
    
}
