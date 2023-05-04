/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author moinu
 */
public class GovernmentOfficial extends User implements Serializable {
    
    public GovernmentOfficial(String ID, String pass ){
    this.ID = ID;
    this.pass = pass;
    }
    public GovernmentOfficial() {
    }

    public GovernmentOfficial(String Name, int nid_num, String phone_number, String ID, String email, String pass, LocalDate dob) {
        super(Name, nid_num, phone_number, ID, email, pass, dob);
    }
    
}
