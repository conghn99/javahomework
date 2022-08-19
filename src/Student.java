public class Student {
    private String id;
    private String name;
    private int age;
    private String academicRank;

    public Student(String id, String name, String academicRank, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.academicRank = academicRank;
    }

    public String getId() {
        return id;
    }

    public void setAcademicRank(String academicRank) {
        this.academicRank = academicRank;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + id +
                ", Name=" + name +
                ", Age=" + age + 
                ", Academic Rank=" + academicRank +
                '}';
    }

    public boolean hasKeyword(String keyword) {
        boolean result = this.id.contains(keyword);
        return result;
    }
}
