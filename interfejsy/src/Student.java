public class Student implements Comparable<Student> {
    String imie;
    String nazwisko;
    String index;

    public Student(String imie, String nazwisko, String index) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.index = index;
    }


    @Override
    public int compareTo(Student o) {
        return this.index.compareTo(o.index);
    }
}
