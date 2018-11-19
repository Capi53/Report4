package jp.ac.uryukyu.ie.e185753;

public class main {
    public static void main(String[] args) {
        String str ;
        int result = len(null);
        System.out.println("戻り値 = " + result);

    }

    public static int len(String str) {
        try {
            int strlen = str.length();
            return strlen;
        }catch (NullPointerException N){
            System.out.println("例外が発生しました。");
            //System.out.println(N);
            System.err.println(N.getMessage());
            return 0;

        }
    }
}

