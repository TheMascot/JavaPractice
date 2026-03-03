package JFD.Nine;

public class Student {

   private String name;
   private int id;
   private double gradePointAvarage;
   private Major major;

    public Student(String name, int id){
        this.name = name;
        this. id = id;
    }

    public Student(String name, int id, double gradePointAvarage,Major major){
        this(name, id);
        this.gradePointAvarage = gradePointAvarage;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getGradePointAvarage() {
        return gradePointAvarage;
    }

    public Major getMajor() {
        return major;
    }
}
