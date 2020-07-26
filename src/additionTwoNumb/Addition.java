package additionTwoNumb;

public class Addition {
    int number;
    float number2;
    double number3;

    //Addition of two number

    public void additionOfTwoNumbers() {

        int number = 48;
        int numbers = 28;

        int sum = number + numbers;
        System.out.println(sum);

    }

    //Miscellaneous calculation

    public void miscellaneousCalculation(int x, float y, double z) {
        number =x;
        number2=y;
        number3=z;

        int number= (int) (x+y*z);
        int number2=(int) (x*y/z);
        int number3=(int) (x-y*z);

        System.out.println(number);
        System.out.println(number2);
        System.out.println(number3);

    }

}
