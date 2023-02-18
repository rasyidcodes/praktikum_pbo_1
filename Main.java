import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Rasyid Kusnady 22/505791/SV/21936

        //Nomer 1 =====

        int jumlahUang = 500000;
        int hargaKemeja = 200000;
        int hargaDiskon = hargaKemeja * 50/100;
        int hargaKemejaDiskon = hargaKemeja - hargaDiskon;


        int sisaUang = jumlahUang - hargaKemejaDiskon;
        System.out.println("Uang Aji yang tersisa : " + sisaUang);

        //Nomer 2 =====

        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan harga makanan : ");

        int hargaMakanan = scan.nextInt();
        int totalMakanan = hargaMakanan * 4;
        int sisaUangMakanan = sisaUang - totalMakanan;

        if (sisaUangMakanan == 0){
            System.out.println("Uang Habis");
        }else if(sisaUangMakanan < 0){
            System.out.println("Uang kurang : " + sisaUangMakanan * -1);
        }else {
            System.out.println("Uang sisa : " + sisaUangMakanan);
        }
    }
}