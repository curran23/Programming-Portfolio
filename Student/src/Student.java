import java.util.Date;
public class Student {
	
	private String universityID;
	private String firstName;
	private String middleName;
	private String lastName;
	private java.util.Date dateOfBirth;
	private String major;
	
	// Default constructor for the student object
	public Student() {
		
		universityID = "123456";
		firstName = "Michael";
		middleName = "John";
		lastName = "Smith";
		dateOfBirth = new Date(1/1/1111);
		major = "Art";
	}
	// Constructor for the student object that allows you to enter your own information
	public Student(String ID, String firstname, String middlename, String lastname,
			java.util.Date dateofbirth, String majorstudy) {
		universityID = ID;
		firstName = firstname;
		middleName = middlename;
		lastName = lastname;
		dateOfBirth = dateofbirth;
		major = majorstudy;
		}
	/** Compare two students' information and return a boolean value of true or false depending
	on the outcome of the equality test
	@param student1 the first student
	@param student2 the second student
	@return answer is the boolean value of equality on the two students
	**/
	public Student Equals(Student student1, Student student2) {
		return (student1 = student2);
		}
}
