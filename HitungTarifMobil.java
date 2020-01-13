//file yang ini berisi aritmatika dan logika
// ini mewarisi method dari EntitasSewaMobil
//return untuk memberikan nilai 

public class HitungTarifMobil extends EntitasSewaMobil{ 
    private int tarif;
    private double diskon;
    private double bayar;
    private String mobil;
    private String ostatus;
     
    public String get_status(){ //ini membuat function untuk mengambil inputan status 
        if(status==1){
            ostatus="Dengan Supir";
        }
        else if(status==2){
            ostatus="Tanpa Supir";
        }
        return ostatus;
    }
    
    public int get_tarif(){ //ini rumus dan penghitung biaya
        if(jenis==1){
            //mobil="marcedes";
            tarif = lama*275000;
        }  
        else if (jenis==2){
            //mobil="ferari";
            tarif = lama*300000;
        }
        else if (jenis==3){
            //mobil="lamborgini";
            tarif = lama*375000;
        }
        return tarif;
    }
    
    public String get_mobil(){  //ini untuk membuat jenis mobilnya
        if(jenis==1){
            mobil="Marcedes";
            //tarif = lama*275000;
        }  
        else if (jenis==2){
            mobil="Ferari";
            //tarif = lama*300000;
        }
        else if (jenis==3){
            mobil="Lamborgini";
            //tarif = lama*375000;
        }
        return mobil;
    }
    
    public double get_diskon(){
        if (status==1){
            if(lama>=4 && lama<=7){
                diskon = 0.20 * tarif;
            }
            else if (lama>7) {
                diskon = 0.35 * tarif;
            }
        }
        else if (status==2){
            if (lama>=4 && lama<=7){
                diskon = 0.10 * tarif;
            }
            else if (lama>7){
                diskon = 0.15 * tarif;
            }
        }   
        return diskon;
    }
    
    public double get_bayar(){
        return tarif-diskon;
    }  
} 