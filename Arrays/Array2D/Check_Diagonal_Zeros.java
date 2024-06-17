package Array.Array2D;

public class Check_Diagonal_Zeros {
    public static void main(String[] args) {
      int[][] arr={
              {0,2,3},
              {4,0,6},
              {7,8,0,1}
      };

      boolean result= Check_Diagonal_Zeros.array(arr);
        System.out.println(result);
    }

    public static boolean array2D(int[][] arr){
        for (int r=0;r<arr.length;r++){
            for (int c=0;c<arr[r].length;c++){
                if (r==c && arr[r][c]==0){
                   return true;
                }
            }
        }
        return false;
    }

    public static boolean array(int[][] arr){
        for (int r=0,c=0;r<arr.length && c<arr[r].length;r++){
            c++;
            if (r==c && arr[r][c]==0){
                return true;
            }
        }
        return false;
    }
}
