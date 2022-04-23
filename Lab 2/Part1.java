public class Part1
{
    public static void main(String[] args)
    {
        int result1 = (7 * 3) % 4 - (2 * 6) / 5 + 10 / (3 / 2);
        int result2 = 2 / (4 - 3) + ((5 * 4 % 3 * 5 - 6) * 2) - 5;
        int i = 10, j = 20, k;
        k = ++i - j--;

        System.out.println(k);
    }
    
}
