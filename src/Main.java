import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(lesson(22, 34));
        System.out.println(lesson(33, 45));
        System.out.println(lesson(35, 23));
        System.out.println(lesson(89, 45));
        System.out.println(lesson(46, 25));
        System.out.println(lesson(generateRandomAge(), 66));

    }

    public static String lesson(int agePeople, int temperature) {
        String num1 = "Можно идти гулять";
        String num2 = "Оставайтесь дома";
        if (agePeople >= 20 && agePeople <= 45 && temperature >= -20 && temperature >= 30) {
            return num1;
        } else if (agePeople < 20 && temperature >= 0 && temperature <= 28) {
            return num1;
        } else if (agePeople > 45 && temperature >= -10 && temperature <= 25) {
            return num2;
        } else {
            return num2;
        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        int age = random.nextInt(100);
        return age;
    }

}