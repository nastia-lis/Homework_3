package geekbrains.homework;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        int play;
        do {
            System.out.println("Сыграем в игру 'Угадайка'!\nНужно угадать число от 0 до 9.");
            guessTheNumber();
            System.out.println("Повторить игру еще раз?\nЕсли 'Да' - нажмите цифру 1, если 'Нет' - цифру 0.");
            play = scanner.nextInt();
        } while (play == 1);
        System.out.println("Игра окончена!");
    }

    public static void guessTheNumber() {
        int answerUser;
        int guessNumber = random.nextInt(10);
        for (int count = 3; count > 0; count--) {
            System.out.println("Введите число от 0 до 9!\nУ вас " + count + " попытки.");
            answerUser = scanner.nextInt();
            if (answerUser == guessNumber) {
                System.out.println("Поздравляем!!!\n Вы угадали!");
                break;
            } else if (answerUser > guessNumber) {
                System.out.println("Вы ввели слишком большое число!");
            } else {
                System.out.println("Вы ввели слишком маленькое число!");
            }
        }
    }
}
