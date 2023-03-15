public class Teacher {
    int age;
    String name;
    String surname;
    Teacher (int newAge, String newName, String newSurname) {
        age = newAge;
        name = newName;
        surname = newSurname;
    }
    Student[] students = new Student[3];
    Teacher (Student h1, Student h2, Student h3){
        students[0] = h1;
        students[1] = h2;
        students[2] = h3;
    }
    Teacher (Teacher f) {
        age = f.age;
        name = f.name;
        surname = f.surname;
    }
    void Informations() {
        System.out.println("Information about of teachers:" + name + " " + surname + " " + age + "years elder");
    }
    Teacher[] teacher = new Teacher[3];
    Teacher (Teacher f1, Teacher f2, Teacher f3){
        teacher[0] = f1;
        teacher[1] = f2;
        teacher[2] = f3;
    }


}
