package Oct.Oct07;

public class Student implements Comparable<Student>{

    private String name;
    private Integer age;
    private Integer Id;

    public Student(String name, Integer age, Integer id) {
        this.name = name;
        this.age = age;
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Id=" + Id +
                '}';
    }

//    @Override
//    public int compareTo(Student o)
//    {
//        //s1.id - s2.id => 0
//        //s1.id > s2.id => Ascending
//        //s1.id < s2.id => Descending
//        return this.Id - o.Id;
//    }

    @Override
    public int compareTo(Student o)
    {
        //s1.id - s2.id => 0
        //s1.id > s2.id => Ascending
        //s1.id < s2.id => Descending
        return this.name.compareTo(o.name);
    }

    //The two above override functions can be used only one at a time.
    // Either we can compare with name or id one at a time.
}



