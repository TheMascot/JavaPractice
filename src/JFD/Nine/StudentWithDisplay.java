package JFD.Nine;

public class StudentWithDisplay extends Student {

    public StudentWithDisplay(String name, int id) {
        super(name, id);
    }

    public StudentWithDisplay(String name, int id, double gradePointAvarage, Major major) {
        super(name, id, gradePointAvarage, major);
    }

    public String getString() {
        return"Name: " + this.getName() + ", Id: " + this.getId() + ", GPA: " + this.getGradePointAvarage() + ", " +
                "Major: " +
                 this.getMajor();
    }
}
