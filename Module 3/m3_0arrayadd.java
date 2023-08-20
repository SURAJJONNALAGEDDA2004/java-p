import java.util.Scanner;
public class m3_0arrayadd {
    public static void main(String args[]){
        int a[][]=new int[3][3],b[][]=new int[3][3],i,j,c[][]=new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of matrix 1");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter the elements of matrix 2");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                b[i][j]= sc.nextInt();
            }
        }
        System.out.println("First Matrix:");
        for(i=0;i<3;i++) 
            {
            for (j=0;j<3;j++) 
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.println("Second Matrix:");
            for(i=0;i<3;i++) 
            {
            for (j=0;j<3;j++) 
                {
                    System.out.print(b[i][j]+" ");
                }
                System.out.println("");
            }
        System.out.println("The final added matrix is");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println("");
        }
        
    }
}
//OUTPUT 
/*
 Enter the elements of matrix 1
1
2
3
4
5
6
7
8
9
Enter the elements of matrix 2
1
2
3
4
5
6
7
8
9
First Matrix:
1 2 3
4 5 6
7 8 9
Second Matrix:
1 2 3
4 5 6
7 8 9
The final added matrix is
2 4 6 
8 10 12
14 16 18
 */

//OUTPUT
/*
 Enter the elements of matrix 1
1
2
3
4
5
6
7
8
9
Enter the elements of matrix 2
2
4
6
7
3
5
7
3
6
First Matrix:
1 2 3
4 5 6
7 8 9
Second Matrix:
2 4 6
7 3 5
7 3 6
The final added matrix is
3 6 9
11 8 11
14 11 15
 */