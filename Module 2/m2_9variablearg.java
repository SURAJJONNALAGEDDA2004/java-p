public class m2_9variablearg
{
    public static void main(String args[])
    {
        System.out.println(average(4,6,7,5));
        System.out.println(average(3,1,7,4,9,0,8));
    }
    public static int average(int...num)
    {
        int tot=0;
        for(int x:num)
        {
            tot+=x;
        }
        return tot/num.length;
    }
}
