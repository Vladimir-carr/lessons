public class Level1
{
    public static int odometer(int [] oksana) {
        int sum = 0;
        int speed = 0;
        for (int i = 0; i < oksana.length; i++) {
            if (i == 0) {
                speed = oksana[i];
                sum += speed * oksana[i+1];
            }
            if (i >= 2 && i % 2 == 0) {
                speed = oksana[i];
                sum += speed * (oksana[i+1] - oksana[i - 1]);
            }
            speed = 0;
        }
        return sum;
    }
}
