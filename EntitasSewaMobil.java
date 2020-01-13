//Entitas ini berfungsi sebagai entitas yang berisi getter dan setter.
//method-methodnya ada di sini. 

public class EntitasSewaMobil {
    protected int jenis, lama, status;
    protected String nama, alamat;
     
    public int getJenis() {
        return jenis;
    }
    
    public void setJenis(int jenis) {
        this.jenis = jenis;
    }

    public int getLama() {
        return lama;
    }
    
    public void setLama(int lama) {
        this.lama = lama;
    }

    public int getStatus() {
        return status;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }

    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }       
} 