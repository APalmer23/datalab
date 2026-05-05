public class Student {
    private int id;
    private int study_hours;
    private int sleep_hours;
    private int social_media_hours;
    private int exam_score;
    private String stress_level;

    public Student(int id, int study_hours, int sleep_hours, int social_media_hours, int exam_score, String stress_level) {
        this.id = id;
        this.study_hours = study_hours;
        this.sleep_hours = sleep_hours;
        this.social_media_hours = social_media_hours;
        this.exam_score = exam_score;
        this.stress_level = stress_level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudy_hours() {
        return study_hours;
    }

    public void setStudy_hours(int study_hours) {
        this.study_hours = study_hours;
    }

    public int getSleep_hours() {
        return sleep_hours;
    }

    public void setSleep_hours(int sleep_hours) {
        this.sleep_hours = sleep_hours;
    }

    public int getSocial_media_hours() {
        return social_media_hours;
    }

    public void setSocial_media_hours(int social_media_hours) {
        this.social_media_hours = social_media_hours;
    }

    public int getExam_score() {
        return exam_score;
    }

    public void setExam_score(int exam_score) {
        this.exam_score = exam_score;
    }

    public String getStress_level() {
        return stress_level;
    }

    public void setStress_level(String stress_level) {
        this.stress_level = stress_level;
    }
}
