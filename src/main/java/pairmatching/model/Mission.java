package pairmatching.model;

public enum Mission {
    CAR_RACING_GAME("자동차경주"),
    LOTTO("로또"),
    BASEBALL_GAME("숫자야구게임"),
    SHOPPING_BAG("장바구니"),
    PAYMENT("결제"),
    SUBWAY_MAP("지하철 노선도"),
    PERFORMANCE_IMPROVEMENT("성능개선"),
    DISTRIBUTION("배포");

    private String mission;

    Mission(String mission) {
        this.mission = mission;
    }

    public String getMission() {
        return mission;
    }

    public static boolean isExist(String inputMission){
        final Mission[] missions = Mission.values();

        for (Mission mission : missions) {
            if (mission.toString().equals(inputMission)) {
                return true;
            }
        }

        return false;
    }

}
