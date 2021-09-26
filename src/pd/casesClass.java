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
public class casesClass {
  private int case_no;                   //this class is generally used to store data from the database 
    private String date;                //we did this in another class because it will be easier to create objects from
    private int accuser_id; 
    private int accused_id;//this class with all the data for a given row
                                          //and if we use this class with arrayLists and loops all of the data from the specified 
                                          //database table can be accessed. Which is what is done in our case
   casesClass(int case_no, String date, int accuser_id,  int accused_id)
    {
        this.case_no = case_no;
        this.date = date;
        this.accuser_id = accuser_id;
        this.accused_id = accused_id;
        
    }

   
    
    public int getCase_no()
    {
        return case_no;
    }
    
    public String getDate()
    {
        return date;
    }
    
    public int getAccuser_id()
    {
        return accuser_id;
    }
    
     public int getAccused_id()
    {
        return accused_id;
    }  
}
