package JCNeedsYourHelp;

public class Faculty extends Employee {
	private String subject;
	private int roomNumber;
	private int studentsPerSemester;

	public Faculty() {

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

	public Faculty(String subjectTeach, int roomNo, int howManyStudentsPerSemester, String theirName, int theirSalary, boolean doTheyHaveAMasters, int theirAge, int howManyYearsOfExperience, boolean doTheyGotHealth, boolean doTheyGotDental, boolean doTheyGotVision, boolean doTheyGotRetirement) {
		super(theirName, theirSalary, doTheyHaveAMasters, theirAge, howManyYearsOfExperience, doTheyGotHealth, doTheyGotDental, doTheyGotVision, doTheyGotRetirement);
		subject = subjectTeach;
		roomNumber = roomNo;
		studentsPerSemester = howManyStudentsPerSemester;
	}

	@Override
	public String toString() {
		return "Hey! My name is " + getName() + " and I am a teacher at The John Carroll School. I teach " + subject + " to " + studentsPerSemester + " students per semester in room " + roomNumber + ". I earn " + getSalary() + " and it is " + isMastersDegree() + " that I have a masters degree. I am " + getAge() + " years old with " + getYearsOfExperience() + " years of experience.";

	}
}
