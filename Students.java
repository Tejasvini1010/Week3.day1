package Student.info;

public class Students {
	public void getStudentInfo(int id, String studname) {
		System.out.println("The student id is " +id);
		System.out.println("The student name is " +studname);
	}
	public void getStudentInfo(int id) {
		System.out.println("The student id is " +id);
	}
	public void getStudentInfo(String email, long phNumber) {
		System.out.println("The student email id is " +email);
		System.out.println("The student phone no. is " +phNumber);
	}
	public static void main(String[] args) {
		Students obj = new Students();
		obj.getStudentInfo(51808313);
		obj.getStudentInfo(51808313, "Tejasvini");
		obj.getStudentInfo("tejasvini1010@gmail.com", 9003214295l);
	}

}
