//10.14
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {
    private int year;
    private int month;
    private int day;

    // No-arg constructor that creates a MyDate object for the current date
    public MyDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    // Constructor that constructs a MyDate object with a specified elapsed time since midnight, January 1, 1970, in milliseconds
    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    // Constructor that constructs a MyDate object with the specified year, month, and day
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Getter methods for year, month, and day
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    // Method named setDate(long elapsedTime) that sets a new date for the object using the elapsed time
    public void setDate(long elapsedTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    public static void main(String[] args) {
        // Test program that creates two MyDate objects and displays their year, month, and day
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(561555550000L);

        System.out.println("Date1: " + date1.getYear() + "-" + (date1.getMonth() ) + "-" + date1.getDay());
        System.out.println("Date2: " + date2.getYear() + "-" + (date2.getMonth() ) + "-" + date2.getDay());
    }
}
