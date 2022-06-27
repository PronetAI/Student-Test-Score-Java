package vihaan;
class student{
	String name;
	int age;
	char gender;
	double sc;
	student(String sname, int a, char g, double s) {
		name=sname;
		age=a;
		gender=g;
		sc=s;
	}
	student(){}
	void getDetails(String sname, int a, char g, double s) {
		name=sname;
		age=a;
		gender=g;
		sc=s;
	}
	void displayDetails() {
		System.out.println("The students name is "+name);
		System.out.println("The students age is "+age);
		System.out.println("The student gender is "+gender);
		System.out.println("The students score is "+sc);
	}
	
}