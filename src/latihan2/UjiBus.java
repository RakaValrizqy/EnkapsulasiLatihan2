package latihan2;

public class UjiBus {
    public static void main(String[] args) {
        //membuat objek busBesar dari kelas Bus
        Bus busBesar = new Bus(40);
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(15);//menambahkan 15 penumpang
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(5);//menambahkan 5 penumpang
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(26);//menambahkan 5 penumpang
        busBesar.cetak();
    }
    
}
