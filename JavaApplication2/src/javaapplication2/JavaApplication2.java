/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author LAB F
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        jajan pancong = new jajan ();
        //pancong.bentuk = "lonjong";
        pancong.setBentuk("lonjong");
        pancong.rasa = "Tiramisu";
        pancong.harga = 5000;
        pancong.warna = "pink";
        
        System.out.println("Bentuknya: "+pancong.getBentuk());
    }
    
}

 class jajan {
    private String bentuk;
    String warna;
    float harga;
    String rasa;
    
    public void setBentuk(String bnt) {
        this.bentuk = bnt;
    }
     public String getBentuk(){
        return this.bentuk;
}
 }