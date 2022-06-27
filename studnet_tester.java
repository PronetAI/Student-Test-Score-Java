package vihaan;

public class studnet_tester {
	public static void main(String args[]) {
		student s1 = new student();
		s1.getDetails("Vihaan", 13, 'M', 89.4);
		s1.displayDetails();
		student s2 = new student("Pranav", 13, 'M', 85.67);
		s2.displayDetails();
	}
}
