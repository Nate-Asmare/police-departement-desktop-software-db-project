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
public class detainee {
     private int accused_id;                   //this class is generally used to store data from the database 
   private int cell_no;//this class with all the data for a given row
                                          //and if we use this class with arrayLists and loops all of the data from the specified 
                                          //database table can be accessed. Which is what is done in our case
    public detainee(int accused_id,int cell_no)
    {
        this.accused_id = accused_id;
        this.cell_no = cell_no;
        
    }
    
    public int getAccused()
    {
        return accused_id;
    }
    
    public int getCell_no()
    {
        return cell_no;
    }
}
