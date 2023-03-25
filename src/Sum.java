public class Sum {
    void Sum(int a, long b){
      System.out.println(a + b)  ;
    }
    void Sum (int c, int d){
        System.out.println(c + d);


    }

    public static void main(String[] args) {
        Sum s =new Sum();
        s.Sum(5,123456789L);
        s.Sum(9,4567);
    }
}
