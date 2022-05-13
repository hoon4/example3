import java.util.Scanner;

public class example3_3 {
    public static void main(String[] args) {
        System.out.println("[인공지능 프로그램 V3]");
        System.out.println("===========================");

        float[][] data = {{374, 385, 375, 401}                 // 방문자수, 예측값 데이터 생성
                          , {1161, 1401, 1621, 1681}};
        float performance = 0;                                 // 인공지능의 성능을 계산할 변수

        System.out.println("[안내] 인공지능 프로그램에 할당된 데이터");

        for(int i = 0; i < data[0].length; i++) {             // 입력된 방문자수, 예측값 데이터 출력 반복문
            System.out.printf("%d 번째 데이터) [실제값] 웹 페이지 방문자 수 : %.1f [인공지능 예측값] 웹 페이지 방문자 수 : %.1f \n", i+1, data[0][i], data[1][i]);
        }

        System.out.printf("\n");

        for(int i = 0; i< data[0].length; i++) {              // 오차, 오차의 제곱값을 출력하는 반복문
            float diff = data[0][i] - data[1][i];             // 오차 계산식
            System.out.printf("[%d 번째 데이터] 실제 값과 예측값의 오차 : %.1f \n [안내] 오차의 제곱 : %.1f \n\n", i+1, diff, diff*diff);
            performance = performance + diff*diff;            // 인공지능 성능 계산(오차의 제곱들의 합)
        }

        System.out.println("===========================");
        System.out.println("인공지능 프로그램의 성능(오차의 제곱 합) : " + performance);



    }
}
