import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        System.out.println("===========================");
        System.out.print("[System] 예측에 영향을 주는 원인(광고비)의 값을 알려주세요 (단위 원) : ");
        Scanner sc = new Scanner(System.in);
        int ad_cost = sc.nextInt();
        int a = 2;
        int b = 1;
        int ai_click_count = a * ad_cost + b;

        System.out.println("[안내] 입력된 광고비는 " + ad_cost + " 원 입니다.");
        System.out.println("[안내] AI의 예측(클릭 수)은 " + ai_click_count + "회 입니다.");



    }
}
