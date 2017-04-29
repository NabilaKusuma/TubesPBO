/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

/**
 *
 * @author Nabila Kusuma
 */
public class Ruangan {
    private String Id;
    private PasienInap[] daftarPasien = new PasienInap[5];
    private int jumPasien;
    
    
    public void tambahPasienInap (Pasien p, Dokter d) {
        if (daftarPasien.length>jumPasien){        
            daftarPasien[jumPasien] = new PasienInap(p, d);
            jumPasien++;
        }
    }
    
    public PasienInap getPasienInap(int index){
        return daftarPasien[index];
    }
    
//    public PasienInap getPasienInap(String Id){
//        PasienInap P = null;
//        for (int i=0 ; i<daftarPasien.length ; i++){
//            if (P.getPasien().getId().equals(Id)){
//                P.
//            }
//        }
    
    public PasienInap getPasienInap(String Id) {
        for (PasienInap P : daftarPasien) {
            if (P.getPasien().getId() == Id) {
                return P;
            }
        }
        return null;
    }

    public void removePasienInap(int index){
        for (int i=index ; i<jumPasien ; i++){
            daftarPasien[i]=daftarPasien[i+1];
        }
        jumPasien--;
    }
}

