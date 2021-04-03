/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu8;

/**
 *
 * @author HP
 */
public class Rekening {
    String noRekening;
    String namaDepan;
    String namaBelakang;
    String phone;
    String email;
    double saldo;
    Rekening rkn[] = new Rekening[14];
    
    Rekening(String a, String b, String c, String d, String e){
        noRekening = a;
        namaDepan = b;
        namaBelakang = c;
        phone = d;
        email = e;
    }
    
    
    void insertionSort(boolean asc){
        for (int i = 1; i < rkn.length; i++) {
            Rekening temp = rkn[i];
            int j = i;
            if (asc) {
                
            } else {
                
            }
            rkn[j] = temp;
        }
    }
    
    void tampilAll(){
        for (Rekening l : rkn) {
            l.tampilAll();
            System.out.println("===============================================");
        }
    }
}
