//LINEAR SEARCH IN AN UNSORTED ARRAY



public class Main
{
    //Static method to find an element of array
    //IntiaLize Variable
    //int arr[]--->(An integer array where search is perfomed)
    //int n ----> (The size of an array )
    //int key ---->(The value we are searching for with in an array)
    static int findElement(int arr[],int n,int key) {

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;


    }

    public static void main (String[] args)
    {
        int arr[]={12,34,10,6,40};
        int n = arr.length;
        //Search element 40 in an array
        int key=40;
        //Function call
        int Position=findElement( arr, n,key);
        if(Position==-1)
        {
            System.out.println("ELEMENT NOT FOUND");
        }
        else
        {
            System.out.println("Element found at position:"+ (Position+1));
        }
    }

}
