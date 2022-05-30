package pairmatching.model;

public enum Level {
    LEVEL1("레벨1"),
    LEVEL2("레벨2"),
    LEVEL3("레벨3"),
    LEVEL4("레벨4"),
    LEVEL5("레벨5");

    private String level;

    Level(String level) {
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public static boolean isExist(String inputLevel){
        final Level[] levels = Level.values();

        for (Level level : levels) {
            if (level.toString().equals(inputLevel)) {
                return true;
            }
        }

        return false;
    }
}
