import java.util.Scanner;

class ArmstrongorNot2 {
    private Scanner sc;
    private int num1;

    public ArmstrongorNot1() {
        sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        num1 = sc.nextInt();
    }

    public static void main(String args[]) {
        ArmstrongorNot1 a= new ArmstrongorNot1();
        int b = a.armstrongornot();
        if (armstrongChecker.num1 == b)
            System.out.println("Armstrong");
        else
            System.out.println("Not an Armstrong");
    }

    int armstrongornot() {
        int sum = 0, num2, count = 0, rem;
        int num3 = num1;

        num2 = num1;
        while (num2 > 0) {
            count++;
            num2 = num2 / 10;
        }

        while (num3 > 0) {
            rem = num3 % 10;
            sum = sum + (int) Math.pow(rem, count);
            num3 = num3 / 10;
        }
        return sum;
    }
}
