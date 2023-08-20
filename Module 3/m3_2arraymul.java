import java.util.Scanner;
public class m3_2arraymul
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int A[][]=new int[3][4];
        int B[][]=new int[3][4];
        int C[][]=new int[3][4];
        int i,j;
        System.out.println("\nEnter the Elements of Matrix 1:");
        for(i=0;i<3;i++)
        {

            for(j=0;j<4;j++)

            {

                A[i][j]=sc.nextInt();

            }

        }

        System.out.println("\nFirst Matrix:");

        for(i=0;i<3;i++)

        {

            for(j=0;j<4;j++)

            {

                System.out.print(A[i][j]+"\t");

            }

            System.out.println("");

        }

        System.out.println("\nEnter the Elements of Matrix 2:");

        for(i=0;i<3;i++)

        {

            for(j=0;j<4;j++)

            {

                B[i][j]=sc.nextInt();

            }

        }

        System.out.println("\nSecond Matrix:");

        for(i=0;i<3;i++)

        {

            for(j=0;j<4;j++)

            {

                System.out.print(B[i][j]+"\t");

            }

            System.out.println("");

        }

        System.out.println("\nMultiplication Matrix is:");

        for(i=0;i<3;i++)

        {

            for(j=0;j<4;j++)

            {

                C[i][j]=C[i][j]+(A[i][j]*B[i][j]);

                System.out.print(C[i][j]+"\t");

            }

            System.out.println("");

        }

    }

}