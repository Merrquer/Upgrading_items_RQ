import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите уровень вашего предмета: ");
        Scanner level = new Scanner(System.in);
        int L = level.nextInt();
        System.out.println("Точите с руной холода? 1 - да, 0 - нет"); //Будет ли сбрасываться уровень улучшения при неудаче или нет
        Scanner rune = new Scanner(System.in);
        int cold = rune.nextInt();
        System.out.println("Сколько прокрутов хотите сделать?");
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();
        if (L < 10 && L >= 0) {
            for (int i = 0; i <= n; i++) {
                double a = Math.random() * 100; //Рандомное число
                switch (L) {
                    case 0:
                        if (a < 100) {
                            L++;
                        } //Шанс улучшения предмета
                        System.out.println("Улучшение удалось! " + L);
                        break;
                    case 1:
                        if (a < 80) {
                            L++;
                            System.out.println("Улучшение удалось! " + L);
                        } else if (cold == 1) {
                            System.out.println("Улучшение не удалось, но уровень улучшения не потерян");
                            break;
                        } else {
                            L--;
                            System.out.println("Улучшение не удалось, потерян один уровень! " + L);
                        }
                        break;
                    case 2:
                        if (a < 50) {
                            L++;
                            System.out.println("Улучшение удалось! " + L);
                        } else if (cold == 1) {
                            System.out.println("Улучшение не удалось, но уровень улучшения не потерян");
                            break;
                        } else {
                            L--;
                            System.out.println("Улучшение не удалось, потерян один уровень! " + L);
                        }
                        break;
                    case 3:
                        if (a < 20) {
                            L++;
                            System.out.println("Улучшение удалось! " + L);
                        } else if (cold == 1) {
                            System.out.println("Улучшение не удалось, но уровень улучшения не потерян");
                            break;
                        } else {
                            L--;
                            System.out.println("Улучшение не удалось, потерян один уровень! " + L);
                        }
                        break;
                    case 4:
                        if (a < 10) {
                            L++;
                            System.out.println("Улучшение удалось! " + L);
                        } else if (cold == 1) {
                            System.out.println("Улучшение не удалось, но уровень улучшения не потерян");
                            break;
                        } else {
                            L--;
                            System.out.println("Улучшение не удалось, потерян один уровень! " + L);
                        }
                        break;
                    case 5:
                        if (a < 7) {
                            L++;
                            System.out.println("Улучшение удалось! " + L);
                        } else if (cold == 1) {
                            System.out.println("Улучшение не удалось, но уровень улучшения не потерян");
                            break;
                        } else {
                            L--;
                            System.out.println("Улучшение не удалось, потерян один уровень! " + L);
                        }
                        break;
                    case 6:
                        if (a < 5) {
                            L++;
                            System.out.println("Улучшение удалось! " + L);
                        } else if (cold == 1) {
                            System.out.println("Улучшение не удалось, но уровень улучшения не потерян");
                            break;
                        } else {
                            L--;
                            System.out.println("Улучшение не удалось, потерян один уровень! " + L);
                        }
                        break;
                    case 7:
                        if (a < 2) {
                            L++;
                            System.out.println("Улучшение удалось! " + L);
                        } else if (cold == 1) {
                            System.out.println("Улучшение не удалось, но уровень улучшения не потерян");
                            break;
                        } else {
                            L--;
                            System.out.println("Улучшение не удалось, потерян один уровень! " + L);
                        }
                        break;
                    case 8:
                        if (a < 1) {
                            L++;
                            System.out.println("Улучшение удалось! " + L);
                        } else if (cold == 1) {
                            System.out.println("Улучшение не удалось, но уровень улучшения не потерян");
                            break;
                        } else {
                            L--;
                            System.out.println("Улучшение не удалось, потерян один уровень! " + L);
                        }
                        break;
                    case 9:
                        if (a < 1) {
                            L++;
                            System.out.println("Улучшение удалось! " + L + "Понадобилось прокрутов: " + i);
                        } else if (cold == 1) {
                            System.out.println("Улучшение не удалось, но уровень улучшения не потерян " + L);
                        } else {
                            L--;
                            System.out.println("Улучшение не удалось, потерян один уровень! " + L);
                        }
                        break;
                }
            }
            System.out.println("Ваш уровень предмета: +" + L);
        } else
            System.out.println("Введите корректное число!");

    }
}

