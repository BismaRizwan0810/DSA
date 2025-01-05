public class TestScore {
    public int searchtestscore(int a[], int n, int x) {
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }

        public static void main (String args[])
        {
            TestScore TS = new TestScore();
            int a[] = {87, 75, 98,50, 82};
            int n = a.length;
            int x = 100;
            int result=TS.searchtestscore(a,n,x);
            if (result==-1)
            {
                System.out.println("You didnot earn"+x+"points on any test");
            }
            else
            {
                System.out.println("Your earned "+x+"point on:"+(result+1));
            }


        }
    }

