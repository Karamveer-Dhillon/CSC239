package courses;

public class TestCourse {

    public static void main(String[] args) {
        // Good course with valid credits
        try {
            Course course1 = new Course("CS101", 3, "Prof. A", "MWF", "10:00-11:00");
            System.out.println("Successfully created: " + course1.getCourseName());
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating course1: " + e.getMessage());
        }

        // Bad course - invalid credits (too high)
        try {
            Course course2 = new Course("CS102", 10, "Prof. B", "TTh", "14:00-15:30");
            System.out.println("Successfully created: " + course2.getCourseName());
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating course2: " + e.getMessage());
        }

        // Bad course - invalid credits (negative)
        try {
            Course course3 = new Course("CS103", -1, "Dr. C", "MWF", "09:00-10:00");
            System.out.println("Successfully created: " + course3.getCourseName());
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating course3: " + e.getMessage());
        }

        // Good course with valid maxStudents
        try {
            Course course4 = new Course("CS104", 4, "Prof. D", "TTh", "11:00-12:30", 20);
            System.out.println("Successfully created: " + course4.getCourseName());
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating course4: " + e.getMessage());
        }

        // Bad course - maxStudents too low
        try {
            Course course5 = new Course("CS105", 3, "Prof. E", "MWF", "13:00-14:00", 5);
            System.out.println("Successfully created: " + course5.getCourseName());
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating course5: " + e.getMessage());
        }

        // Bad course - maxStudents too high
        try {
            Course course6 = new Course("CS106", 3, "Dr. F", "TTh", "15:00-16:30", 50);
            System.out.println("Successfully created: " + course6.getCourseName());
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating course6: " + e.getMessage());
        }

        // Test adding duplicate student
        try {
            Course course7 = new Course("CS107", 3, "Prof. G", "MWF", "12:00-13:00");
            Student s1 = new Student("John Doe", "123456");
            course7.addStudent(s1);
            course7.addStudent(s1); // Should throw exception
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Error adding student: " + e.getMessage());
        }
    }
}
