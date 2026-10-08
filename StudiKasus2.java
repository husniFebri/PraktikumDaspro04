import java.util.*;

public class StudiKasus2 {
    public static void main(String[] args) {
        Scanner pj = new Scanner(System.in);

        String nama, kegiatan, status;
        int jumdokum, perjuara, kurang, danapkm;

        System.out.print("Masukkan nama : ");
        nama = pj.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/LAINNYA) : ");
        kegiatan = pj.nextLine();

        if (kegiatan.equalsIgnoreCase("Belmawa") || kegiatan.equalsIgnoreCase("Bakorma" ) || kegiatan.equalsIgnoreCase("Mandiri")) {
            System.out.print("Jumlah dokumen : ");
            jumdokum = pj.nextInt();
            System.out.print("Peringkat juara : ");
            perjuara = pj.nextInt();
            if (jumdokum < 4) {
               kurang = 4 - jumdokum;
               status = "Dokumen tidak lengkap (kurang" + kurang + "dokumen). Dana penghargaan tidak diberikan";
            } else {
                if (perjuara <= 3) {
                    status = "Selamat anda mendapatkan dana penghargaan";
                } else {
                    status = "Anda tidak mendapatkan dana pengharagaan";
                }
            }
        } else {
            status = "Anda tidak mendapatkan dana penghargaan. (kegiatan tidak valid)";
  
        }
        System.out.println(status);
    }
}
