package Oct.Oct08.Queue;

public class ATBStudent implements Comparable<ATBStudent> {
    private int Id;
    private String name;
    private String Coursename;

    public ATBStudent(int id, String name, String Coursename) {
        Id = id;
        this.name = name;
        this.Coursename = Coursename;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoursename() {
        return Coursename;
    }

    public void setCoursename(String coursename) {
        Coursename = coursename;
    }

    @Override
    public String toString() {
        return "ATBStudent{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", Coursename='" + Coursename + '\'' +
                '}';
    }


    @Override
    public int compareTo(ATBStudent o) {
        return Integer.compare(this.Id,o.Id);
    }
}

