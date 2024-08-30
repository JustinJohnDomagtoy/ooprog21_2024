public class Main {
    public static void main(String[] args) {
        Main obj = new Main();

        System.out.println(obj.sleepIn(false, false));  
        System.out.println(obj.sleepIn(true, false));   
        System.out.println(obj.sleepIn(false, true));   
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}

