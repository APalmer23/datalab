import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

//id,study_hours,sleep_hours,social_media_hours,exam_score,stress_level
public class StudentAnalysis {
    static ArrayList<Student> students = new ArrayList<>();
    public static void loadFromFile(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] values = line.split(",");
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
    public static ArrayList<Student> listByStudyHours(){
        ArrayList<Student> arr = students;
        arr.sort((a,b)->Integer.compare(b.getStudy_hours(),a.getStudy_hours()));
        return arr;
    }
    public static ArrayList<Student> listBySleepHours(){
        ArrayList<Student> arr = students;
        arr.sort((a,b)->Integer.compare(b.getSleep_hours(),a.getSleep_hours()));
        return arr;
    }
    public static ArrayList<Student> listByMediaHours(){
        ArrayList<Student> arr = students;
        arr.sort((a,b)->Integer.compare(b.getSocial_media_hours(),a.getSocial_media_hours()));
        return arr;
    }
    public static ArrayList<Student> listByScore(){
        ArrayList<Student> arr = students;
        arr.sort((a,b)->Integer.compare(b.getExam_score(),a.getExam_score()));
        return arr;
    }
    public static ArrayList<Student> getByLevel(String str){
        ArrayList<Student> arr = new ArrayList<>();
        for (Student s:students){
            if (s.getStress_level().equals(str)){
                arr.add(s);
            }
        }
        return arr;
    }
    public static Student getStudent(int id){
        return students.get(id-1);
    }
    public static int getMeanSleepHours(){
        int sum=0;
        for (Student s:listBySleepHours()){
            sum+=s.getSleep_hours();
        }
        return sum/students.size();
    }
    public static int getMedianSleepHours(){
        return(listBySleepHours().get(students.size()/2)).getSleep_hours();
    }
    public static int getModeSleepHours(){
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
    public static int getMeanStudyHours(){
        int sum=0;
        for (Student s:listByStudyHours()){
            sum+=s.getStudy_hours();
        }
        return sum/students.size();
    }
    public static int getMedianStudyHours(){
        return(listByStudyHours().get(students.size()/2)).getStudy_hours();
    }
    public static int getModeStudyHours(){
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
    public static int getMeanMediaHours(){
        int sum=0;
        for (Student s:listByMediaHours()){
            sum+=s.getSocial_media_hours();
        }
        return sum/students.size();
    }
    public static int getMedianMediaHours(){
        return(listByMediaHours().get(students.size()/2)).getSocial_media_hours();
    }
    public static int getModeMediaHours(){
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
    public static int getMeanScore(){
        int sum=0;
        for (Student s:listByScore()){
            sum+=s.getExam_score();
        }
        return sum/students.size();
    }
    public static int getMedianScore(){
        return(listByScore().get(students.size()/2)).getExam_score();
    }
    public static int getModeScore(){
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
    public static void console() throws FileNotFoundException {
        int c = 0;
        Scanner scann = new Scanner(System.in);
        Scanner scannn = new Scanner(System.in);
        System.out.println("------------------------------\nData Analyzer\n------------------------------\n");
        System.out.println("Please select an option:");
        System.out.println("1. Load student data from file\n2. List students by stat\n3. Get specific student(s)\n4. Get mean, median, or mode\n5. Exit program");
        System.out.print("Selection: ");
        c = scann.nextInt();
        if (c==1){
            Scanner scan = new Scanner(System.in);
            String fn=scan.nextLine();
            File file = new File(fn+=".csv");
            StudentAnalysis.loadFromFile(file);
            console();
        }
        else if (c ==2){
            System.out.println("\n1. List by hours spent sleeping\n2. List by hours spent studying\n3. List by hours spent on social media\n4. List by exam score");
            System.out.print("Selection: ");
            c = scann.nextInt();
            if (c==1){
                System.out.println(listBySleepHours());
            }
            else if (c==2){
                System.out.println(listByStudyHours());
            }
            else if (c==3){
                System.out.println(listByMediaHours());
            }
            else if (c==4){
                System.out.println(listByScore());
            }
        }
        else if (c ==3){
            System.out.println("\n1. Get specific student\n2. Get students with specific stress level");
            System.out.print("Selection: ");
            c=scann.nextInt();
            if (c==1){
                System.out.print("Enter student ID: ");
                c=scann.nextInt();
                System.out.println(getStudent(c));
            }
            else if (c==2){
                System.out.print("Enter stress level (High, Medium, Low): ");
                String s = scannn.nextLine();
                System.out.println(getByLevel(s));
            }
        }
        else if (c ==4){
            System.out.println("\n1. Get for hours spent sleeping\n2. Get for hours spent studying\n3. Get for hours spent on social media\n4. Get for exam score");
            System.out.print("Selection: ");
            c = scann.nextInt();
            if (c==1){
                System.out.println("\n1. Get Mean\n2. Get Median\n3. Get Mode");
                System.out.print("Selection: ");
                c=scann.nextInt();
                if (c==1){
                    System.out.println(getMeanSleepHours());
                }
                else if (c==2){
                    System.out.println(getMedianSleepHours());
                }
                else if (c==3){
                    System.out.println(getModeSleepHours());
                }
            }
            else if (c==2){
                System.out.println("\n1. Get Mean\n2. Get Median\n3. Get Mode");
                System.out.print("Selection: ");
                c=scann.nextInt();
                if (c==1){
                    System.out.println(getMeanStudyHours());
                }
                else if (c==2){
                    System.out.println(getMedianStudyHours());
                }
                else if (c==3){
                    System.out.println(getModeStudyHours());
                }
            }
            else if (c==3){
                System.out.println("\n1. Get Mean\n2. Get Median\n3. Get Mode");
                System.out.print("Selection: ");
                c=scann.nextInt();
                if (c==1){
                    System.out.println(getMeanMediaHours());
                }
                else if (c==2){
                    System.out.println(getMedianMediaHours());
                }
                else if (c==3){
                    System.out.println(getModeMediaHours());
                }
            }
            else if (c==4){
                System.out.println("\n1. Get Mean\n2. Get Median\n3. Get Mode");
                System.out.print("Selection: ");
                c=scann.nextInt();
                if (c==1){
                    System.out.println(getMeanScore());
                }
                else if (c==2){
                    System.out.println(getMedianScore());
                }
                else if (c==3){
                    System.out.println(getModeScore());
                }
            }
        }
        else{
            System.exit(0);
        }
    }
}
