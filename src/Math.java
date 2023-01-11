import java.util.Scanner;
public class Math {
    public int alg(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Введіть перше число: ");
        int m= scanner.nextInt();
        System.out.print("Введіть друге число: ");
        int n=scanner.nextInt();
        while(n!=m) {
            if (n > m) {
                n = n - m;
            } else {
                m = m - n;
            }
        }
        System.out.println(String.format("НСД:%s",n));
        return n;
    }
    public int alg_text(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Введіть перше число: ");
        int m= scanner.nextInt();
        System.out.print("Введіть друге число: ");
        int n=scanner.nextInt();
        while(n!=m) {
            if (n > m) {
                System.out.println(String.format("%s-%s=%s", n, m,n-m));
                n = n - m;
            } else {
                System.out.println(String.format("%s-%s=%s", m, n,m-n));
                m = m - n;
            }
        }
        System.out.println(String.format("НСД:%s",n));
        return n;
    }
}
