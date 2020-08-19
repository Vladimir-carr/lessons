public class Level1
{
    public static int squirrel(int N)
      {
        return (N == 1) ? 1 : N * squirrel(N - 1);
      }
}
