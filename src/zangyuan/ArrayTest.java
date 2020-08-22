package zangyuan;
/*数组遍历*/

public class ArrayTest {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {1,2,3,4,58,5,65,6,5,};

        //for循环获取0-4
        for (int x=0;x<5;x++){
            System.out.println(arr[x]);
            System.out.println("--------");
        }
        //解决从数组中数元素个数
        System.out.println("数组中共有"+arr.length+"个元素");
        for (int x=0;x<arr.length;x++){
            System.out.println(arr[x]);
        }
    }
}
