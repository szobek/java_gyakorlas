public class Main {
    public static void main(String[] args) {
        //System.out.println(distance(2,7,5,3));
revnumByInt(242);

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
    public static void revnumByInt(int num) {
        int h=num/100;
        int t = (num-h*100)/10;
        int e = (num-h*100)-(t*10);
        System.out.println(e*100+t*10+h);
        System.out.println((num==e*100+t*10+h)?"Igaz":"Hamis");

    }

//3
    public static double distance(int px, int p2x, int py, int p2y) {
        double distance = 0;
        distance = Math.pow(px - p2x, 2) + Math.pow(py - p2y, 2);
        return Math.sqrt(distance);
    }
}