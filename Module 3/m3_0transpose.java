import java.util.Scanner;
public class m3_0transpose {
    public static void main(String args[]){
        int a[][]=new int[3][3],b[][]=new int[3][3],i,j,temp=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of matrix 1");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                a[i][j]= sc.nextInt();
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
        System.out.println("The final transposed matrix is");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                b[i][j]=a[j][i];
                System.out.print(b[i][j] + " ");
            }
            System.out.println("");
        }
        
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                if(i==j){
                    temp=temp+a[i][j];
                }
            }
            System.out.println("");
        }
        System.out.println("The sum of the principal diagonals is:"+ temp);
        
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
First Matrix:
1 2 3
4 5 6
7 8 9
The final transposed matrix is
1 4 7
2 5 8
3 6 9



The sum of the principal diagonals is:15
 */
//OUTPUT
/*
 Enter the elements of matrix 1
2
3
6
2
5
7
4
67
5
First Matrix:
2 3 6
2 5 7
4 67 5 
The final transposed matrix is
2 2 4
3 5 67
6 7 5



The sum of the principal diagonals is:12
 */