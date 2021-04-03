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
public class Transaksi {
    String noRekening;
    double saldo;
    double saldoAwal;
    double saldoAkhir;
    String tanggalTransaksi;
    String type;
    Rekening rkn[] = new Rekening[14];
    
    Transaksi(String f, double a, double b, double c, String d){
        noRekening = f;
        saldo = a;
        saldoAwal = b;
        saldoAkhir = c;
        tanggalTransaksi = d;
//        type = e;
    }
    
    public int FindSearch(int cari){
        int posisi = -1; 
        for (int j = 0; j < rkn.length; j++) {
            if (rkn[j].saldo == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    
    public void TampilPosisi(String x, int pos){
        if (pos != -1) { 
            System.out.println("data    : " + x + " ditemukan pada index " + pos);
        } else {
            System.out.println("data "  + x + " tidak ditemukan");
        }
    }
}
