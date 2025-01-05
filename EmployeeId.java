
import java.util.Scanner;

public class EmployeeId
{
    public int search(int a[],int n ,int x)
    {
        int low=0;
        int high=a.length-1;
        int mid;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(a[mid]==x)
            {
                return mid;
            }
            else if (a[mid]>x)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return -1;
    }
    public static  void main (String args[])
    {
        EmployeeId ID= new EmployeeId();
        int a[]={101, 142, 147, 189, 199, 207, 222, 234, 289, 296,
                310, 319, 388, 394, 417, 429, 447, 521, 536, 600};
        int n= a.length;
         Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Employee Id you want to search:");
        int x= scanner.nextInt();
        if(ID.search(a,n,x)==-1)
        {
            System.out.println("ID"+x+"not found");
        }
        else
        {
            System.out.println("ID"+x+"found at index"+ID.search(a,n,x));
        }
        scanner.close();
    }
}
