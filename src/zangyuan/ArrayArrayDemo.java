package zangyuan;

public class ArrayArrayDemo {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};

//        System.out.println(arr);
//        System.out.println(arr[1]+"--------");
//
//        System.out.println(arr[1][2]);
//        System.out.println(arr[2][0]);

        //遍历二位数组
//        for (int x=0;x<arr[0].length;x++){
//            System.out.println(arr[0][x]);
//        }
//
//        for (int x=0;x<arr[1].length;x++){
//            System.out.println(arr[1][x]);
//        }
//
//        for (int x=0;x<arr[2].length;x++){
//            System.out.println(arr[2][x]);
//        }

        for (int y=0;y<arr.length;y++){
            for (int x=0;x<arr[0].length;x++){
                System.out.print(arr[y][x]+"  ");
            }
            System.out.println();
        }
    }
}
