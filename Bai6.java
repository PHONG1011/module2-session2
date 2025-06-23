import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên N: ");
        int N = scanner.nextInt();

        // Nếu N là số âm, chuyển thành số dương
        N = Math.abs(N);

        int sum = 0;
        while (N > 0) {
            sum += N % 10; // Lấy chữ số cuối cùng và cộng vào tổng
            N /= 10;       // Bỏ chữ số cuối cùng
        }

        System.out.println("Tổng các chữ số là: " + sum);
    }
}