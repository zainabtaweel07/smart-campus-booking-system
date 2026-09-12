package procedularParadigm;

public class ProceduralBooking {

	// Activity Details variables
	static String titles; // it's role to store the Activity title
	static String Schedules; // it's role to store the Activity schedule
	static String locations; // it's role to store the Activity location
	static int capacity = 20; // maximum students who are allowed to register
	static int studentsCounter = 0; // tracks how many students are registered
	static String[] Names = new String[capacity]; // array to store student names (it booked 0 - 19 at the memory)

	// Method 1: Add a student to the activity
	static void addParticipant(String name) {
		if(studentsCounter>=capacity) {
			System.out.println("The Activity is FULL!!");
			return;
		}
		else {
			Names[studentsCounter]=name;
			studentsCounter++;
			System.out.println(name+" is Registered!");
			System.out.println("The total students" +studentsCounter);
		}
	}
		

		
	

	// Method 2: Remove a student from the activity
	static void removeParticipant(String name) {
		try {
			// decrease the counter to remove the registered student
			studentsCounter--;
			System.out.println(name + " is removed from Activity");
			System.out.println("Total Students who registered: " + studentsCounter);
		} catch (Exception e) {
			// if any error occurs during removal, print error message
			System.out.println("An error occurred while removing participant: ");
		}
	}

	// Method 3: Check if a student is registered
	static void isParticipantexisit(String name) {
		if (name == Names[studentsCounter]) {
			System.out.println(name + " is registered");
		} else {
			System.out.println(name + " is not registered");
		}
	}

	// Method 4: Sort and display all registered students
	static void DisplayingRegisteredParticipants() {

	for (int i = 0 ; i < studentsCounter-1; i++) {
		int minidx = i;
		for(int j = i+1;j<=studentsCounter;j++) {
			if(Names[j].compareTo(Names[minidx])<0) {
				minidx = j;
			}
		}
		
		String temp = Names[minidx];
		Names[minidx] = Names[i];
		Names[i] = temp;
	} 
		

		// Display
		System.out.println("The Participants are ");
		for (int i = 0; i < studentsCounter; i++) {
			System.out.println(Names[i]);
		}
	}

	// Method 5: Set and display activity details
	static void activityDetails(String title, String schedule, String location) {
		titles = title;
		Schedules = schedule;
		locations = location;
		System.out.printf("Title: %s | Schedule: %s | Location: %s%n", title, schedule, location);
	}

	public static void main(String[] args) {

		// add students to the activity
		addParticipant("Yamen");
		addParticipant("Zainab");
		addParticipant("Sadi");
		addParticipant("Rana");
		addParticipant("Wisam");
		addParticipant("Mirna");
		addParticipant("Saba");
		addParticipant("Sawsan");
		addParticipant("Hayat");
		addParticipant("Sara");
		addParticipant("Siwar");
		addParticipant("Lara");
		addParticipant("Lujain");
		addParticipant("Hoor");
		addParticipant("Miral");
		addParticipant("Layla");
	
		
		// remove a student from the activity
		removeParticipant("Mirna");

		// display activity details
		activityDetails("Football", "11 AM - 1PM", "SoftArea");

		// check if a student is registered
		isParticipantexisit("Muna");

		// sort and display all registered students
		DisplayingRegisteredParticipants();

	}

}
