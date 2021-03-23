/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubesfix;

/**
 *
 * @author User
 */
public class Anggota {
    private String fullname;
    private String username;
    private String password;
    private String phone;
    private String address;
   
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public void saveData() {
        Db db = new Db();
        String s = "INSERT INTO `anggota`(`fullname`, `username`, `password`, `phone`, `address`) VALUES "
                + "('"+this.getFullname()+"', '"+this.getUsername()+"', '"+this.getPassword()+"', '"+this.getPhone()+"', '"+this.address+"')";
        db.query(s);
    }
}
