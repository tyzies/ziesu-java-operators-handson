public class ExpressionPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Expression, Statement & Block
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk memahami
         * perbedaan antara expressions, statements, dan blocks.
         */

        // ===== EXPRESSIONS =====
        System.out.println("=== EXPRESSIONS ===");

        // Latihan 1: Buat arithmetic expressions dan simpan hasilnya
        int a = 10;
        int b = 5;
        // - Buat expression yang menjumlahkan a dan b, simpan dalam variabel 'sum'
        int sum = a + b;

        // - Buat expression yang mengalikan a dan b, simpan dalam variabel 'product'
        int product = a * b;

        // - Buat boolean expression yang mengecek apakah a lebih besar dari b
        boolean ab = a > b;

        // - Buat string expression yang menggabungkan "Hello" dan "World"
        String hello = "Hello ";
        String world = "World";
        String helloWorld = hello + world;

        // - Buat method call expression menggunakan Math.pow(2, 3)
        double math = Math.pow(2, 3);

        // - Print semua hasil expression dengan label yang deskriptif
        System.out.println("Sum (expression menjumlahkan a dan b): " + sum);
        System.out.println("Product (expression mengalikan a dan b): " + product);
        System.out.println("Boolean (expression a lebih besar dari b?): " + ab);
        System.out.println("String (expression menggabungkan \"Hello\" dan \"World\": " + helloWorld);
        System.out.println("Math (expression Math.pow()): " + math);

        // ===== STATEMENTS =====
        System.out.println("\n=== STATEMENTS ===");

        // Latihan 2: Buat berbagai jenis statements
        // - Buat declaration statement untuk variabel integer 'score'
        int score;

        // - Buat assignment statement untuk memberikan nilai 85 ke score
        score = 85;

        // - Buat conditional statement yang mencetak "Pass" jika score >= 60, "Fail" jika sebaliknya
        System.out.println(score >= 60 ? "Pass" : "Fail");

        // - Buat loop statement yang mencetak angka 1 sampai 3
        for (int i = 0; i < 3; i++) {
            System.out.println(i + 1);
        }

        // ===== BLOCKS =====
        System.out.println("\n=== BLOCKS ===");

        // Latihan 3: Buat dan gunakan blocks
        int x = 15;

        // - Buat if block yang mengecek apakah x > 10
        // Di dalam block, deklarasikan variabel 'category' dan assign "High"
        // Print kedua nilai x dan category
        if (x > 10) {
            String category = "High"; // hanya ada di dalam block if
            System.out.println("x = " + x + ", category = " + category);
        }

        // - Buat for loop block yang melakukan iterasi 3 kali
        // Di dalam block, deklarasikan variabel 'iteration' yang menunjukkan nomor loop saat ini
        // Print nomor iterasi
        for (int i = 1; i <= 3; i++) {
            int iteration = i; // variable lokal tiap iterasi
            System.out.println(iteration);
        }

        // Latihan 4: Demonstrasikan variable scope dengan blocks
        int outerVariable = 100;

        {
            // - Di dalam block ini, deklarasikan variabel 'innerVariable' dengan nilai 50
            // - Print kedua outerVariable dan innerVariable
            // - Modifikasi outerVariable di dalam block ini (tambahkan 25)
            int innerVariable = 50;
            System.out.println("inside block: outerVariable = " + outerVariable + ", innerVariable = " + innerVariable);
            outerVariable += 25;
        }

        // - Print outerVariable setelah block (seharusnya menunjukkan nilai yang sudah dimodifikasi)
        System.out.println("after block: outerVariable = " + outerVariable);

        // - Coba print innerVariable di sini - apa yang terjadi? (Comment baris ini setelah testing)
        // System.out.println(innerVariable); // ERROR: cannot find symbol - innerVariable hanya ada dalam block di atas
    }
}