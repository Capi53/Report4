package jp.ac.uryukyu.ie.e185753;

/*public class main {
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
}*/

public class main {
    public static void main (String[] args){
        String str = "百二十三";
        int result = len("百二十三");
        System.out.println(Integer.parseInt(str));
    }
    public static int len (String str){
        try {
            int strlen = str.length();
            System.out.println(strlen);
            throw new NullPointerException("文字が入力されていません");
        }catch(NullPointerException N){

            System.out.println(N.getMessage());
            return 0;
        }finally{
            System.out.println("処理終了");
        }

    }
}




