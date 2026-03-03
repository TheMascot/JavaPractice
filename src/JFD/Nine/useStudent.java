package JFD.Nine;

import org.w3c.dom.ls.LSOutput;

public class useStudent {
    public static void main(String[] args) {

        Student s1 = new Student("Alex", 123123);
        Student s2 = new Student("Dotty", 3456234, 3.4, Major.MATHEMATICS);

        System.out.println(s1.getName());
        System.out.println(s1.getId());
        System.out.println(s1.getGradePointAvarage());
        System.out.println(s1.getMajor());

        System.out.println(s2.getName());
        System.out.println(s2.getId());
        System.out.println(s2.getGradePointAvarage());
        System.out.println(s2.getMajor());

        StudentWithDisplay swd3 = new StudentWithDisplay("Bob", 74747, 2.6, Major.PHYSICS);
        System.out.println(swd3.getString());

    }
}
