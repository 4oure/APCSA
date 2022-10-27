package JCNeedsYourHelp;

public class Faculty extends Employee {
	String subject;
	int roomNumber;
	int studentsPerSemester;

	public Faculty(){

	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getStudentsPerSemester() {
		return studentsPerSemester;
	}

	public void setStudentsPerSemester(int studentsPerSemester) {
		this.studentsPerSemester = studentsPerSemester;
	}

	public Faculty(String subjectTeach, int roomNo, int howManyStudentsPerSemester, String theirName, int theirSalary, boolean doTheyHaveAMasters, int theirAge, int howManyYearsOfExperience){
		super(theirName, theirSalary, doTheyHaveAMasters, theirAge, howManyYearsOfExperience);
		subject = subjectTeach;
		roomNumber = roomNo;
		studentsPerSemester = howManyStudentsPerSemester;
	}
	@Override
	public String toString(){

	}
}
