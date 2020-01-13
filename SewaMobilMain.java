//file ini untuk membuat framenya. 
//IOException fungsinya adalah 

import java.io.IOException;
import javax.swing.JOptionPane;
 
public class SewaMobilMain {
    public static void main(String[] args) throws IOException{

        HitungTarifMobil pesan=new HitungTarifMobil();
        
        
        pesan.setNama(JOptionPane.showInputDialog(null, "nama","Masukkan nama anda"));
        
        String msg_nama = "Selamat Datang " + pesan.getNama();
        JOptionPane.showMessageDialog(null, msg_nama);
        String alamat;
        pesan.setAlamat(JOptionPane.showInputDialog("Masukan Alamat Kota"));
        
        boolean stt=true;
        while(stt){
            String menu = "\nPilih Jenis Mobil\n1. Marcedes Rp 275.000/hari\n2. Ferari Rp 300.000/hari\n3. Lamborgini Rp 370.000/hari\nNomor Jenis Mobil Yang Disewa \t: ";
            try {
                pesan.setJenis(Integer.parseInt(JOptionPane.showInputDialog(menu)));
            } 
            catch (Exception e) {  
            }
            if(pesan.getJenis()>3 || pesan.getJenis()<1){
                stt=true;
                JOptionPane.showMessageDialog(null, "Kode Tidak Valid \n Mohon Masukkan Kode yang valid", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else stt=false;
        }
        
        boolean stt2=true;
        while(stt2){
            String status="Status \n1. Dengan Supir \n2. Tanpa Supir";
            try {
                pesan.setStatus(Integer.parseInt(JOptionPane.showInputDialog(status)));
            } 
            catch (Exception e) {
            }
            if(pesan.getStatus()>2 || pesan.getStatus()<1){
                stt2=true;
                JOptionPane.showMessageDialog(null, "Kode Tidak Valid \n Mohon Masukkan Kode yang valid", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else stt2=false;
        }
        
        String lama="Lama Menyewa (Hari)";
        try {
            pesan.setLama(Integer.parseInt(JOptionPane.showInputDialog(lama)));
        } 
        catch (Exception e) {
        }

        String outputHasil= "Pemesanan Berhasil!! \n\nNama                  : "+pesan.getNama()+

                            "\nAlamat Kota       : "+pesan.getAlamat()+

                            "\nJenis Mobil        : "+pesan.get_mobil()+

                            "\nLama Sewa        : "+pesan.getLama()+" Hari"+

                            "\nStatus                 : "+pesan.get_status()+

                            "\nTarif Harga        : Rp."+pesan.get_tarif()+

                            "\nDiskon                : Rp."+pesan.get_diskon()+

                            "\nTotal Bayar        : Rp."+pesan.get_bayar();
        try {
            JOptionPane.showMessageDialog(null,outputHasil);
        } 
        catch (Exception e) {
        }

        int replay = JOptionPane.showOptionDialog(null, "ingin keluar?", "Confirmation",
        JOptionPane.YES_NO_OPTION, 
        JOptionPane.QUESTION_MESSAGE, null, null, null);

        if (replay == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "program akan keluar");
            System.exit(0);
        }else{
            JOptionPane.showMessageDialog(null, );
        }
    }
} 