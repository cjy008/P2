public class TimeSimpleList
{
  public static void main(String[] args)
  { 
    if(args.length != 2)
      System.out.println("Usage: java TimeList list-type head-or-tail ");
      System.exit(1);
  }
  // First argument is either linked or array and specifies whether a List12
  // singly-linked list impletation or an ArrayList will be used
  String S = String.parse(args[0]);
  // Second argument: either front or back
  // Specifies whether elements will be added to the front or the back of 
  // the list
  String I = Integer.parseInt(args[1]);
  int N = 2000;
  int Max = 50000;
  int Incre = 1000;

  if(S.equalsIgnoreCase("linked")==true && I.equalsIgnoreCase("front")==true)
  {
    List<String> theL = new List12<String>();
    for(int i = 0; i < N; i++)
    {
      theL.add(0, null);
    }
  }
  
  if(S.equalsIgnoreCase("linked")==true && I.equalsIgnoreCase("back")==true)
  {
    List<String> theL = new List12<String>();
    for(int i = 0; i < N; i++)
    {
      theL.add(i, null);
    }
  }

  if(S.equalsIgnoreCase("array")==true && I.equalsIgnoreCase("front")==true)
  {
    List<String> theA = new ArrayList<String>();
    for(int i = 0; i < N; i++)
    {
      theA.add(0, null);
    }
  }

  if(S.equalsIgnoreCase("array")==true && I.equalsIgnoreCase("back")==true)
  {
    List<String> theA = new ArrayList<String>();
    for(int i = 0; i < N; i++)
    {
      theA.add(i, null);
    }
  }
/**
  if(S.equalsIgnoreCase("linked")==true)
  {
    List<String> theL = new List12<String>();
    if(I.equalsIgnoreCase("front")==true)
    {
      for(int i = 0; i < N; i++)
      {
        theL.add(0, null);
      }
    }
    if(I.equalsIgnoreCase("back") == true)
    {
      for(int i = 0; i<N; i++)
      {
        theL.add(i, null);
      }
    }
  }
 */
 /**
  if(S.equalsIgnoreCase("array") == true)
  {
    List<String> theA = new ArrayList<String>();
    if(I.equalsIgnoreCase("front") == true)
    {
      for(int i = 0; i < N; i++)
      {
        theA.add(0, null);
      }
    }
    if(I.equalsIgnoreCase("back") == true)
    {
      for(int i = 0; i < N; i++)
      {
        theA.add(i, null);
      }
    }
  }
*/
  for(int j = 2000; j < 50000; j+=1000)
  {
    IntegerList myList = new IntegerList(j);
    double exTime[] = new double [T];
    for(int k = 0; k < T; k++)
    {
      for(int l = 0; l < j; l++)
      {
        myList.add(1);
      }
      long start = System.nanoTime();
      myList.removeRangeV2(0, j/2);
      long end = System.nanoTime();
      double diff = (double)((end - start)/1.0e9);
      exTime[k] = diff;
      myList.clear();
      System.gc();
    }
    computeAndDisplay(exTime, j/2);
  }
}

public static void computeAndDisplay(double arr[], int rem)
{
  double sum = 0;
  int len = arr.length;
  for(int i = 0; i< len; i++)
  {
    sum += arr[i];
  }
  double mean = sum/len;
  System.out.format("%d %.5f \n", rem, mean);
}
