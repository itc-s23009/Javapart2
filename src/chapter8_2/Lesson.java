package chapter8_2;

public class Lesson {
    private String lesseonId;
    private String lessonName;

    public Lesson(String lesseonId, String lessonName) {
        this.lesseonId = lesseonId;
        this.lessonName = lessonName;
    }

    public int fee() {
        return  1000;
    }

    public String getLesseonId() {
        return lesseonId;
    }

    public String getLessonName() {
        return lessonName;
    }
}
