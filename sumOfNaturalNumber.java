public class sumOfNaturalNumber {
        private static int sum=0;
        public static void number(int n ){
            if(n==0){
                return;
            }
            sum = sum  + n;
            number(n-1);
        }
        public static  void main(String[] args){
            int n = 5;
            number(n);
            System.out.println(sum);
    }
}
