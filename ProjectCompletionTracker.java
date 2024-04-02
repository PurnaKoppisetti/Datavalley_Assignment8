import java.util.ArrayList;
import java.util.List;

class StudentProject {
    private String studentName;
    private int completionTime;

    public StudentProject(String studentName, int completionTime) {
        this.studentName = studentName;
        this.completionTime = completionTime;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getCompletionTime() {
        return completionTime;
    }
}

public class ProjectCompletionTracker {
    public static void main(String[] args) {
        List<StudentProject> projects = new ArrayList<>();
        projects.add(new StudentProject("Alice", 10)); // Example projects, you can add more
        projects.add(new StudentProject("Bob", 5));
        projects.add(new Stud…
