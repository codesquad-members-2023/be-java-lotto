package kr.codesquad;

import java.util.Scanner;

public class View {

    public static final String NUMBER_FORMAT_ERROR_MESSAGE = "[ERROR] 양의 정수를 입력해주세요.";
    public static final String READ_PARTICIPANTS_MESSAGE = "참여할 사람은 몇 명인가요?";
    public static final String READ_LADDER_HEIGHT_MESSAGE = "최대 사다리 높이는 몇 개인가요?";

    public static int readParticipants() {
        System.out.println(READ_PARTICIPANTS_MESSAGE);
        Scanner scanner = new Scanner(System.in);
        return readNumber(scanner);
    }

    public static int readLadderHeight() {
        System.out.println(READ_LADDER_HEIGHT_MESSAGE);
        Scanner scanner = new Scanner(System.in);
        return readNumber(scanner);
    }

    private static int readNumber(Scanner scanner) {
        try {
            int number = Integer.parseInt(scanner.nextLine());
            isNotPositiveNumber(number);
            return number;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return readNumber(scanner);
        }
    }

    private static void isNotPositiveNumber(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException(NUMBER_FORMAT_ERROR_MESSAGE);
        }
    }

    public static void printMap(String map) {
        System.out.println(map);
    }
}