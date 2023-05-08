import java.util.Scanner;

public class InputOutput{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String nama;
        int jumlahsks;
        double IPK;

        System.out.print("Masukkan nama kamu : ");
        nama = scanner.nextLine();
        System.out.println("Halo, "+nama);

        System.out.print("Masukkan jumlah SKS yang sudah ditempuh : ");
        jumlahsks = scanner.nextInt();

        System.out.print("Masukkan IPK sementara : ");
        IPK = scanner.nextDouble();

        double jumlah = IPK * jumlahsks;
        System.out.print("Total Nilai = "+jumlah);
    }
  }
