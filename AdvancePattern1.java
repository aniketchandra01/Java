/*

*             *
* *         * *
* * *     * * *
* * * * * * * *
* * * * * * * *
* * *     * * *
* *         * *
*             *

 */

public class AdvancePattern1
{
    public static void main(String[] args)
    {
        for(int i=1;i<=4;i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            for (int k = 3; k >= i; k--)
            {
                System.out.print("    ");
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

            for(int a=1;a<=4;a++)
            {
                for(int b=4;b>=a;b--)
                {
                    System.out.print("* ");
                }
                for(int c=1;c<a;c++)
                {
                    System.out.print("    ");
                }
                for(int b=4;b>=a;b--)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }
    }

