

public class Smallest
{
    public static void main(String[] args)
    {
        int x, result;

        x = 25;
        result = smallestOddNumberBiggerThan(x);
        System.out.println(result);

        x = 34;
        result = smallestOddNumberBiggerThan(x);
        System.out.println(result);

        x = -7;
        result = smallestOddNumberBiggerThan(x);
        System.out.println(result);

        x = -8;
        result = smallestOddNumberBiggerThan(x);
        System.out.println(result);
    }

    public static int smallestOddNumberBiggerThan(int x)
    {
        if(x % 2 == 0)
        {
            return x + 1;
        }
        return x + 2;
    }
}