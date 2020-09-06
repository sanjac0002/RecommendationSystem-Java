
/**
 * Write a description of Movie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Movie {
    public int yr,mins;
    public String Id,ttl,gnr,dir,cnty,pstr;
    // Constructor for initializing the 8 private variable.
    public Movie(String id,String title,int year,String genres,String director,String country,int minutes,String poster)
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
    public String getID()
    {
        return(Id);
    }
    public String getTitle()
    {
        return(ttl);
    }
    public int getYear()
    {
        return(yr);
    }
    public String getGenre()
    {
        return(gnr);
    }
    public String getCountry()
    {
        return(cnty);
    }
    public int getMinutes()
    {
        return(mins);
    }
    public String getPoster()
    {
        return(pstr);
    }
    
    public String toString()
    {
        //represents movie information to be printed.
        return("id:"+Id +" Title: "+ttl + " year:" +yr+ " genres:"+gnr+" country:"+cnty+" minutes:"+mins+" poster:"+pstr);
    }
    
    
}
