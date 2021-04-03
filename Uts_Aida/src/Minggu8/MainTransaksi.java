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
import java.util.Scanner;
public class MainTransaksi {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("PILIHAN");
        System.out.println("1. Tampil Data Rekening");
        System.out.println("2. Tampil Data Transaksi");
        System.out.println("3. Mencari Saldo > 500000");
        System.out.println("4. Sorting By Name");
        System.out.println("5. Keluar");
        
        System.out.print("Pilih (1-5) : ");
        int pilih = sc.nextInt();
        System.out.println("");
        
            switch(pilih){
            case 1:
                System.out.println("1. Tampil Data Rekening");
                Rekening[] rkn = new Rekening[14];
                rkn[0] = new Rekening(" No Rekening ", "    Nama Depan ", " Nama Belakang", "   Phone", "       Email");
                rkn[1] = new Rekening("161006170573", "    Arifin", "      Bin Abdul Salam", " 13576430547", " neo@lectusjusto.org");
                rkn[2] = new Rekening("162404012243", "    Ismail", "      Bin Mail", "        5717062", "     convallis@vestibulumanteipsum.org");
                rkn[3] = new Rekening("162705250112", "    Jarjit", "      Singh", "           6230234", "     porttitor.tellus.non@Curabitur.ca");
                rkn[4] = new Rekening("164603294259", "    Isnin", "       Bin Khamis", "      8977608", "     pede.Suspendissedui@a.ca");
                rkn[5] = new Rekening("163304213457", "    Mei Mei", "     Xiao", "            792447", "      non@mus.com");
                rkn[6] = new Rekening("161807297229", "    Jeane Roelia", "Fadhullah", "       8636209", "     Pellentesque.ut.ipsumneque@ca");
                rkn[7] = new Rekening("169503136823", "    Shinnosuke", "  Nohara", "          11153397676", " dictum@nec.edu");
                rkn[8] = new Rekening("160802059329", "    Misae", "       Nohara", "          18917032664", " vel@ullamcorpegmagna.co.uk");
                rkn[9] = new Rekening("160806282995", "    Hinawari", "    Nohara", "          19786325110", " Aliquam.gravida@vestibulumMauris.net");
                rkn[10] = new Rekening("161309092997", "    Nobita", "      Nobi", "            8171766", "     interdum.curabitur.dictum@rutrumurna.edu");
                rkn[11] = new Rekening("168902128963", "    Goda", "        Takeshi", "         16754004501", " et.ulticres@a.co.uk");
                rkn[12] = new Rekening("161410089963", "    Shinici", "     Kudo", "            5279065", "     ut@aultriciesadipiscing.ca");
                rkn[13] = new Rekening("167711267372", "    Kogoro", "      Mouri", "           3535137", "     cubilia.Curae.Phasellus@Duis.com");
        
                for (int i = 0; i < rkn.length; i++) {
                    System.out.println(rkn[i].noRekening+ rkn[i].namaDepan + rkn[i].namaBelakang + rkn[i].phone + rkn[i].email);
                }
                break;
            case 2:
                System.out.println("2. Tampil Data Transaksi");
                Transaksi[] trs = new Transaksi[14];
                trs[0] = new Transaksi("161006170573 ",   205420 ,   200162    ,   775880 , " 2021-06-25 10:23:00");
                trs[1] = new Transaksi("162404012243 ",   838632 ,   350929    ,   328316 , " 2021-09-18 23:00:04");
                trs[2] = new Transaksi("162705250112 ",   230659 ,   204434    ,   690503 , " 2022-02-02 19:10:34");
                trs[3] = new Transaksi("164603294259 ",   816129 ,   8541403    ,  596472 , " 2021-07-16 19:41:20");
                trs[4] = new Transaksi("164603294259 ",   969069 ,   333823    ,   802752 , " 2022-02-01 01:13:11");
                trs[5] = new Transaksi("163304213457 ",   297103 ,   396116    ,   779589 , " 2021-07-03 01:09:49");
                trs[6] = new Transaksi("161807297229 ",   66190  ,   259150    ,   619774 , " 2021-09-09 03:57:30");
                trs[7] = new Transaksi("164603294259 ",   816129 ,   8541403    ,  596472 , " 2021-07-16 19:41:20");
                trs[8] = new Transaksi("160802059329 ",   243306 ,   869468    ,   50238 , "  2021-03-12 03:40:16");
                trs[9] = new Transaksi("160806282995 ",   371045 ,   991142    ,   602034 , " 2021-08-06 11:48:59");
                trs[10] = new Transaksi("161309092997 ",   395170 ,   97058    ,   4277278 , " 2021-05-02 10:53:31");
                trs[11] = new Transaksi("168902128963 ",   862731 ,   561908    ,   472225 , " 2021-07-31 08:11:00");
                trs[12] = new Transaksi("161410089963 ",   556978 ,   31367    ,    725426 , " 2021-03-27 06:18:20");
                trs[13] = new Transaksi("167711267372 ",   66987 ,    823014    ,   868772 , " 2020-12-21 05:57:59");
                
                for (int i = 0; i < trs.length; i++) {
                    System.out.println(i+1 + trs[i].noRekening+ trs[i].saldo + trs[i].saldoAwal + trs[i].saldoAkhir + trs[i].tanggalTransaksi);
                }
                break;
            case 3:
                System.out.println("3. Mencari Saldo > 500000");
                System.out.println("______________________________________________________");
                System.out.println("                    Pencarian Data                    ");
                System.out.println("______________________________________________________");
                System.out.println("Saldo > 500000 ");
                System.out.print("saldo : ");
                int cari = sc.nextInt();
                System.out.println("======================================================");
                System.out.println("Menggunakan Squential Search");
                int posisi = data.FindSearch(cari);
        
                data.TampilPosisi(cari, posisi);
                data.TampilData(cari, posisi);
                
                break;
            case 4:
                System.out.println("4. Sorting By Name");
                Rekening[] rkn = new Rekening[14];
                rkn[0] = new Rekening(" No Rekening ", "    Nama Depan ", " Nama Belakang", "   Phone", "       Email");
                rkn[1] = new Rekening("161006170573", "    Arifin", "      Bin Abdul Salam", " 13576430547", " neo@lectusjusto.org");
                rkn[2] = new Rekening("162404012243", "    Ismail", "      Bin Mail", "        5717062", "     convallis@vestibulumanteipsum.org");
                rkn[3] = new Rekening("162705250112", "    Jarjit", "      Singh", "           6230234", "     porttitor.tellus.non@Curabitur.ca");
                rkn[4] = new Rekening("164603294259", "    Isnin", "       Bin Khamis", "      8977608", "     pede.Suspendissedui@a.ca");
                rkn[5] = new Rekening("163304213457", "    Mei Mei", "     Xiao", "            792447", "      non@mus.com");
                rkn[6] = new Rekening("161807297229", "    Jeane Roelia", "Fadhullah", "       8636209", "     Pellentesque.ut.ipsumneque@ca");
                rkn[7] = new Rekening("169503136823", "    Shinnosuke", "  Nohara", "          11153397676", " dictum@nec.edu");
                rkn[8] = new Rekening("160802059329", "    Misae", "       Nohara", "          18917032664", " vel@ullamcorpegmagna.co.uk");
                rkn[9] = new Rekening("160806282995", "    Hinawari", "    Nohara", "          19786325110", " Aliquam.gravida@vestibulumMauris.net");
                rkn[10] = new Rekening("161309092997", "    Nobita", "      Nobi", "            8171766", "      interdum.curabitur.dictum@rutrumurna.edu");
                rkn[11] = new Rekening("168902128963", "    Goda", "        Takeshi", "         16754004501", "  et.ulticres@a.co.uk");
                rkn[12] = new Rekening("161410089963", "    Shinici", "     Kudo", "            5279065", "      ut@aultriciesadipiscing.ca");
                rkn[13] = new Rekening("167711267372", "    Kogoro", "      Mouri", "           3535137", "      cubilia.Curae.Phasellus@Duis.com");
                System.out.println("-------------------INSERTION SORT-----------------");
                rkn.insertionSort(true);
                list.tampilAll();
                break;
            default:
                System.out.println("5. Keluar");
        }
    }
}
