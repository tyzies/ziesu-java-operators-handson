public class MathOperationsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operasi Matematika
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk berlatih
         * operator aritmatika dan memahami berbagai operasi numerik.
         */

        // ===== OPERATOR ARITMATIKA DASAR =====
        System.out.println("=== OPERATOR ARITMATIKA DASAR ===");

        // Latihan 1: Berlatih operasi aritmatika dasar
        // - Deklarasikan dua integer: num1 = 25, num2 = 4
        int num1 = 25;
        int num2 = 4;

        // - Hitung dan simpan hasil penjumlahan num1 dan num2
        int penjumlahan = num1 + num2;

        // - Hitung dan simpan hasil pengurangan num1 dan num2
        int pengurangan = num1 - num2;

        // - Hitung dan simpan hasil perkalian num1 dan num2
        int perkalian = num1 * num2;

        // - Hitung dan simpan hasil pembagian num1 dibagi num2 (pembagian integer)
        int pembagian = num1 / num2;

        // - Hitung dan simpan sisa bagi num1 dibagi num2 (modulus)
        int modulus = num1 % num2;

        // - Print semua hasil dengan label yang deskriptif
        System.out.println("Penjumlahan: " + num1 + " + " + num2 + " = " + penjumlahan);
        System.out.println("Pengurangan: " + num1 + " - " + num2 + " = " + pengurangan);
        System.out.println("Perkalian: " + num1 + " * " + num2 + " = " + perkalian);
        System.out.println("Pembagian: " + num1 + " / " + num2 + " = " + pembagian);
        System.out.println("Modulus: " + num1 + " % " + num2 + " = " + modulus);

        // ===== PEMBAGIAN INTEGER VS FLOATING-POINT =====
        System.out.println("\n=== PEMBAGIAN INTEGER VS FLOATING-POINT ===");

        // Latihan 2: Jelajahi berbagai jenis pembagian
        // - Lakukan pembagian integer: 17 / 5 dan simpan hasilnya
        int pembagian2 = 17 / 5;

        // - Lakukan pembagian floating-point: 17.0 / 5 dan simpan hasilnya
        double pembagian3 = 17.0 / 5;

        // - Konversi integer ke double sebelum pembagian: (double)17 / 5 dan simpan hasilnya
        double pembagianD = (double) 17 / 5;

        // - Print ketiga hasil pembagian dan amati perbedaannya
        System.out.println("Pembagian Integer: 17 / 5 = " + pembagian2);
        System.out.println("Pembagian Floating-point: 17.0 / 5 = " + pembagian3);
        System.out.println("Pembagian Double: 17 / 5 = " + pembagianD);

        // ===== KALKULASI PRAKTIS =====
        System.out.println("\n=== KALKULASI PRAKTIS ===");

        // Latihan 3: Selesaikan masalah dunia nyata menggunakan operator aritmatika
        // - Hitung luas persegi panjang dengan panjang 12.5 dan lebar 8.3
        double luas = 12.5 * 8.3;

        // - Hitung keliling persegi panjang yang sama
        double keliling = 2 * (12.5 + 8.3);

        // - Hitung total harga: 3 barang dengan harga $15.99 masing-masing, dengan pajak 8%
        double hargaBarang = 15.99 * 3;
        double pajak = hargaBarang * 0.08;
        double totalHarga = hargaBarang + pajak;

        // - Konversi suhu dari Celsius ke Fahrenheit menggunakan rumus: F = (C * 9/5) + 32
        // Gunakan Celsius = 25
        double fahrenheit = (25 * 9/5) + 32;

        // - Hitung berapa minggu penuh dalam 50 hari dan berapa hari sisanya
        int mingguPenuh = 50 / 7;
        int hariSisa = 50 % 7;

        // - Print semua kalkulasi dengan label dan format yang sesuai
        System.out.println("Luas persegi panjang (p * l): 12.5 * 8.3 = " + luas);
        System.out.println("Total harga barang: $" + totalHarga);
        System.out.println("Konversi suhu (C -> F): " + fahrenheit);
        System.out.println("Minggu penuh dalam 50 hari: " + mingguPenuh + " minggu");
        System.out.println("Hari sisa: " + hariSisa + " hari");

        // ===== KALKULASI KOMPLEKS =====
        System.out.println("\n=== KALKULASI KOMPLEKS ===");

        // Latihan 4: Berlatih ekspresi matematika yang kompleks
        // - Hitung jarak menggunakan rumus: jarak = kecepatan * waktu
        // Gunakan kecepatan = 65.5 km/jam dan waktu = 2.75 jam
        double jarak = 65.5 * 2.75;

        // - Hitung bunga majemuk menggunakan rumus sederhana: jumlah = pokok * (1 + suku_bunga) ^ waktu
        // Gunakan Math.pow() untuk perpangkatan
        // pokok = 1000, suku_bunga = 0.05 (5%), waktu = 3 tahun
        double jumlahBunga = 1000 * Math.pow((1 + 0.05), 3);

        // - Hitung rata-rata dari lima nilai ujian: 85, 92, 78, 96, 88
        int rerata = (85 + 92 + 78 + 96 + 88) / 5;

        // - Print semua hasil dengan format yang proper (pertimbangkan menggunakan String.format())
        System.out.printf("Jarak (kecepatan * waktu): %.2f km%n", jarak);
        System.out.printf("Jumlah bunga majemuk setelah 3 tahun (5%%): %.2f%n", jumlahBunga);
        System.out.printf("Rerata Nilai Ujian: %d", rerata);
    }
}
