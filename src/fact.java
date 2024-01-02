public class fact {
  public static void main(String[]args){

    }
    int fact_wo(int n )
    {
        int fact=1;
        for (int i=1;i<n;i++) //this one is without recursion
        {
            fact=fact*i;
        }
        return  fact;
    }
}
