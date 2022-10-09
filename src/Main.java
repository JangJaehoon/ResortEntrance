/*
    놀이동산 입장권 계산 프로그램
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("[입장권 계산]");

        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력해 주세요. (숫자) : ");
        int age = sc.nextInt();

        System.out.print("입장시간을 입력해 주세요. (숫자입력) : "  );
        int entryTime = sc.nextInt();

        System.out.print("국가 유공자 여부를 입력해 주세요. (y/n) : " );
        char nationalRespect = sc.next().trim().charAt(0);

        System.out.print("복지카드 여부를 입력해 주세요. (y/n) : " );
        char welfare = sc.next().trim().charAt(0);

        int price;

        if(age < 3){
            price = 0;
        }else if(age < 13 || entryTime >= 17){
            price = 4000;
        }else if(nationalRespect == 'y' || welfare == 'y') {
            price = 8000;
        }else{
            price = 10000;
        }

        String ans = String.format("입장료 : %d", price);
        System.out.println(ans);
    }
}