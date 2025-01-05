public class LinearSearch
{
    public int search(int a[],int n ,int x)
    {
        for(int i=0;i<n;i++)
        {
            if(a[i]==x)
            {
                return i;
            }

        }
        return -1;
    }
    public static void main (String args[])
    {
        LinearSearch LS= new LinearSearch();
        int a[]={1,2,3,4,5,6,7,8};
        int n=a.length;
        int x=5;
        if(LS.search(a,n,x)==-1)
        {
            System.out.println("ELEMENT NOT FOUND");
        }
        else
        {
            System.out.println("ELEMENT NOT FOUND AT POSITION"+LS.search(a,n,x));
        }
    }

}
