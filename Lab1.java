/**
 * C2 = 1 01 = "-"
 * C3 = 2 C = 2
 * C5 = 3 O2 = "+"
 * C7 = 4, тип індексів i та j = float
 */
class Lab1 {

    public static void main(String[] args) {
        double S = 0;
        int a = 4;
        int b = 1;
        int n = 6;
        int m = 2;
        int c = 2;
        if (a <= c && c <= n){
            System.out.println("Zero division error!");
            System.exit(0);
        }
        for (float i = a; i <= n; i++) {
            for (float j = b; j <= m; j++) {
                S += (i + j) / (i - c);
            }
        }
        S = S * 1000;
        int k = (int) Math.round(S);
        System.out.println ("Result = " + (double)k / 1000); //округлення числа до 3 знаків після коми
    }
}
