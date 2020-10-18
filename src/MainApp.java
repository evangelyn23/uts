
import java.util.Scanner;

public class MainApp {
   public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);

       //program hasil ipk dan sks
       //mengisi data mahasiswa

       System.out.println("Program hasil ipk dan sks mahasiswa");

       mahasiswa m = new mahasiswa();
       System.out.println("Masukkan nama mahasiswa:");
       m.nama = keyboard.nextLine();

       System.out.println("Masukkan nim mahasiswa:");
       m.NIM = keyboard.nextInt();

       System.out.println("Jurusan(1/2):");
       System.out.println("1.Teknik Informatika");
       System.out.println("2.Sistem Informasi");
       m.jurusan =keyboard.nextInt();

       while(m.jurusan>2){
           System.out.println("Pilihan angka hanya 1/2");
           System.out.println("Jurusan(1/2):");
           System.out.println("1.Teknik Informatika");
           System.out.println("2.Sistem Informasi");
           m.jurusan =keyboard.nextInt();
       }


       System.out.println("Masukkan Semester:");
       m.Semester = keyboard.nextInt();
       while (m.Semester>12){
           System.out.println("ERROR, Semester tidak dapat melebihi 12");
           System.out.println("Masukkan Semester:");
           m.Semester = keyboard.nextInt();
       }

       int sms=m.Semester;

        //menghitung ipk dengan mengambil nilai ipk lama dan ip sekarang
       System.out.println("perhitungan hasil IPK");



           System.out.println("Masukkan IPK semester ke " + (m.Semester - 1) + "=");
           float ipks = keyboard.nextFloat();

           while (ipks > 4) {
               System.out.println("ERROR, angka IPK tidak dapat melebihi 4");
               System.out.println("Masukkan IPK semester ke " + (m.Semester - 1) + "=");
               ipks = keyboard.nextFloat();
           }

           System.out.println("Masukkan IP semester ini:");
           float ip = keyboard.nextFloat();

           while (ip > 4) {
               System.out.println("ERROR, angka IP tidak dapat melebihi 4");
               System.out.println("Masukkan IP semester ini:");
               ip = keyboard.nextFloat();
           }
           System.out.println(" ");


       //menghitung sks

       System.out.println("Masukkan jumlah sks sebelumnya=");
       int Jsks = keyboard.nextInt();

       while(Jsks>160){
           System.out.println("Anda telah Melebihi batas SKS maksimum.");
           System.out.println("Masukkan jumlah keseluruhan sks yang telah diambil=");
           Jsks = keyboard.nextInt();
       }


       IPK c = new IPK (ipks, ip, sms);

       sks s = new sks(Jsks);

           //output

       System.out.println("===========================================================");
       System.out.println("               Program Hasil IPK dan SKS");
       System.out.println("===========================================================");
       System.out.println("Nama Mahasiswa                          : "+m.nama);
       System.out.println("Nim Mahasiswa                           : "+m.NIM);
       if(m.jurusan==1){
           System.out.println("Jurusan Mahasiswa                       : Teknik Informatika");
       }
       if(m.jurusan==2){
           System.out.println("Jurusan Mahasiswa                       : Sistem Informasi");
       }
       System.out.println("Semester                                : "+m.Semester);
       System.out.print("IPK mahasiswa                           : ");
       System.out.printf("%.2f", c.getIpk());
       System.out.println(" ");
       System.out.print(s.toString());
       System.out.println(s.getsks());

       if(Jsks<136) {
           System.out.println(c.toString());
       }
       else{
           System.out.println("Anda dapat mengambil sisa sks yang tersedia");
       }

           if (m.Semester>10){
               System.out.println("Silahkan hubungi admin Universitas untuk memproses sisa sks.");
           }
   }
}



