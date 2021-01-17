import java.util.Objects;

class Teacher{
    //name of the teacher
    private String name;
    //name of the subject which the teacher teaches
    private String subjectName;
    //will we attend the lecture or not
    private boolean willAttend;

    //alt+ insert to insert a constructor,getter,setter,toString method,equals and hashcode


    public Teacher(String name, String subjectName, boolean willAttend) {
        this.name = name;
        this.subjectName = subjectName;
        this.willAttend = willAttend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public boolean isWillAttend() {
        return willAttend;
    }

    public void setWillAttend(boolean willAttend) {
        this.willAttend = willAttend;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return isWillAttend() == teacher.isWillAttend() &&
                Objects.equals(getName(), teacher.getName()) &&
                Objects.equals(getSubjectName(), teacher.getSubjectName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSubjectName(), isWillAttend());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", willAttend=" + willAttend +
                '}';
    }
}