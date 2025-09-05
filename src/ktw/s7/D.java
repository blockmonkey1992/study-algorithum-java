package ktw.s7;

/**
 * 피보나치 수열
 * 1) . 2
 * 피보나키 수열을 출력한다 피보나치 수열이란 앞의 개의 수를 합하여 다음 숫자가 되는수열이다.
 * 2) 입력은 피보나치 수열의 총 항의 수 이다 만약  7 이 입력되면 1 1 2 3 5 8 13 을 출력하면된다.
 */
public class D {

    static int[] fiboList;

    public static void main(String[] args) {

        int N = 10;
        fiboList = new int[N+1]; // N + 1개

        solution(N);

        for(int i = 1; i <= N; i++) {
            System.out.print((fiboList[i]) + " ");
        }
    }

    public static int solution(int N) {
        if(fiboList[N] > 0) return fiboList[N];
        if (N == 1) return fiboList[N] = 1;
        if (N == 2) return fiboList[N] = 1;
        return fiboList[N]=solution(N-1) + solution(N-2);
    }
}
