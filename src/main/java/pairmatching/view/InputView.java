package pairmatching.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private static final String SELECT_FUNCTION_MESSAGE =
        "기능을 선택하세요." + "\n" + "1. 페어 매칭" + "\n" + "2. 페어 조회" + "\n" + "3. 페어 초기화" + "\n" + "Q. 종료";

    public static int selectFunctionNumber() {
        try {
            printSelectFunctionMessage();

            return Integer.parseInt(inputValue());
        }catch (IllegalArgumentException illegalArgumentException){
            System.out.println(illegalArgumentException.getMessage());

            return selectFunctionNumber();
        }
    }

    public static void printSelectFunctionMessage() {
        System.out.println(SELECT_FUNCTION_MESSAGE);
    }

    public static String inputValue() {
        return Console.readLine();
    }
}
