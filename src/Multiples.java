public class Multiples {
    public static void main(String[] args) {
        int i=1;
        int num=0;
        while (i<1000){
            if (i%3==0 || i%5==0)  {
                num++;
            }
            i++;
        }
        System.out.println("number of multiples of 3 or 5 below 1000:"+ num);
    }
}
