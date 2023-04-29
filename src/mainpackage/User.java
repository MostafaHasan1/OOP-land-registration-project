package mainpackage;

public abstract class User {
    protected String Name;
    protected int nid_num;
    protected String phone_number;
    protected int ID;
    protected String email;
    protected String pass;

    public User() {
    }

    public User(String Name, int nid_num, String phone_number, int ID, String email, String pass) {
        this.Name = Name;
        this.nid_num = nid_num;
        this.phone_number = phone_number;
        this.ID = ID;
        this.email = email;
        this.pass = pass;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getNid_num() {
        return nid_num;
    }

    public void setNid_num(int nid_num) {
        this.nid_num = nid_num;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "User{" + "Name=" + Name + ", nid_num=" + nid_num + ", phone_number=" + phone_number + ", ID=" + ID + ", email=" + email + ", pass=" + pass + '}';
    }

    

   
    
    
}
