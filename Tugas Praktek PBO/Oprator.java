/* Contoh pengoperasian variabel bertype dasar */ 
 
public class Oprator { 
 
    public static void main(String[] args) { 
        // TODO Auto-generated method stub 
        /* Kamus */ 
        boolean Bool1, Bool2, TF;  
        int i, j, hsl; 
        float x, y, res; 
        
        /* algoritma */ 
        System.out.println("== HASIL OUTPUT PROGRAM OPERATOR ==\n"); 
 
        // --- OPERASI BOOLEAN ---
        Bool1 = true; Bool2 = false; 
        System.out.println("Bool1 = " + Bool1 + ", Bool2 = " + Bool2);
        
        TF = Bool1 && Bool2; System.out.println("AND (&&) : " + TF); 
        TF = Bool1 || Bool2; System.out.println("OR  (||) : " + TF);  
        TF = !Bool1;         System.out.println("NOT (!)  : " + TF); 
        TF = Bool1 ^ Bool2;  System.out.println("XOR (^)  : " + TF);    
        
        // --- OPERASI NUMERIK INTEGER ---
        System.out.println("\n== Operasi Numerik Integer (i=5, j=2) ==");
        i = 5; j = 2; 
        System.out.println("Tambah (+) : " + (i + j));  
        System.out.println("Kurang (-) : " + (i - j));  
        System.out.println("Kali   (*) : " + (i * j));  
        System.out.println("Bagi   (/) : " + (i / j) + " (Pembagian Bulat)"); 
        System.out.println("Modulo (%) : " + (i % j) + " (Sisa Bagi)");  
 
        // --- OPERASI NUMERIK FLOAT ---
        System.out.println("\n== Operasi Numerik Float (x=5.0, y=5.0) ==");
        x = 5; y = 5; 
        System.out.println("Tambah (+) : " + (x + y));  
        System.out.println("Kurang (-) : " + (x - y));  
        System.out.println("Bagi   (/) : " + (x / y));  
        System.out.println("Kali   (*) : " + (x * y)); 
        
        // --- OPERASI RELASIONAL ---
        System.out.println("\n== Operasi Relasional (i=5, j=2) ==");
        System.out.println("Apakah i == j? " + (i == j));  
        System.out.println("Apakah i != j? " + (i != j)); 
        System.out.println("Apakah i < j?  " + (i < j));  
        System.out.println("Apakah i > j?  " + (i > j));  
        System.out.println("Apakah i <= j? " + (i <= j));  
        System.out.println("Apakah i >= j? " + (i >= j)); 
        
        System.out.println("\n== Operasi Relasional (x=5.0, y=5.0) ==");
        System.out.println("Apakah x != y? " + (x != y)); 
        System.out.println("Apakah x < y?  " + (x < y));  
        System.out.println("Apakah x > y?  " + (x > y));  
        System.out.println("Apakah x <= y? " + (x <= y));  
        System.out.println("Apakah x >= y? " + (x >= y)); 
    } 
}