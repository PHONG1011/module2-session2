import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập 3 cạnh
        System.out.print("Nhập cạnh a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập cạnh b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập cạnh c: ");
        int c = scanner.nextInt();

        // Kiểm tra hợp lệ của tam giác
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Ba cạnh phải là số nguyên dương.");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Ba cạnh không tạo thành tam giác.");
        } else {
            // Phân loại tam giác
            if (a == b && b == c) {
                System.out.println("Tam giác đều.");
            } else if (a == b || a == c || b == c) {
                System.out.println("Tam giác cân.");
            } else if (a * a == b * b + c * c ||
                    b * b == a * a + c * c ||
                    c * c == a * a + b * b) {
                System.out.println("Tam giác vuông.");
            } else {
                System.out.println("Tam giác thường.");
            }
        }
    }
}