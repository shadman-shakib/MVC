import java.util.ArrayList;

public class Main
{
    public static ArrayList<Student> studentArraylist = new ArrayList<Student>();

    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        // take input
        View view = new View();
        Controller controller = new Controller();
        while(true) {

            int n = view.takeInput();
            if (n == 1) {
                // take new student
                String name = view.takeInputString();
                String id = view.takeInputString();

                int AGE =  view.takeInput();
                Student student = new Student(name, id, AGE);
                studentArraylist.add(student);

            } else if (n == 2)
            {
                // name Student id
                String b =  controller.nameID();
                view.showOutputString(b);



            } else if (n == 3) {
                // name age
                String b =  controller.nameAge();
                view.showOutputString(b);


            } else if (n == 4) {
                // avg age
                float avage= controller.getAvgAge();
                view.showft(avage);

            }
        }


    }
}
