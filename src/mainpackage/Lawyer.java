package mainpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.LocalDate;


public final class Lawyer extends User implements Serializable {
    /* protected String Name;
    protected int nid_num;
    protected String phone_number;
    protected int ID;
    protected String email;
    protected String pass; */
    protected LocalDate doj;
    protected String courtName;
    protected String email;

/*    public Lawyer(LocalDate doj, String courtName) {
        this.doj = doj;
        this.courtName = courtName;
    }*/
    //lowyer login data
    public Lawyer(String ID, String pass ){
        this.ID = ID;
        this.pass = pass;
    }
    public Lawyer(String Name, String ID, int nid, String email, String mobileNum ){
        this.Name = Name;
        this.ID = ID;
        this.nid_num= nid;
        this.email = email;
        this.phone_number = mobileNum;
                
    }
    
    public Lawyer(LocalDate doj, String courtName, String Name, int nid_num, String phone_number, String ID, String email, String pass, LocalDate dob) {
        super(Name, nid_num, phone_number, ID, email, pass, dob);
        this.doj = doj;
        this.courtName = courtName;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    public String getCourtName() {
        return courtName;
    }

    public void setCourtName(String courtName) {
        this.courtName = courtName;
    }

    @Override
    public String toString() {
        return "Lawyer{" + "doj=" + doj + ", courtName=" + courtName + '}';
    }
    
    public void display(){
        System.out.println("Id="+ID +", Passowrd="+pass);
    }
    public void checkLogin(String ID, String pass){
        //if (ID.equals(Name))
    
    }
    
    
        
        /*File x = null;
                FileInputStream fis = null;      
                ObjectInputStream ois = null;
                try {
                    x = new File("LawyerLoginData.bin");
                    fis = new FileInputStream(x);
                    ois = new ObjectInputStream(fis);
                    Lawyer l;
                    try{
                        //outputTextArea.setText("");
                        while(true){
                        //System.out.println("Printing objects.");
                        l = (Lawyer)ois.readObject();
                        //Object obj = ois.readObject();
                        //obj.submitReport();
                        //emp.submitReport();
                        System.out.println(l.ID);
                        System.out.println(l.pass);
                        //outputTextArea.appendText(emp.toString());
                        }
                    }//end of nested try
                    catch(Exception e){
                    //
                    }//nested catch     
                    //outputTextArea.appendText("All objects are loaded successfully...\n");            
                } catch (IOException ex) { } 
                finally {
                try {
                    if(ois != null) ois.close();
                } catch (IOException ex) { }*/

    
        

   // @Override
  //  public void checkLogin() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
        
        
    

    
    
    
}
