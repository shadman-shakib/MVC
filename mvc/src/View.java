import java.util.Scanner;

public class View {
    public String takeInputString(){
        Scanner scanner = new Scanner(System.in);

        return scanner.next();
    }

    public int takeInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void showOutput(int n){
        System.out.println(n);
    }
    public void showft(float n){
        System.out.println(n);
    }
    public void showOutputString(String n){
        System.out.println(n);
    }


}
