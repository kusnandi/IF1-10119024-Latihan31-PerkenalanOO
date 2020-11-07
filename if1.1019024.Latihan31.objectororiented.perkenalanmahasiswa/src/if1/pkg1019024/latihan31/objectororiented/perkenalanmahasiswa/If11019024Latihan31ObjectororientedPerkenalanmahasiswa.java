/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg1019024.latihan31.objectororiented.perkenalanmahasiswa;

/**
 *
 * @author Kusnandi
 * NAMA   : Kusnandi Pirmansyah
 * KELAS  : IF-1
 * NIM    : 10119024
 */
public class If11019024Latihan31ObjectororientedPerkenalanmahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Kusnandi Pirmansyah";
        mhs1.nim = "10119024";
        
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nama = "Agi Sutrisna";
        mhs2.nim = "10119015";
        
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nama = "Aditya Ilham";
        mhs3.nim = "10119016";
        
        Mahasiswa mhs4 = new Mahasiswa();
        mhs4.nama = "Rizal Sihombing";
        mhs4.nim = "10119028";
        
        mhs1.perkenalanDiri();
        mhs2.perkenalanDiri();
        mhs3.perkenalanDiri();
        mhs4.perkenalanDiri();
        
               
    }
    
}
