package zangyuan;

public class ArrayAdd {
    public static void main(String[] args) {
        int [] arr = {12,312,312,12,3};

        int array = add(arr);
    }

    public static int add(int [] arr){
        int sum = arr[0];

        for (int x=1;x<arr.length;x++){
            sum +=arr[x];
        }
        System.out.println("sum:"+sum);
        return sum;
    }
}
