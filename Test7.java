public class Test7 {
    public static void main(String[] args) {
        String str = "abc";

        for(int i = 0 ; i < str.length(); i++) {
            for(int j = i+1; j <= str.length(); j++) {
                System.out.println(str.substring(i,j));
            }
        }

    }
/*

     a = 0
     b = 1
     c = 2;

    i = 0; j = 1; a
    i = 0; j = 2; ab
    i = 0; j = 3; abc
    i = 1; j = 2; b
    i = 1; j = 3; bc
    i = 2; j = 3; c

    */

}
