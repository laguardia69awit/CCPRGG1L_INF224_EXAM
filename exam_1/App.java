public class App {
    public static void main(String[] args) {

        //Create a Student Class

        //object - stu
        //surname - Laguardia
        //firstname - Luis Gabriel
        //middleInitial - H
        //dateOfBirth - 05/04/04
        //studentNumber - 2022104583
        //studentEmailAddress - laguardialh@students.national-u.edu.ph
        //iAmAwesome - true

        Student stu = new Student();

        stu.surname = "Laguardia";
        stu.firstname = "Luis Gabriel";
        stu.middleInitial = 'H';
        stu.dateOfBirth = "05/04/04";
        stu.studentNumber = 2022104583;
        stu.studentEmailAddress = "laguardialh@students.national-u.edu.ph";
        stu.iAmAwesome = true;

        stu.sayMystudentNumber();
        stu.sayMystudentEmailAddress();
        stu.sayiAmAwesome();

    }
}
