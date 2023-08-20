public class m3_0triangle {

public static void main(String ar[])
{
	int t[][] = new int[4][];
	t[0] = new int[1];
	t[1] = new int[2];
	t[2] = new int[3];
	t[3] = new int[4];

for(int i=0;i<4;i++)
	{
		for(int j=0;j<i+1;j++)
		{
			t[i][j]=i; 
			System.out.print(t[i][j]+" ");
}
System.out.println();
	}
}
}

//OUTPUT
/*
0 
1 1 
2 2 2
3 3 3 3 
*/