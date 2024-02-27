import java.util.ArrayList;
import java.util.concurrent.LinkedTransferQueue;
public class Bathroom_Gelfand {
    private int capacity;
    private LinkedTransferQueue<Student_Gelfand> line;
    private Student_Gelfand[] inBathroom;
    private ArrayList<Student_Gelfand> leftBathroom;

    public Bathroom_Gelfand(int capacity) {
        this.capacity = capacity;
        line = new LinkedTransferQueue<>();
        inBathroom = new Student_Gelfand[capacity];
        leftBathroom = new ArrayList<>();
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
        inBathroom = new Student_Gelfand[capacity];
    }

    public void clearData() {
        line.clear();
        leftBathroom.clear();
        for(int i = 0; i < inBathroom.length; i++) {
            inBathroom[i] = null;
        }
    }

    public void addToLine(Student_Gelfand student) {
        if (!leftBathroom.contains(student)) {
            line.offer(student);
        }
    }

    public void studentLeaves(Student_Gelfand student) {
        for (int i = 0; i < inBathroom.length; i++) {
            if (inBathroom[i] != null && inBathroom[i].equals(student)) {
                inBathroom[i] = null;
                leftBathroom.add(student);

            }
        }
    }

    public Student_Gelfand[] getInBathroom() {
        return inBathroom;
    }

    public String searchStudent(Student_Gelfand student) {
        if (line.contains(student)) {
            return student.getFirstName() + " " + student.getLastName() + " is in line.";
        } else {
            for (Student_Gelfand s : inBathroom) {
                if (s != null && s.equals(student)) {
                    return student.getFirstName() + " " + student.getLastName() + " is in the bathroom.";
                }
            }
            if (leftBathroom.contains(student)) {
                return student.getFirstName() + " " + student.getLastName() + " has left the bathroom.";
            }
        }
        return "Student not found.";
    }

    public int getLineLength() {
        return line.size();
    }

    public Integer test() {
       return null;
    }

}
