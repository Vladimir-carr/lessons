public class Level1
{
    public static int[][] Day(int[][] array) {
        int N = array.length;
        int M = array[0].length;
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (array[i][j] == 1) {
                    
                    if (i == 0) {
                        if (array[i + 1][j] != 1) {
                            array[i + 1][j] = 2;
                        }
                    } else if (i == N - 1) {
                        if (array[i - 1][j] != 1) {
                            array[i - 1][j] = 2;
                        }
                    } else {
                        if (array[i + 1][j] != 1) {
                            array[i + 1][j] = 2;
                        }
                        if (array[i - 1][j] != 1) {
                            array[i - 1][j] = 2;
                        }
                    }
                    
                    if (j == 0) {
                        if (array[i][j + 1] != 1) {
                            array[i][j + 1] = 2;
                        }
                    } else if (j == M - 1) {
                        if (array[i][j - 1] != 1) {
                            array[i][j - 1] = 2;
                        }
                    } else {
                        if (array[i][j + 1] != 1) {
                            array[i][j + 1] = 2;
                        }
                        if (array[i][j - 1] != 1) {
                            array[i][j - 1] = 2;
                        }
                    }
                }
            }
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (array[i][j] == 2) {
                    array[i][j] = 1;
                }
            }
        }
        return array;
    }

    public static int CountOne(int[][] array) {
        int count = 0;
        int N = array.length;
        int M = array[0].length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (array[i][j] == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int ConquestCampaign(int N, int M, int L, int[] battalion) {
        int days = 1;
        int count1 = 0;
        int[][] country = new int[N][M];
        for (int y = 1; y <= battalion.length; y += 2) {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= M; j++) {
                    if (i == battalion[y - 1] && j == battalion[y]) {
                        country[i - 1][j - 1] = 1;
                    }
                }
            }
        }
        count1 = CountOne(country);
        while (N * M != count1) {
            days++;
            Day(country);
            count1 = CountOne(country);
        }
        return days;
    }
}
