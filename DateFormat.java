package Exercise1;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class DateFormat {

	public static void main(String[] args) {
		int dw = Integer.parseInt(args[0]);
		int dd = Integer.parseInt(args[1]);
		int mm = Integer.parseInt(args[2]);
		int yy = Integer.parseInt(args[3]);

		Scanner reader = new Scanner(System.in);
		
		List<String> months = new ArrayList<String>();
		months.add("January");
		months.add("February");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("June");
		months.add("July");
		months.add("August");
		months.add("September");
		months.add("October");
		months.add("Novemver");
		months.add("December");
		
		String month = (String)months.get(mm - 1);
		
		List<String> daysOfWeek = new ArrayList<String>();
		daysOfWeek.add("Monday");
		daysOfWeek.add("Tuesday");
		daysOfWeek.add("Wednesday");
		daysOfWeek.add("Thursday");
		daysOfWeek.add("Friday");
		daysOfWeek.add("Saturday");
		daysOfWeek.add("Sunday");
		
		String dayOfWeek = (String)daysOfWeek.get(dw - 1);
		
		System.out.printf("American Format: \n%s, %s %d, %d \n", dayOfWeek, month, dd, yy);
		System.out.printf("European Format: \n%s %d %s, %d \n", dayOfWeek, dd, month, yy);
		
		System.out.printf("\n0 for American Format\n1 for European Format\n");
		
		int userInput = reader.nextInt();
		
		if (userInput == 0){
			System.out.printf("American Format: \n%s, %s %d, %d \n", dayOfWeek, month, dd, yy);
		}
		else if (userInput == 1){
			System.out.printf("European Format: \n%s %d %s, %d \n", dayOfWeek, dd, month, yy);
		}
		reader.close();
	}

}
