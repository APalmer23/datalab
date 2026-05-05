import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
//id,study_hours,sleep_hours,social_media_hours,exam_score,stress_level
public class StudentAnalysis {
    ArrayList<Student> students = new ArrayList<>();
    public void loadFromFile(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] values = line.fsplit(",");
            Student student = new Student(
                    Integer.parseInt(values[0]),
                    Integer.parseInt(values[1]),
                    Integer.parseInt(values[2]),
                    Integer.parseInt(values[3]),
                    Integer.parseInt(values[4]),
                    values[5]
            );
            students.add(student);
        }
    }
    public ArrayList<Student> listByStudyHours(){

    }
    public ArrayList<Student> listBySleepHours(){

    }
    public ArrayList<Student> listByMediaHours(){

    }
    public ArrayList<Student> listByScore(){

    }
    public ArrayList<Student> getByLevel(String str){
        ArrayList<Student> arr = new ArrayList<>();
        if (!str.equals("High")&&!str.equals("Medium")&&!str.equals("Low"))
        for (Student s:students){
            if 
        }
    }
    public Student getStudent(int id){
        return students.get(id-1);
    }
    public int getMeanSleepHours(){
        int sum=0;
        for (Student s:listBySleepHours()){
            sum+=s.getSleep_hours();
        }
        return sum/students.size();
    }
    public int getMedianSleepHours(){
        return(listBySleepHours().get(students.size()/2)).getSleep_hours();
    }
    public int getModeSleepHours(){
        int[] log = new int[24];
        int max=0;
        for (Student s:listBySleepHours()){
            log[s.getSleep_hours()]++;
            if (log[s.getSleep_hours()]>max){
                max=log[s.getSleep_hours()];
            }
        }
        return max;
    }
    public int getMeanStudyHours(){
        int sum=0;
        for (Student s:listByStudyHours()){
            sum+=s.getStudy_hours();
        }
        return sum/students.size();
    }
    public int getMedianStudyHours(){
        return(listByStudyHours().get(students.size()/2)).getStudy_hours();
    }
    public int getModeStudyHours(){
        int[] log = new int[24];
        int max=0;
        for (Student s:listByStudyHours()){
            log[s.getStudy_hours()]++;
            if (log[s.getStudy_hours()]>max){
                max=log[s.getStudy_hours()];
            }
        }
        return max;
    }
    public int getMeanMediaHours(){
        int sum=0;
        for (Student s:listByMediaHours()){
            sum+=s.getSocial_media_hours();
        }
        return sum/students.size();
    }
    public int getMedianMediaHours(){
        return(listByMediaHours().get(students.size()/2)).getSocial_media_hours();
    }
    public int getModeMediaHours(){
        int[] log = new int[24];
        int max=0;
        for (Student s:listByMediaHours()){
            log[s.getSocial_media_hours()]++;
            if (log[s.getSocial_media_hours()]>max){
                max=log[s.getSocial_media_hours()];
            }
        }
        return max;
    }
    public int getMeanScore(){
        int sum=0;
        for (Student s:listByScore()){
            sum+=s.getExam_score();
        }
        return sum/students.size();
    }
    public int getMedianScore(){
        return(listByScore().get(students.size()/2)).getExam_score();
    }
    public int getModeScore(){
        int[] log = new int[100];
        int max=0;
        for (Student s:listByScore()){
            log[s.getExam_score()]++;
            if (log[s.getExam_score()]>max){
                max=log[s.getExam_score()];
            }
        }
        return max;
    }
}
