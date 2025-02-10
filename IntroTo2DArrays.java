import java.util.Arrays;

public class IntroTo2DArrays{
  public static void main(String[] args){

    int[][]ray =new int[2][3];

    ray[0][0]=1;
    ray[0][1]=2;
    ray[0][2]=3;
    ray[1][0]=4;
    ray[1][1]=5;
    ray[1][2]=6;

    /*
      1  2  3    
      4  5  6
    */

    System.out.println(Arrays.toString(ray));

    //print the first array in the array ray way#1
    System.out.println(Arrays.toString(ray[0]));
    System.out.println(Arrays.toString(ray[1]));

    //#way2
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }

    //chaange every value in the 2d array to 7
    for(int row=0; row<ray.length; row++)
    {
      for(int column=0; column<ray[row].length; column++)
      {
        ray[row][column] =7;
      }
    }
   //prints out the 2d array in the terminal
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }

    //makes a random varible in each
    for(int row=0; row<ray.length; row++)
    {
      for(int column=0; column<ray[row].length; column++)
      {
        ray[row][column] = (int)(Math.random()*11 + 0);
      }
    }

    //prints out the 2d array in the terminal
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }

    //add the sum of each row in the 2d array
    int sum=0;

    for(int row=0; row<ray.length; row++)
    {
      //start our sum at 0 before addinf up the columns
      sum=0;

      for(int column=0; column<ray[row].length; column++)
      {
        sum+=ray[row][column];
      }
      
      System.out.println("The sum of row " + row +" is: " + sum);
    }

    System.out.println("\n\n\nHomework assignment");
    //add up the values of everything using for each loops....
    int sum2=0;

    for(int row: ray[0])
    {
      //start our sum at 0 before addinf up the columns
      sum=0;

      for(int column=0; column<ray[row].length; column++)
      {
        sum+=ray[row][column];
      }
      
      System.out.println("The sum of row " + row +" is: " + sum);
    }
    


   
  }
}
