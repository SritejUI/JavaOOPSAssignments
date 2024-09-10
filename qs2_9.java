import java.util.Scanner;

public class qs2_9 {

    public static class Clock {
        int hours;
        int minutes;
        int seconds;

        public Clock(int hours, int minutes, int seconds) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        }

        public Clock add(Clock other) {
            int totalSeconds = this.seconds + other.seconds;
            int totalMinutes = this.minutes + other.minutes + totalSeconds / 60;
            int totalHours = this.hours + other.hours + totalMinutes / 60;

            totalSeconds %= 60;
            totalMinutes %= 60;
            totalHours %= 24;

            return new Clock(totalHours, totalMinutes, totalSeconds);
        }

        public void printTime() {
            System.out.println(hours + ":" + minutes + ":" + seconds);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hours for time 1: ");
        int hours1 = scanner.nextInt();
        System.out.print("Enter minutes for time 1: ");
        int minutes1 = scanner.nextInt();
        System.out.print("Enter seconds for time 1: ");
        int seconds1 = scanner.nextInt();

        System.out.print("Enter hours for time 2: ");
        int hours2 = scanner.nextInt();
        System.out.print("Enter minutes for time 2: ");
        int minutes2 = scanner.nextInt();
        System.out.print("Enter seconds for time 2: ");
        int seconds2 = scanner.nextInt();

        Clock c1 = new Clock(hours1, minutes1, seconds1);
        Clock c2 = new Clock(hours2, minutes2, seconds2);

        Clock c3 = c1.add(c2);

        System.out.print("Time 1: ");
        c1.printTime();
       
        System.out.print("Time 2: ");
        c2.printTime();
       
        System.out.print("Time after addition: ");
        c3.printTime();
    }
}