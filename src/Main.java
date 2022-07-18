public class Main {
    public static void main(String[] args) {
        result(3);
        result(15);
        result(22);
        result(35);
        result(78);
    }
    public static void result(int age1) {
        if(age1<7) {
            System.out.println("Go to the nursery");
        }
        if (age1<18 && age1>7) {
            System.out.println("Go to the school");
        }
        if (age1<23 && age1>18) {
            System.out.println("Go to university");
        }
        if (age1<65 && age1>23){
                System.out.println("Go to work");
            }
            if(age1>65) {
                System.out.println("Go to hospital");
            }
        }
    }