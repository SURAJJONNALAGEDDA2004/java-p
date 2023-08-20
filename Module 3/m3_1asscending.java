class m3_1asscending
{
	public static void  main(String args[])
{
	String names[]={"Suraj","Manish","Shiva","Nanda","Amruth"};
	int size=names.length;
	
	String temp;
	for(int i=0;i<size;i++)
	{
		for(int j=i+1;j<size;j++)
		{
			if(names[j].compareTo(names[i])<0)
			{
				temp=names[i];
				names[i]=names[j];
				names[j]=temp;
}
}
}
for(int i=0;i<size;i++)
	System.out.println(names[i]);
}
}

