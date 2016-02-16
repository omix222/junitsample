package hiromitest.sample;

public class Student {

    /**
     * 氏名
     */
    private String name;

    /**
     * 学生証番号
     */
    private String studentIdNumber;

    /**
     * 年齢
     */
    private int age;

    private Student(String name, String studentIdNumber, int age) {
        this.name = name;
        this.studentIdNumber = studentIdNumber;
        this.age = age;
    }

    public static Student newInstance(String name, String studentIdNumber, int age) {
        return new Student(name, studentIdNumber, age);
    }

    public String getName() {
        return name;
    }

    public String getStudentIdNumber() {
        return studentIdNumber;
    }

    public int getAge() {
        return age;
    }

}