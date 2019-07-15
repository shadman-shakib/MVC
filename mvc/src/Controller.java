public class Controller {
    public int getMaX(int []list) {

        return 0;
    }
    public float getAvgAge() {
        int sum = 0;

        for (int i = 0; i < Main.studentArraylist.size(); i++) {
           sum+= Main.studentArraylist.get(i).age;
        }
        return sum/Main.studentArraylist.size();
    }

    public String nameID()
    {
        String x= "";
        for (int i = 0; i < Main.studentArraylist.size(); i++) {
            x+= Main.studentArraylist.get(i).getName()+" , "+Main.studentArraylist.get(i).getId()+"\n";

        }
        return x;
    }
    public String nameAge()
    {
        String x= "";
        for (int i = 0; i < Main.studentArraylist.size(); i++) {
            x+= Main.studentArraylist.get(i).getName()+" , "+Main.studentArraylist.get(i).getAge()+"\n";

        }
        return x;
    }


}
