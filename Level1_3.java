public class Level1
{
    public static int [] SynchronizingTables(int N, int [] ids, int [] salary) {
        int[] idsAsc = new int[N];
        int[] salaryAsc = new int[N];
        for (int i = 0; i < ids.length; i++) {
            idsAsc[i] = ids[i];
            salaryAsc[i] = salary[i];
        }
        SortBubble(idsAsc);
        SortBubble(salaryAsc);

        int[] indexOfIds = new int[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < idsAsc.length; j++) {
                if (ids[i] == idsAsc[j])
                    indexOfIds[i] = j;
            }
        }
        int[] totalSalary = new int[N];
        for (int i = 0; i < N; i++) {
            totalSalary[i] = salaryAsc[indexOfIds[i]];
        }
        return totalSalary;
    }

    public static void SortBubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length-1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
