import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Math math= new Math();
        JSON j= new JSON();
        System.out.println("Виберіть пунк з меню:\n1.НСД\n2.Повне рішення");
        int num= scanner.nextInt();
        switch (num){
            case 1:
                j.create(math.alg());
                break;
            case 2:
                j.create(math.alg_text());
                break;
        }
    }
}