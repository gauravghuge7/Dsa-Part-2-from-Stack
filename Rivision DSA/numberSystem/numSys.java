public class numSys {


    public static int convertToBinary(int decimal) {

        int ans = 1;


        while(decimal > 0) {

            int unit = decimal % 2;

            System.out.println("unit "+ unit);
          
            ans = ans << unit;
            
            System.out.println("decimal "+ decimal);

            decimal /= 2;

        }

        return ans;


    }


    public static void main(String[] args) {

        System.out.println(convertToBinary(11));
        
    }
}
