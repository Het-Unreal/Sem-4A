public class prac04{
    public static void main(String[] args){
        
        //array1
        int[][] arr1={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

        //array2
        System.out.println();
        int[][] arr2={{9,8,7},{6,5,4},{3,2,1}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }

        //addition
        int arrsum[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arrsum[i][j]=arr1[i][j]+arr2[i][j];
            }
            System.out.println();
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arrsum[i][j]+" ");
            }
            System.out.println();
        }
    }
}