package zangyuan;

public class function {
    public static void main(String[] args) {

        boolean equality = compare(1L ,2L);
        System.out.println(equality);
    }

    public static boolean compare(byte a,byte b){
        System.out.println("byte");
        return a == b;
    }

    public static boolean compare(short a,short b){
        System.out.println("short");
        return a == b;
    }

    public static boolean compare(int a,int b){
        System.out.println("int");
        return a == b;
    }


    public static boolean compare(long a,long b){
        System.out.println("long");
        return a == b;
    }

}
