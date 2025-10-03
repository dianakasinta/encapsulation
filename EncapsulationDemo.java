class Student {
    private String name;
    private int age;

    private static String school = "SMK Informatika";
    public static final String COUNTRY = "Indonesia";

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) { // validasi
            this.age = age;
        } else {
            System.out.println("Umur tidak valid!");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static String getSchool() {
        return school;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {

        Student s1 = new Student("Luigi", 20);

        s1.setName("Mario");
        s1.setAge(21);

        System.out.println("Nama: " + s1.getName());
        System.out.println("Umur: " + s1.getAge());

        System.out.println("Sekolah: " + Student.getSchool());
        System.out.println("Negara: " + Student.COUNTRY);
    }
}
