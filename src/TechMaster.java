public class TechMaster {
    private String classManagerName;
    private String teacherName;
    private Class classes;

    public void setClassManagerName(String classManagerName) {
        this.classManagerName = classManagerName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setClasses(Class classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "TechMaster{" +
                "Class Manager Name=" + classManagerName +
                ", Teacher Name=" + teacherName +
                ", Class Info=" + classes + 
                '}';
    }
}
