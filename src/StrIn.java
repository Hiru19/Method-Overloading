public class StrIn {
    void display(double a){
        System.out.println("Double!");

    }
    void display(String b){
        System.out.println("String!");

    }

    public static void main(String[] args){
        StrIn si = new StrIn();
        si.display("hiruni");
        si.display(34.78);
    }
}
