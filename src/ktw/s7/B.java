package ktw.s7;

import java.util.ArrayList;
import java.util.List;

/**
 * 재귀함수를 이용한 이진수 출력 10진수 N 2 진수 이 입력되면 진수로 변환하여 출력하는 프로그램을 작성하세요 단 재귀함수를 이용해서 출력해야 합니다.
 * ▣ 입력설명
 * 첫 번째 줄에 진수 이 주어집니다
 * 10 N(1<=N<=1,000) .
 * ▣ 출력설명
 * 첫 번째 줄에 이진수를 출력하세요.
 */
public class B {

    public static void main(String[] args) {
        int N = 11;

        solution(N);
    }

    public static void solution(int N) {
        if(N <= 0) {
            return;
        }

        solution(N/2);
        System.out.print(N % 2);
    }
}
