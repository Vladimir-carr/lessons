public class Level1
{
    public static int squirrel(int N) {
        int a = fac(N);
        int b = Integer.parseInt(Integer.toString(a).substring(0,1));
        return b;
    }
    public static int fac(int A) {
        return (A == 1 || A == 0) ? 1 : A * fac(A - 1);
    }
}
