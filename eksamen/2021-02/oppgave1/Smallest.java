package oppgave1;

public class Smallest
{
    public static void main(String[] args)
    {
        Smallest s = new Smallest();
        int result;

        result = s.smallestOddNumberBiggerThan(25);
        System.out.println(result);

        result = s.smallestOddNumberBiggerThan(34);
        System.out.println(result);

        result = s.smallestOddNumberBiggerThan(-7);
        System.out.println(result);
    }

    public int smallestOddNumberBiggerThan(int x)
    {
        if (x % 2 == 0)
        {
            return x + 1;
        }
        else
        {
            return x + 2;
        }
    }
}