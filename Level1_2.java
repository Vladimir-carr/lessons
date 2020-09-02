public class Level1
{
    public static int [] MadMax(int N, int [] Tele) {
        int[] asc = new int[N];
        int[] desc = new int[N];
        for (int i = 0; i < Tele.length; i++) {
            asc[i] = Tele[i];
            desc[i] = Tele[i];
        }
        BubbleSortAcs(asc);
        BubbleSortDesc(desc);

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
    public static void BubbleSortAcs(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
    public static void BubbleSortDesc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] < arr[j]) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
