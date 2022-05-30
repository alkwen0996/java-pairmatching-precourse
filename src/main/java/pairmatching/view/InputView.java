package pairmatching.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private static final String MATCHING_OPTION_SEPARATOR = ",";
    private static final String SELECT_FUNCTION_MESSAGE =
        "기능을 선택하세요." + "\n" + "1. 페어 매칭" + "\n" + "2. 페어 조회" + "\n" + "3. 페어 초기화" + "\n" + "Q. 종료";
    private static final String SELECT_MATCHING_OPTION_MESSAGE =
        "#############################################\n"
            + "과정: 백엔드 | 프론트엔드\n"
            + "미션:\n"
            + "  - 레벨1: 자동차경주 | 로또 | 숫자야구게임\n"
            + "  - 레벨2: 장바구니 | 결제 | 지하철노선도\n"
            + "  - 레벨3: \n"
            + "  - 레벨4: 성능개선 | 배포\n"
            + "  - 레벨5: \n"
            + "############################################\n"
            + "과정, 레벨, 미션을 선택하세요.\n"
            + "ex) 백엔드, 레벨1, 자동차경주";

    public static String selectMatchingOption() {
        try {
            printSelectMatchingOptionMessage();
            final String inputValue = inputValue();
            validateSelectOption(inputValue.split(MATCHING_OPTION_SEPARATOR));

            return inputValue;
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println(illegalArgumentException.getMessage());

            return selectMatchingOption();
        }
    }

    private static void validateSelectOption(String[] splitInputValue) {
        if (splitInputValue.length != 3) {
            throw new IllegalArgumentException("입력 형식이 잘못되었습니다. 다시 입력해주세요.");
        }
    }

    public static void printSelectMatchingOptionMessage() {
        System.out.println(SELECT_MATCHING_OPTION_MESSAGE);
    }

    public static int selectFunctionNumber() {
        try {
            printSelectFunctionMessage();

            return Integer.parseInt(inputValue());
        } catch (IllegalArgumentException illegalArgumentException) {
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
