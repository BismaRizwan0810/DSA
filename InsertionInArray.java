public class InsertionInArray
{
    //ARRAY DECLERATION
    int array[]={1,2,3,4,5,6};
    public void InsertElement(int target,int x)
    {
        //Space creation for insert an element
        for(int i = array.length-1;i>target;i--)
        {
            array[i]=array[i-1];
        }
        array[target]=x;
        System.out.println("ARRAY AFTER INSERTION:");
        //Updated array after insertion and print
        for(int i=0;i<array.length;i++)
        {

            System.out.println(+array[i]);
        }


    }
    public static void main(String[] args )
    {
        InsertionInArray array=new InsertionInArray();
        array.InsertElement(2,8);
        array.InsertElement(3,10);
    }

}
