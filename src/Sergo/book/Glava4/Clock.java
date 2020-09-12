package Sergo.book.Glava4;

public class Clock {
    private String time;

    void setTime(String t){
        time = t;
    }

    String getTime(){
        return time;
    }
}

class ClockTestDrive{
    public static void main(String[] args) {
        Clock c = new Clock();

        c.setTime("1234");
        String cos = c.getTime();
        System.out.println("time " + cos);
    }
}
