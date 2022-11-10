public class Main {
    public static void main(String[] args) {
        double tall;
        double kg;
	int i = 0;

while (i < 2) {
        System.out.print("身長");
        tall = new java.util.Scanner(System.in).nextDouble();
        System.out.print("体重");
        kg = new java.util.Scanner(System.in).nextDouble();
        double bmi = kg / (tall * tall);
        bmi = bmi * 10000;
        System.out.printf("BMIは"+"%.2f", bmi);
	System.out.println();
        i++;

    }
      
    }

}
