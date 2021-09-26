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
public class accused {
  private int accused_id;                   //this class is generally used to store data from the database 
  private String fname;                //we did this in another class because it will be easier to create objects from
  private String lname; 
  public accused(int accused_id, String fname,String lname)
    {
        this.accused_id = accused_id;
        this.fname = fname;
        this.lname = lname;
       
    }
    
    public int getAccused_id()
    {
        return accused_id;
    }
    
    public String getFname()
    {
        return fname;
    }
    
    public String getLname()
    {
        return lname;
    }
}
