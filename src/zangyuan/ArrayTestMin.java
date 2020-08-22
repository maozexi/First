package zangyuan;

public class ArrayTestMin {
    public static void main(String[] args) {
        int [] arr = {2,4,6,123,523,6};

        int min = arr[0];

        for (int x=1; x<arr.length; x++){
            if (arr[x] < min){
                min = arr[x];
            }
        }

        System.out.println("最小值为："+min);
    }
}
