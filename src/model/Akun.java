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
public class Akun {
    private String NoRekening;
    private String NamaRekening;
    private String password;
    private int saldo;
    
    public String getNoRekening() {
        return NoRekening;
    }

    public void setNoRekening(String NoRekening) {
        this.NoRekening = NoRekening;
    }

    public String getNamaRekening() {
        return NamaRekening;
    }

    public void setNamaRekening(String NamaRekening) {
        this.NamaRekening = NamaRekening;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public void saveData() {
        Db db = new Db();
        String s = "INSERT INTO `Akun`(`no_rek`, `nama_rek`, `password_rek`, `saldo`) VALUES"
                + "('"+this.getNoRekening()+"', '"+this.getNamaRekening()+"', '"+this.getPassword()+"', '"+this.getSaldo()+"')";
        db.query(s);
    }
    
    public void deleteData() {
        Db db = new Db();
        String s = "DELETE FROM `akun` WHERE no_rek = '"+getNoRekening()+"'";        
        db.query(s);
    }
}
