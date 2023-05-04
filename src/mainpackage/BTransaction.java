/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.io.Serializable;

/**
 *
 * @author akash
 */
public class BTransaction implements Serializable {
    protected String name,ID,amount,TXID;

    public BTransaction() {
    }

    public BTransaction(String name, String ID, String amount, String TXID) {
        this.name = name;
        this.ID = ID;
        this.amount = amount;
        this.TXID = TXID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getTXID() {
        return TXID;
    }

    public void setTXID(String TXID) {
        this.TXID = TXID;
    }

   
    
    
}
