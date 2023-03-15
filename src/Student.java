public class Student {
private String name;
int age;
String surname;
void setName(String name) {
    name = this.name;
    }
    String getName() {
    return name;
    }
Student(int newAge, String newName, String newSurname) {
    age = newAge;
    name = newName;
    surname = newSurname;
}
Student(Student h) {
    age = h.age;
    name = h.name;
    surname = h.surname;
}
    void Information() {
        System.out.println("Information about of students: " + name +" " + surname + " " + age + " " +"years elder");
    }

}
