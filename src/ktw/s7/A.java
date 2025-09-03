package ktw.s7;

import java.util.Arrays;

/**
 * 재귀함수
 * 자연수 이 입력되면 재귀함수를 이용하여 부터 까지를 출력하는 프로그램을 작성하세요 N 1 N .
 * ▣ 입력설명
 * 첫 번째 줄은 정수 이 입력된다
 * N(3<=N<=10) .
 * ▣ 출력설명
 * 첫째 줄에 출력한다.
 * ▣ 입력예제 1
 * 3
 * ▣ 출력예제 1
 * 1 2 3
 */
public class A {

    public static void main(String[] args) {
        int N = 3;
        solution(N);
    }

    public static void solution(int N) {
        if(N <= 0) return;

        solution(N-1);
        System.out.println("N = " + N);
    }
}
