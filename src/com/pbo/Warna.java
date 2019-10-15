package com.pbo;

import java.util.Scanner;

/*
 * #Author
 * Nama  : Agung Sepruloh
 * NIM   : 10118902
 * Kelas : IF-11K
 * Deskripsi Program : program ini berguna untuk menampilkan karakter dan kepribadian seseorang
 * berdasarkan warna yang disukai
 *
 */

public class Warna {

    // Text Color
    private static final String RED_TEXT    = "\u001B[31m";
    private static final String GREEN_TEXT  = "\u001B[32m";
    private static final String YELLOW_TEXT = "\u001B[33m";
    private static final String BLUE_TEXT   = "\u001B[34m";
    private static final String PURPLE_TEXT = "\u001B[35m";
    private static final String LIGHT_BLUE_TEXT = "\u001B[36m";
    private static final String WHITE_TEXT  = "\u001B[37m";
    private static final String DEFAULT  = "\u001B[0m";

    // Background Color
    private static final String RED_BACKGROUND = "\u001B[41m";
    private static final String GREEN_BACKGROUND = "\u001B[42m";
    private static final String YELLOW_BACKGROUND = "\u001B[43m";
    private static final String BLUE_BACKGROUND= "\u001B[44m";
    private static final String PURPLE_BACKGROUND = "\u001B[45m";
    private static final String WHITE_BACKGROUND = "\u001B[47m";

    // Personality
    private static final String RED_PERSONALITY [] = {
            "Periang", "Pemberani", "Berani mengambil resiko dalam setiap langkah", "Menyukai tantangan", "Kurang sabar",
            "Dapat menahan marah, namun jika sudah tahap puncak toleransi, kemarhannya akan sulit dikontrol",
            "Memiliki energi kehangan dan cinta", RED_TEXT};
    private static final String GREEN_PERSONALITY [] = {
            "Romantis", "Menyukai hal yang berbau alami dan keindahan", "Teguh pada prinsip", "Menginginkan kesempurnaan",
            "Mudah cemburu", "Mudah merasa iri", "Menjunjung tinggi suatu nilai toleransi dan kepercayaan", GREEN_TEXT
    };
    private static final String YELLOW_PERSONALITY [] = {
            "Optimis,","Suka bergaul", "Periang", "Senang menolong", "Lincah dan aktif", "Tidak suka meremehkan kekurangan orang lain",
            "Loyal", "Hangat", "Meskipun karakternya optimis dan idealis, sering kali goyah dan tidak stabil", "Cenderung penakut", YELLOW_TEXT
    };
    private static final String BLUE_PERSONALITY [] = {
            "Menyenangkan", "Bijaksana", "Pembawaan diri tenang saat menghadapi masalah", "Dinamis", "Senang Berbagi",
            "Bersahabat", "Tidak terlalu suka menjadi sorotan banyak orang",
            "Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai", BLUE_TEXT
    };
    private static final String PURPLE_PERSONALITY [] = {
            "Optimis", "Tidak pernah ragu", "Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat",
            "Memiliki ambisi yang besar", "Memiliki empati yang besar", "Memiliki sisi misterius sebab seringkali menutup perasaannya",
            "Terkadang bersikap keras kepala dan angkuh", PURPLE_TEXT
    };

    public static String [] checkPersonality(String color) {
        String [] personality = {};
        String colorText;
        switch (color) {
            case "MERAH":
                personality = RED_PERSONALITY;
                break;
            case "HIJAU":
                personality = GREEN_PERSONALITY;
                break;
            case "KUNING":
                personality = YELLOW_PERSONALITY;
                break;
            case "BIRU":
                personality = BLUE_PERSONALITY;
                break;
            case "UNGU":
                personality = PURPLE_PERSONALITY;
                break;
            default:
                return new String[] {"Oops.. Belum teridentifikasi"};
        }

        return personality;
    }

    public static void main(String[] args) {
        System.out.println(String.format("%sYuk %sCek %sKepribadianmu %sDari %sWarna %sFavoritmu %s\n",
                RED_TEXT, GREEN_TEXT, YELLOW_TEXT, LIGHT_BLUE_TEXT, PURPLE_TEXT, BLUE_TEXT, WHITE_TEXT));
        System.out.println(String.format("%s%s\tMERAH\t\t%s", WHITE_TEXT, RED_BACKGROUND, DEFAULT));
        System.out.println(String.format("%s%s\tHIJAU\t\t%s", WHITE_TEXT, GREEN_BACKGROUND, DEFAULT));
        System.out.println(String.format("%s%s\tKUNING\t\t%s", WHITE_TEXT, YELLOW_BACKGROUND, DEFAULT));
        System.out.println(String.format("%s%s\tBIRU\t\t%s", WHITE_TEXT, BLUE_BACKGROUND, DEFAULT));
        System.out.println(String.format("%s%s\tUNGU\t\t%s", WHITE_TEXT, PURPLE_BACKGROUND, DEFAULT));

        System.out.print("\nPilih warna favoritmu\t: ");
        Scanner scanner = new Scanner(System.in);
        String favColor = scanner.next().toUpperCase();
        System.out.print("Nama kamu\t\t\t\t: ");
        Scanner scanner1 = new Scanner(System.in);
        String name = scanner1.nextLine().toUpperCase();
        String [] result = checkPersonality(favColor);

        System.out.println("\n===== HASIL TEST KEPRIBADIAN ".concat(name).concat(" ====="));
        if (result.length > 1) {
            System.out.println(String.format("Warna favoritmu adalah %s%s%s", result[result.length - 1], favColor, DEFAULT));
            for (int i = 0; i < result.length - 1; i++) {
                System.out.println(String.format("%d. %s", i+1, result[i]));
            }
        } else {
            System.out.println(result[0]);
        }
    }
}
