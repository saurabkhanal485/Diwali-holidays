import java.io.*;
import java.util.*;

class LowAttendanceException extends Exception {
    public LowAttendanceException(String message) {
        super(message);
    }
}

class Student implements Serializable, Comparable<Student> {
    private int rollno;
    private String sname;
    private String course;
    private double attendance_percentage;
    private double score;

    public Student() {}

    public Student(int rollno, String sname, String course, double attendance_percentage, double score) throws LowAttendanceException {
        this.rollno = rollno;
        this.sname = sname;
        this.course = course;
        if(attendance_percentage < 60) {
            throw new LowAttendanceException("Attendance less than 60% for student: " + sname);
        }
        this.attendance_percentage = attendance_percentage;
        this.score = score;
    }

    public String calculateGrade() {
        if(score >= 90) return "A+";
        else if(score >= 80) return "A";
        else if(score >= 70) return "B";
        else if(score >= 60) return "C";
        else return "F";
    }

    public double getAttendance_percentage() {
        return attendance_percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", sname='" + sname + '\'' +
                ", course='" + course + '\'' +
                ", attendance_percentage=" + attendance_percentage +
                ", score=" + score +
                ", grade=" + calculateGrade() +
                '}';
    }

  
    @Override
    public int compareTo(Student other) {
        return Double.compare(other.attendance_percentage, this.attendance_percentage);
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        try {
            studentList.add(new Student(1, "Student1", "CS", 85, 92));
            studentList.add(new Student(2, "Student2", "IT", 70, 75));
            studentList.add(new Student(3, "Student3", "CS", 90, 88));
            studentList.add(new Student(4, "Student4", "IT", 55, 65)); // This will throw exception
            studentList.add(new Student(5, "Student5", "CS", 95, 98));
            studentList.add(new Student(6, "Student6", "IT", 80, 72));
            studentList.add(new Student(7, "Student7", "CS", 60, 60));
            studentList.add(new Student(8, "Student8", "IT", 82, 85));
            studentList.add(new Student(9, "Student9", "CS", 77, 79));
            studentList.add(new Student(10, "Student10", "IT", 66, 70));
        } catch (LowAttendanceException e) {
            System.out.println(e.getMessage());
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.ser"))) {
            for (Student s : studentList) {
                oos.writeObject(s);
            }
            System.out.println("Students serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        TreeSet<Student> studentSet = new TreeSet<>(studentList);

        System.out.println("\nStudents in decreasing order of attendance:");
        for (Student s : studentSet) {
            System.out.println(s);
        }
    }
}
