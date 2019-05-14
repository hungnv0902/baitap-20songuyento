import java.util.Scanner;

public class songuyento20 {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao so luong so nguyen to: ");
        number = input.nextInt();
        int count = 0;
        int N = 2;
        while (count < number) {
            int i = 2;
            boolean check = true;
            for(i = 2;i <= Math.sqrt(N);i++) {
                if(N % i == 0){
                    check = false;
                    break;
                }
            }
            if(check) {
                System.out.println(N);
                count ++;
            }
            N ++;
        }
    }
}
