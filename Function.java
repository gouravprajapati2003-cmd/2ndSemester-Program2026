public class Function {

    public static int fun(int n) {
        if (n == 1) {
            return 1;
        }

        int x = 1;
        for (int k = 1; k < n; ++k) {
            x = x + fun(k) * fun(n - k);
        }

        return x;
    }

    public static void main(String[] args) {
        int n = 5;   
        int result = fun(n);
        System.out.println(result);
    }
}
