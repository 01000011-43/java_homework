public class Course13_13{
    public static void main(String[] args){
        Course course1 = new Course("Java");
        course1.addStudent("caocan");
        course1.addStudent("jinxue");
        course1.addStudent("chenxiaoling");
        System.out.println(course1.getCourseName()+"学生有：");
        for(int i=0;i<course1.getNumberOfStudents();i++){
            System.out.println(course1.getStudents()[i]);
        }
        System.out.println("\n");
        Course course2 = (Course)course1.clone();
        System.out.println("cloned"+course2.getCourseName()+"学生有：");
        for(int i=0;i<course1.getNumberOfStudents();i++){
            System.out.println(course2.getStudents()[i]);
        }
        }
    }
class Course implements Cloneable{
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(String student){
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public void setStudents(String[] students) {
        this.students = students;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    @Override
    public Object clone(){
        try{
            Course courseClone = (Course)super.clone();
            courseClone.students = (String[]) (students.clone());
            return courseClone;
        }
        catch (CloneNotSupportedException ex){
            return null;
        }
    }
}