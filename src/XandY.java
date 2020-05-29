import java.util.Scanner;

public class XandY {
    public static boolean check(int x) {
        while (x != 0) {
            if (x % 2 == 0 && x != 1) {
                x = x / 2;
            } else if (x == 1) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    public static int num(int x, int y) {
        int count = 0;
        while (x != y) {
            if (y % 2 == 0) {
                if (y % x == 0 && check(y / x)) {
                    x = x * 2;
                    count++;
                } else {
                    x = x - 1;
                    count++;
                }
            }else{
                if((y+1)%x==0 && check((y+1)/x)&& (y+1)!=x){
                    x = x * 2;
                    count++;
                } else {
                    x = x - 1;
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập x: ");
        int x = sc.nextInt();
        System.out.println("Nhập y: ");
        int y = sc.nextInt();
        System.out.println("số bước: " + num(x, y));
    }
}
