/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

/**
 *
 * @author Niko
 */
public class Aplikasi {
    private Dokter[] daftarDokter;
    private Pasien[] daftarPasien;
    private Ruangan[] daftarRuangan;
    private int jumDokter,jumPasien,jumRuangan;
    
    public void addDokter(Dokter d) {
        if (jumDokter<daftarDokter.length) {
            daftarDokter[jumDokter] = d;
        }
        jumDokter++;
    }
     public void addPasien(Pasien p) {
        if (jumPasien<daftarPasien.length) {
            daftarPasien[jumPasien] = p;
        }
        jumPasien++;
    }
  
    public Pasien getPasien(String Id) {
        for (Pasien P : daftarPasien) {
            if (P.getId()== Id) {
                return P;
            }
        }
        return null;
    } 
    
    
}
