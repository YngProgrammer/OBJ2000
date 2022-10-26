

public class Smallest
{
    public static void main(String[] args)
    {
        int x;

        x = 25;
        assert smallestOddNumberBiggerThan(x) == 27;

        x = 34;
        assert smallestOddNumberBiggerThan(x) == 35;

        x = -7;
        assert smallestOddNumberBiggerThan(x) == -5;
    }

    public static int smallestOddNumberBiggerThan(int x)
    {
        if(x % 2 == 0)
        {
            if (x > 0)
            {
                return x + 1;
            }
            else
            {
                return x - 1;
            }
        }
        return x;
    }
}