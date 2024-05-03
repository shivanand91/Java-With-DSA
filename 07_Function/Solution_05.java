public class Solution_05{

    public static void binToDec(int binNum){
        int pow = 0;
        int dec = 0;
        int myNum = binNum;
        
        while(binNum > 0){
            int lastDigit = binNum % 10;
            dec = dec + (lastDigit * (int)(Math.pow(2, pow)));
            pow++;

            binNum = binNum / 10;
        }
    }
    public static void main(String[] args) {
        
    }
}