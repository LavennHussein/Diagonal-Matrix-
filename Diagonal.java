public class Diagonal{

 public static void main(String []str){

 int a[][]={{1,2,3},{4,5,6},{7,8,9}};

     a=setDiagonal(a); // call

 System.out.println("\nAfter changing:");
 for(int i=0; i<a.length; i++)
 {
 for(int j=0; j<a[0].length; j++)
 System.out.print(a[i][j]+" ");
 System.out.println();
 }
 }

 public static int[][] setDiagonal(int [][]a) {
 for(int i=0;i<a.length;i++)
 for(int j=0;j<a[0].length;j++)
 if(i!=j)
 a[i][j]=0;
 return a;
 }
}