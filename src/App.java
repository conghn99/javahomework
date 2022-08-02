import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    //Câu 5a
    System.out.println("=== Câu 5a ===");
    int x;  // số dòng của ma trận
    int y;  // số cột của ma trận
    Scanner scanner = new Scanner(System.in);
         
    do {
      System.out.println("Nhap vao so dong cua mang:");
      x = scanner.nextInt();
      System.out.println("Nhap vao so cot cua mang:");
      y = scanner.nextInt();
    } while (x < 1 || y < 1);

    int A[][] = new int[x][y];         
    System.out.println("Nhap cac phan tu cho mang A:");
    for (int i = 0; i < x; i++) {
        for (int j = 0; j < y; j++) {
            System.out.print("A[" + i + "," + j + "] = ");
            A[i][j] = scanner.nextInt();
        }
    }
    
    //Câu 5b
    System.out.println("=== Câu 5b ===");
    System.out.println("Mang A:");
    for (int i = 0; i < x; i++) {
        for (int j = 0; j < y; j++) {
            System.out.print(A[i][j] + "\t");
        }
        System.out.println("\n");
    }

    //Câu 5c
    System.out.println("=== Cau 5c ===");
    for(int i = 0; i < A.length; i++){
      for(int j = 0; j < A[i].length; j++){
      	if (i == j) {
          System.out.println("Phan tu nam tren duong cheo chinh la: " + A[i][j]);
        }
      }
    }

    //Câu 5d
    System.out.println("=== Cau 5d ===");
    int B[][] = new int[x][y];
    int C[][] = new int[x][y];

    System.out.println("Nhap cac phan tu cho mang B:");
    for (int i = 0; i < x; i++) {
        for (int j = 0; j < y; j++) {
            System.out.print("B[" + i + "," + j + "] = ");
            B[i][j] = scanner.nextInt();
        }
    }

    System.out.println("Mang B:");
    for (int i = 0; i < x; i++) {
        for (int j = 0; j < y; j++) {
            System.out.print(B[i][j] + "\t");
        }
        System.out.println("\n");
    }   
    
    // Mảng C = mảng A + mảng B
    for (int i = 0; i < x; i++) {
        for (int j = 0; j < y; j++) {
            C[i][j] = A[i][j] + B[i][j];
        }
    }
            
    System.out.println("Mang tong C:");
    for (int i = 0; i < x; i++) {
        for (int j = 0; j < y; j++) {
            System.out.print(C[i][j] + "\t");
        }
        System.out.println("\n");
    }
    scanner.close();
  }
}
