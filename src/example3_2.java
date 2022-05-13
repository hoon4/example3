import java.util.Scanner;

public class example3_2 {
    public static void main(String[] args) {
        System.out.println("===========================");
 //       System.out.print("[System] 예측에 영향을 주는 원인(광고비)의 값을 알려주세요 (단위 원) : ");
        int[] ad_cost = {580, 700, 810, 840};              // 광고비 배열 ad_cost 선언

        Scanner sc = new Scanner(System.in);

        System.out.print("[System] a의 값을 알려주세요 : ");  // a/b 값을 입력받음
        int a = sc.nextInt();
        System.out.print("[System] b의 값을 알려주세요 : ");
        int b = sc.nextInt();
        int ai_click_count = 0;                           // 클릭수를 계산하는 변수

        System.out.println("[안내] 입력된 광고비는 다음과 같습니다.");
        for(int i = 0; i< ad_cost.length; i++) {                    // 광고비를 출력하는 반복문
            System.out.print( i+1 + "번째) " + ad_cost[i] + " 원");
        }
        System.out.println();

        System.out.println("[안내] AI의 예측(클릭 수)은 다음과 같습니다.");
        for(int i = 0; i< ad_cost.length; i++) {                    // 예측수를 출력하는 반복문
            ai_click_count = a * ad_cost[i] + b;
            System.out.println(i+1 +"번째 예측 : " + ai_click_count + "회 방문");

        }
    }
}
