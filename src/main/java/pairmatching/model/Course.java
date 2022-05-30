package pairmatching.model;

public enum Course {
    BACKEND("백엔드"),
    FRONTEND("프론트엔드");

    private String courseName;

    Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public static boolean isExist(String inputCourseName){
        final Course[] values = Course.values();

        for (int i = 0; i < values.length; i++) {
            if(values.toString().equals(inputCourseName)){
                return true;
            }
        }

        return false;
    }
}
