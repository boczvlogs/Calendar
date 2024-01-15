import java.util.Calendar;

public class SimpleCalendar {

    public static void main(String[] args) {
        // Specify the month (0-based) and year
        int month = 0; // January is 0
        int year = 2024;

        
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, month);    
        calendar.set(Calendar.YEAR, year); 
        calendar.set(Calendar.DAY_OF_MONTH, 1);

        // Print the header
        System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat");

        // Determine the starting day of the week
        int startDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;
 
        // Print leading spaces
        for (int i = 0; i < startDay; i++) {
            System.out.print("     ");
        } 


        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);


        for (int day = 1; day <= daysInMonth; day++) {   
           
            if (day < 10) {
                System.out.print("    " + day);
            } else { 
                System.out.print("   " + day);
            }

            if ((startDay + day) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    } 
}
