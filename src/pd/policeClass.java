/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd;

/**
 *
 * @author Nati
 */
public class policeClass {
     private int badge_no;                   //this class is generally used to store data from the database 
     private String fname;                //we did this in another class because it will be easier to create objects from
    private String lname; 
    private String rank;//this class with all the data for a given row
                                          //and if we use this class with arrayLists and loops all of the data from the specified 
                                          //database table can be accessed. Which is what is done in our case
    public policeClass(String fname, String lname,int badge_no,  String rank)
    {
        this.badge_no = badge_no;
        this.fname = fname;
        this.lname = lname;
        this.rank = rank;
        
    }
    
    public int getBadge()
    {
        return badge_no;
    }
    
    public String getFname()
    {
        return fname;
    }
    
    public String getLname()
    {
        return lname;
    }
    
     public String getRank()
    {
        return rank;
    }
}
