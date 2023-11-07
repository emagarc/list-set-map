package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentRecord {

    private Map<String, Integer> studentRecords;

    public StudentRecord() {
        studentRecords = new HashMap<>();
    }

    public StudentRecord(Map<String, Integer> studentRecords) {
        this.studentRecords = studentRecords;
    }

    public void addStudent(String studentName, int grade) {
        studentRecords.put(studentName, grade);
    }

    public boolean removeStudent(String studentName) {
        return studentRecords.remove(studentName) != null;
    }

    public int getGrade(String studentName) {
        Integer grade = studentRecords.get(studentName);
        return (grade != null) ? grade : -1;
    }

    public boolean isStudentInRecord(String studentName) {
        return studentRecords.containsKey(studentName);
    }

    public boolean containsGrade(int grade) {
        return studentRecords.containsValue(grade);
    }

    public Set<String> getStudentsNames() {
        return studentRecords.keySet();
    }


}
