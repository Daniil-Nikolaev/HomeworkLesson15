public class Student {
    private String name;
    private int group;
    private int course;
    private int gradeMath;
    private int gradeScience;
    private int gradeLanguage;

    public Student(String name, int group, int course, int gradeMath, int gradeScience, int gradeLanguage) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.gradeMath = gradeMath;
        this.gradeScience = gradeScience;
        this.gradeLanguage = gradeLanguage;
    }


    public int getGpa() {
        return (gradeMath + gradeScience + gradeLanguage) / 3;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int i) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
    public String getName() {
        return name;
    }
}

