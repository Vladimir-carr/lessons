public class Level1
{
    public static int [] MadMax(int N, int [] Tele) {
        int[] asc = new int[N];
        int[] desc = new int[N];
        for (int i = 0; i < Tele.length; i++) {
            asc[i] = Tele[i];
            desc[i] = Tele[i];
        }
        for (int i = 0; i < asc.length - 1; i++) {
            for (int j = asc.length - 1; j > i; j--) {
                if (asc[j - 1] > asc[j]) {
                    int tmp = asc[j - 1];
                    asc[j - 1] = asc[j];
                    asc[j] = tmp;
                }
            }
        }
        
        for (int i = 0; i < desc.length - 1; i++) {
            for (int j = desc.length - 1; j > i; j--) {
                if (desc[j - 1] < desc[j]) {
                    int tmp = desc[j - 1];
                    desc[j - 1] = desc[j];
                    desc[j] = tmp;
                }
            }
        }
        int[] total = new int[N];
        int middle = asc.length / 2;
        int i = 0;
        while (i < middle) {
            total[i] = asc[i];
            i++;
        }
        int x = middle;
        i = 0;
        while (x != N) {
            total[x] = desc[i];
            x++;
            i++;
        }

        return total;
    }
}
