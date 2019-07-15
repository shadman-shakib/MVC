public class MVC {

    public static void main(String[] args) {
	// write your code here
        View view = new View();
        Controller controller = new Controller();
        int []list = new int[3];
        list[0] = view.takeInput();
        list[1] = view.takeInput();
        list[2] = view.takeInput();

        int n = view.takeInput();
        if (n==1){
            int max = controller.getMaX(list);
            view.showOutput(max);
        }
        else {
            //int min = controller.getag(list);
            //view.showft(min);
        }
    }
}
