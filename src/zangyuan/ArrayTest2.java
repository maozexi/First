package zangyuan;

public class ArrayTest2 {
    public static void main(String[] args) {
        int [] arr = {12,21,31,12,45,9403,2};

        int max = arr[0];

        for (int x=1;x<arr.length;x++){
            if (arr[x]>max){
                max = arr[x];
            }
        }
        System.out.println("最大值为："+ max);
    }
}
