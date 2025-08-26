import java.util.Scanner;

class X_Patteran{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("No of rows : ");
        int rows = s.nextInt();
        int s_w = -1; // Space Width
        boolean midCross = false;
        for(int i = 0; i < rows; i++){
            // Print Spaces
            if( i == ( (rows / 2) + 1 ) ){
                midCross = true;
            }
            if(midCross) s_w --;
            else s_w ++ ;

            for(int j = 0 ; j < s_w ; j++){
                System.out.print(" ");
            }

            for(int j = 0; j < (rows - (s_w*2));j++){
                if(j == 0 || j == (rows - (s_w*2) -1 )){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}


// *       *
//  *     *
//   *   *
//    * *
//     *
//    * *
//   *   *
//  *     *
// *       *
