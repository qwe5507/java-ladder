package ladder.contoller;

import java.util.Scanner;

public class InputView {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static String findGameContributors() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        return SCANNER.nextLine();
    }
}