package courses;

/**
 *
 * @author Karamveer Dhillon
 */
public class Course {

    private String courseName;
    private int credits;
    private String instructorName;
    private String days;
    private String times;
    private Student[] students;
    private int numStudents = 0;
    private int maxStudents = 30;
    
    public Course(String courseName) {
        this.courseName = courseName;
        students = new Student[maxStudents];
    }

    public Course(String courseName, int credits, String instructorName,
                  String days, String times) {
        if (credits < 0 || credits > 6) {
            throw new IllegalArgumentException("Credits must be between 0 and 6");
        }

        students = new Student[maxStudents];
        this.credits = credits;
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.days = days;
        this.times = times;
    }
    public Course(String courseName, int credits, String instructorName,
                  String days, String times, int maxStudents) {
        if (maxStudents < 8 || maxStudents > 30) {
            throw new IllegalArgumentException("Max students must be between 8 and 30");
        }
        if (credits < 0 || credits > 6) {
            throw new IllegalArgumentException("Credits must be between 0 and 6");
        }

        this.maxStudents = maxStudents;
        students = new Student[this.maxStudents];

        this.credits = credits;
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.days = days;
        this.times = times;
    }
    // TODO: create addStudents that adds an ARRAY of students
    // ERROR if student already in list of students
    // already in our list of students...
    public void addStudents(Student[] students) {
        if (numStudents == 0) {
           
            this.students = students;
            numStudents = students.length;
        } else {
            for (int i = 0; i < students.length; i++) {
                addStudent(students[i]);
            }
        }
    }
    public void addStudent(Student s) {
        if (numStudents >= maxStudents) {
            throw new IllegalStateException("Course is full. Cannot add more students.");
        }

        for (int i = 0; i < numStudents; i++) {
            if (students[i].getStudentID().equals(s.getStudentID())) {
                throw new IllegalArgumentException("Student already enrolled in course");
            }
        }

        students[numStudents++] = s;
    }

    public Student[] getStudents() {
        Student[] s = new Student[numStudents];
        for (int i = 0; i < numStudents; i++)
            s[i] = students[i];
        return s;
    }
    // TODO public Student getStudent(String name)
    public Student getStudent(String name) {
        for (int i = 0; i < numStudents; i++) {
            if (students[i].getStudentName().equalsIgnoreCase(name)) {
                return students[i];
            }
        }
        return null;
    }
    // TODO public Student getStudent (String id)
    public Student getStudent(String id, boolean isID) {
        for (int i = 0; i < numStudents; i++) {
            if (students[i].getStudentID().equals(id)) {
                return students[i];
            }
        }
        return null;
    }

    public int getNumStudents() {
        return numStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public String getDays() {
        return days;
    }

    public String getTimes() {
        return times;
    }

 // TODO
 public void dropStudent(Student s) {
     int indexToRemove = -1;

     for (int i = 0; i < numStudents; i++) {
         if (students[i].getStudentID().equals(s.getStudentID())) {
             indexToRemove = i;
             break;
         }
     }

     if (indexToRemove == -1) {
         throw new IllegalArgumentException("Student not found in course");
     }

     for (int i = indexToRemove; i < numStudents - 1; i++) {
         students[i] = students[i + 1];
     }

     students[numStudents - 1] = null;
     numStudents--;
 }

    @Override
    public String toString() {
        String frontEnd = courseName + "\n" + instructorName + "\nCredits: " 
                + credits + "\nHas " + maxStudents + " max"
                + "\nMeets: " + days + ", " + times;
        // TODO: add list of students to toString
        // don't have all maxStudents (likely) so can't use
        // foreach loop like this
        // for (Student s : students) {
        for (int i = 0; i < numStudents; i++) {
            frontEnd += "\n" + students[i].toString();
        }
        return frontEnd;
    }
}
