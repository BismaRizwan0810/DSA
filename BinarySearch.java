public class BinarySearch
{
    public int search(int a[],int n ,int x)
    {
        int low=0;
        int high=a.length-1;
        int mid;
        while(low<=high) {
            mid = (low + high) / 2;

            if (a[mid] == x) {
                return mid;
            } else if (a[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main (String args [])
    {
        BinarySearch BS= new BinarySearch();
        int a[]={10,20,30,40,50,60,70,80,90,100};
        int n=a.length;
        int x=70;
        if(BS.search(a,n,x)==-1)
        {
            System.out.println("Element"+x+"not found");
        }
        else
        {
            System.out.println("Element"+x+"found at index:"+BS.search(a,n,x));
        }

    }
}
