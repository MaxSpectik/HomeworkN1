public class Main {
    public static void main(String[] args) {
        Student h1 = new Student(19, "Egor", "Vasiliev");
        Student h2 = new Student(h1);
        h2.setName("Anton");
        h2.age = 18;
        h2.surname = "Ivanov";
        Student h3 = new Student(h2);
        h3.setName("Maxim");
        h3.age = 17;
        h3.surname = "Nikandrov";
        Teacher teacher = new Teacher(h1, h2, h3);
        teacher.students[0].Information();
        teacher.students[1].Information();
        teacher.students[2].Information();
        Teacher f1 = new Teacher(35, "Yuri", "Rysakov");
        Teacher f2 = new Teacher(f1);
        f2.age = 50;
        f2.name = "Nikita";
        f2.surname = "Vadimov";
        Teacher f3 = new Teacher(f2);
        f3.age = 60;
        f3.name = "Valera";
        f3.surname = "Leontiev";
        Teacher Teacher = new Teacher(f1, f2, f3);
        System.out.println("Information about teachers: " + f1.name + " " + f1.surname + " " + " " + f1.age + " " + "years elder");
        System.out.println("Information about teachers: " + f2.name + " " + f2.surname + " " + " " + f2.age + " " + "years elder");
        System.out.println("Information about teachers: " + f3.name + " " + f3.surname + " " + " " + f3.age + " " + "years elder");


    }
    }