public class LastDigitChecker {


    public static void main(String[] args) {
        System.out.println(
                hasSameLastDigit(574,670,434));
    }

    public static boolean hasSameLastDigit (int num1,int num2,int num3 ){
        if (( num1 > 1000 || num1 < 10 )||( num2 > 1000 || num2 < 10 )||( num3 > 1000 || num3 < 10 )){
            return false;
        }  // limiting the range in 10 - 1000

        int mod_num1 = num1 % 10 ;
        int mod_num2 = num2 % 10 ;
        int mod_num3 = num3 % 10 ;


        if ( mod_num1 == mod_num2 || mod_num2 == mod_num3 || mod_num3 == mod_num1 ){
            return true;
        }

        return false;

    }

    public static boolean isValid (int number) {
        if (number > 1000 || number < 10) {
            return false;
        }

        return true;
    }

}
