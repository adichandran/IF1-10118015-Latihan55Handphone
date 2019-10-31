/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan55handphone;

/**
 *
 * @author ACER
 */
public class Handphone {
    protected String Manufacture;
    protected String operatingSystem;
    protected String model;
    protected int harga;

    public Handphone(String Manufacture, String operatingSystem, String model, int harga) {
        this.Manufacture = Manufacture;
        this.operatingSystem = operatingSystem;
        this.model = model;
        this.harga = harga;
    }
    
    public void displayProduct(){
        System.out.println("Manufaktur : "+ Manufacture);
        System.out.println("OS : "+operatingSystem);
        System.out.println("Model : "+model);
        System.out.println("Harga : "+harga);
    }
}
