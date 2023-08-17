public class Main {
    static  int isPalindrom(int number){
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber){
            System.out.println("Girdiğiniz sayı bir palindrom sayıdır.");
        } else {
            System.out.println("Girdiğiniz sayı palindrom sayı değildir.");
        }
        return temp;
    }
    public static void main(String[] args) {

        isPalindrom(434);
    }
}