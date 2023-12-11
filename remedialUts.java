import java.util.ArrayList;
import java.util.Scanner;

public class remedialUts{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String namaMahasiswa;
        Integer smt;
        
        String opsiKeluar1 = "";
        String opsiKeluar2 = "";
        Double jumlahBobot = 0.0;
        Integer jumlahSks = 0;
        ArrayList<String> listKode = new ArrayList<>();
        ArrayList<String> listMataKuliah = new ArrayList<>();
        ArrayList<Integer> listSks = new ArrayList<>();
        ArrayList<String> listHurufMutu = new ArrayList<>();
        ArrayList<Double> listBobot = new ArrayList<>();
        ArrayList<Double> listNilai = new ArrayList<>();
        
        System.out.print("Nama Mahasiswa: ");
        namaMahasiswa = scanner.nextLine();
        System.out.print("Semester: ");
        smt = scanner.nextInt();
        
        System.out.println("Masukkan kode, mata kuliah, SKS, Huruf Mutu, Bobot dan Nilai:");
        scanner.nextLine();
     
        while (true){
            Integer sks;
            Double bobot;
            String kode;
            String mataKuliah;
            String hurufMutu;
            Double nilai;
            System.out.print("Kode: ");
            kode = scanner.nextLine();
            listKode.add(kode);
            
            System.out.println("");
            System.out.println("Mata Kuliah: ");
            mataKuliah = scanner.nextLine();
            listMataKuliah.add(mataKuliah);
            
            
            System.out.println("");
            System.out.print("Huruf Mutu: ");
            hurufMutu = scanner.nextLine();
            listHurufMutu.add(hurufMutu);
            
            System.out.println("");
            System.out.print("SKS: ");
            sks = scanner.nextInt();
            listSks.add(sks);
            
            System.out.println("");
            System.out.print("Bobot: ");
            bobot = scanner.nextDouble();
            listBobot.add(bobot);
            
            System.out.println("");
            System.out.println("Nilai: ");
            nilai = scanner.nextDouble();
            listNilai.add(nilai);
            
            jumlahBobot += bobot;
            jumlahSks += sks;
          
            System.out.print("Input Lagi ya/tidak: ");
            opsiKeluar1=scanner.nextLine();
            opsiKeluar2 = scanner.nextLine();
            
            if (opsiKeluar1.equalsIgnoreCase("tidak") || opsiKeluar2.equalsIgnoreCase("tidak")){
                break;
            }

        }


        // Menampilkan nilai dari ArrayList
      
        System.out.println("NO\tKODE\tMATAKULIAH\tSKS\tHuruf Mutu\tBobot\tNilai");
        System.out.println("");
        
        for(int i=0; i < listMataKuliah.size(); i++) {
      
             System.out.println((i + 1) + "\t\t" + listKode.get(i) + "\t\t" + listMataKuliah.get(i) + "\t\t" +
            listSks.get(i) + "\t\t" + listHurufMutu.get(i) + "\t\t" + listBobot.get(i) + "\t\t" + listNilai.get(i));
            
        }
        
        System.out.println("Jumlah SKS: " + jumlahSks);
        System.out.println("IP. Semester: " + (jumlahBobot / listMataKuliah.size()));
        System.out.println("SKS Maksimal yang bisa diambil semester depan: 24");

        scanner.close();
    }
}
