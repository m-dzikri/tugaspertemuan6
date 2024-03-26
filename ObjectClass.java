package com.pbo.objectclass;

class PersegiPanjang {
    private int panjang;
    private int lebar;

    // Konstruktor tanpa parameter
    public PersegiPanjang() {
        this.panjang = 1;
        this.lebar = 1;
    }

    // Konstruktor dengan parameter
    public PersegiPanjang(int panjangBaru, int lebarBaru) {
        this.panjang = panjangBaru;
        this.lebar = lebarBaru;
    }

    // Metode untuk mengambil luas persegi panjang
    public int getLuas() {
        return this.panjang * this.lebar;
    }

    // Metode untuk mengambil keliling persegi panjang
    public int getKeliling() {
        return 2 * (this.panjang + this.lebar);
    }

    // Metode untuk mengatur panjang persegi panjang
    public void setPanjang(int panjangBaru) {
        this.panjang = panjangBaru;
    }

    // Metode untuk mengatur lebar persegi panjang
    public void setLebar(int lebarBaru) {
        this.lebar = lebarBaru;
    }
}

public class ObjectClass {

    public static void main(String[] args) {
        // Membuat objek persegiPanjang1 dengan panjang = 1 dan lebar = 1
        PersegiPanjang persegiPanjang1 = new PersegiPanjang();

        // Membuat objek persegiPanjang2 dengan panjang = 30 dan lebar = 40
        PersegiPanjang persegiPanjang2 = new PersegiPanjang(30, 40);
        
        // Membuat objek persegiPanjang2 dengan panjang = 25 dan lebar = 35
        PersegiPanjang persegiPanjang3 = new PersegiPanjang(25, 35);

        // Menampilkan luas dan keliling persegi panjang pertama
        System.out.println("Luas Persegi Panjang 1: " + persegiPanjang1.getLuas());
        System.out.println("Keliling Persegi Panjang 1: " + persegiPanjang1.getKeliling());

        // Menampilkan luas dan keliling persegi panjang kedua
        System.out.println("\nLuas Persegi Panjang 2: " + persegiPanjang2.getLuas());
        System.out.println("Keliling Persegi Panjang 2: " + persegiPanjang2.getKeliling());
        
        // Menampilkan luas dan keliling persegi panjang ketiga
        System.out.println("\nLuas Persegi Panjang 3: " + persegiPanjang3.getLuas());
        System.out.println("Keliling Persegi Panjang 3: " + persegiPanjang3.getKeliling());
    }
}
