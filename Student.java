package UserAccounts;

public class Student extends User {
	private String Course;
	private int year, semester;

	public Student(String FirstName, String Surname, String email, String userName,String password, String Course, int year, int semester) {
		super(FirstName, Surname, email, userName, password);
		this.setYear(year);
		this.setSemester(semester);
		this.setCourse(Course);
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}
	
	


}
