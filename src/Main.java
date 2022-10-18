public class Main {
    public static void main(String[] args) {
        //System.out.println(distance(2,7,5,3));
revnumByString("344");

    }

    //1
    public static void writeX() {

    }

    //2a
    public static void revnumByString(String num ) {
        String rev="";
        for(int i =0; i<num.length();i++){
            rev=num.charAt(i)+rev;
        }
        System.out.println((rev.equals(num)?"igen":"nem"));

    }

    //2b
    public static void revnumByInt() {
    }

//3
    public static double distance(int px, int p2x, int py, int p2y) {
        double distance = 0;
        distance = Math.pow(px - p2x, 2) + Math.pow(py - p2y, 2);
        return Math.sqrt(distance);
    }
}