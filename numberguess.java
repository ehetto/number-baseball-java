import java.util.Scanner;

public class numberguess {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a, b, c = 0;
    int n = 9;
    while(true) {
    a = (int)(Math.random() * n) + 1;
    b = (int)(Math.random() * n) + 1;
    c = (int)(Math.random() * n) + 1;

    if (!(a == b && b == c)) {
      break;
    }
    }

    while(true) {

    System.out.print("첫번째 숫자를 입력하세요: ");
		int x = scanner.nextInt();
    System.out.print("두번째 숫자를 입력하세요: ");
		int y = scanner.nextInt();
    System.out.print("세번째 숫자를 입력하세요: ");
		int z = scanner.nextInt();

    int strike = 0;
		int ball = 0;

    if (x == a) strike++;
    if (x == b || x == c) ball++;
    if (y == b) strike++;
    if (y == a || y == c) ball++;
    if (z == c) strike++;
    if (z == a || z == b) ball++;

    if (strike == 3) {
      break;
    } 

    if (strike == 0 && ball == 0) {
			System.out.println("out");
		} else {
			System.out.println("strike: " + strike + " || ball: " + ball);
		}

    }
  }
}