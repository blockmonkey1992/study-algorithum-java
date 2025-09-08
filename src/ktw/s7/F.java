package ktw.s7;

public class F {
    static int n;
    static int[] check;

    public static void main(String[] args) {
        n = 3;
        check = new int[n+1];
        solution(1);
    }

    public static void solution(int l) {
        if(l == n+1) {
            String tmp = "";

            for(int i = 1; i <= n; i++) {
                if(check[i] == 1) {
                    tmp += i + " ";
                }
            }

            if(!tmp.isEmpty()) {
                System.out.println(tmp);
            }
        } else {
            check[l] = 1;
            solution(l+1);
            check[l] = 0;
            solution(l+1);
        }
    }
}
