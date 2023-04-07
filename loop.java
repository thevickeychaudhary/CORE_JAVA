public class loop{
  public static void main(String[]args)
    {
    

     int i,j;
       for(i=1;i<=10;i++)  // column
      {
         for(j=1;j<=10;j++)  // row
          {

              if(i==2&&j==2)
              {
              continue;
              }
        
              System.out.println(i+" "+j);
              
          }
    //  System.out.print(i);
     //    System.out.println(" ");
          
      }
      
    }
}