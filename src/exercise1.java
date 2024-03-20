import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.lang.Math.*;
import java.time.*;

public class exercise1 {

    private static int calculateArea(int length, int width){
        int area = length * width;
        return area;
    }

    public static void calculateAreaofCircle(int radius){
        int diameter = radius * 2;
        double circumference = diameter * Math.PI;
        double area = Math.pow(circumference, 2) / (4 * Math.PI);

        System.out.println("Diameter: "+diameter);
        System.out.println("Circumference: "+circumference);
        System.out.println("Area of circle: "+area);
    }

    public static int calculateTriangleAngles(int angles1, int angles2){
        int triangle = 180 - (angles1+angles2);
        return triangle;
    }

    public static int dateDifferences(String d1, String d2){
//        Date time pattern formatter
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date1 = LocalDate.parse(d1, DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate date2 = LocalDate.parse(d2, DateTimeFormatter.ISO_LOCAL_DATE);
        Duration diff = Duration.between(date1.atStartOfDay(), date2.atStartOfDay());
//        long dayDifference = ChronoUnit.Days.between(date1, date2);
        int diffDays = (int) diff.toDays();
        return diffDays;
    }

    public static void firstLetterInitial(String name){
        name = ' ' + name;

        int strLen = name.length();
        System.out.print("Short of name: ");
        for (int i = 0; i < strLen; i++) {
            if (name.charAt(i) == (' '))
                System.out.print(Character.toUpperCase(name.charAt(i + 1)));
        }
    }

    public static void main(String[] args) {
//        Number 1
        Scanner in = new Scanner(System.in);
        System.out.print("Length: ");
        int length = in.nextInt();
        System.out.print("Width: ");
        int width = in.nextInt();

        System.out.println("Wide area: "+calculateArea(length,width));
        System.out.println();

        in.nextLine();

//        Number 2
        System.out.print("Radius: ");
        int radius = in.nextInt();
        calculateAreaofCircle(radius);
        System.out.println();

        in.nextLine();

//        Number 3
        System.out.print("Angles 1: ");
        int angles1 = in.nextInt();
        System.out.print("Angles 2: ");
        int angles2 = in.nextInt();
        System.out.println("Angles of triangle: "+calculateTriangleAngles(angles1,angles2));
        System.out.println();

        in.nextLine();

//        Number 4
//        This to calculate different day
        System.out.print("Date before: ");
        String date1 = in.nextLine();
        System.out.print("Date after: ");
        String date2 = in.next();
        System.out.println("Date Difference: "+dateDifferences(date1, date2)+" days");
        System.out.println();
        in.nextLine();
        in.close();
//        Number 5
        System.out.print("Name: ");
        String name = in.nextLine();
        firstLetterInitial(name);
    }
}
