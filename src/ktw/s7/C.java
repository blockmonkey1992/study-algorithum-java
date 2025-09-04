package ktw.s7;

/**
 * 팩토리얼
 * 자연수 이 입력되면 N! 구하는 프로그램을 작성하세요
 * 예를들어, 5! = 5*4*3*2*1=120 입니다.
 * ▣ 입력설명
 * 첫 번째 줄에 자연수 이 주어집니다
 * N(1<=N<=10) .
 * ▣ 출력설명
 * 팩토리얼 값을 출력합니다
 */
public class C {

    public static void main(String[] args) {
        int N = 5;

        System.out.println(solution(N));
    }

    public static int solution(int N) {
        if (N <= 1) return 1;
        return N * solution(N - 1);
    }
}
