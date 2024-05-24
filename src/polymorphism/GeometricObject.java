/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polymorphism;

// Superclass: ObjekGeometris
public class GeometricObject {
    private String warna = "putih";
    private boolean terisi = false;

    // Konstruktor default
    public GeometricObject() {
    }

    // Konstruktor dengan parameter
    public GeometricObject(String warna, boolean terisi) {
        this.warna = warna;
        this.terisi = terisi;
    }

    // Getter dan setter untuk warna
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Getter dan setter untuk terisi
    public boolean isTerisi() {
        return terisi;
    }

    public void setTerisi(boolean terisi) {
        this.terisi = terisi;
    }

    @Override
    public String toString() {
        return "warna: " + warna + " dan terisi: " + terisi;
    }
}
