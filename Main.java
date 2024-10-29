public class Main {
    public static void main(String[] args) {

        //Homework 1

        int num1 = 5;
        int num2 = 6;
        int num3 = 7;
        double avg = ( num1 + num2 + num3 ) / 3;

        System.out.println("საშუალო რიცხვი: " + avg);

        //Homework 2

        String typeOfNumber = (num1 % 2 == 0) ? "ეს რიცხვი ლუწია" : "ეს რიცხვი კენტია";
        System.out.println(typeOfNumber);

        //Homework 3

        int biggest = (num2 > num3) ? num2 : num3;
        System.out.println("უდიდესი რიცხვი არის " + biggest);

        //Homework 4

        int num4 = 1233;
        int sumOfDigits = (num4 / 1000) + ((num4 / 100) % 10) + ((num4 / 10) % 10) + (num4 % 10);
        System.out.println(sumOfDigits);

        //Homework 5

        int angle1 = 10;
        int angle2 = 60;
        int angle3 = 60;
        boolean triangle = (angle1 + angle2 + angle3 == 180);
        System.out.println("ამ კუთხეებს სამკუთხედის აშენება " + (triangle ? "შეუძლიათ" : "არ შეუძლიათ"));

    }
}