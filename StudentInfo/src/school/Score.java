package school;

public class Score {
	private int studentID; 	//학번
	private Subject subject; //과목
	private int point; 		//점수
	//생성자
	
	public Score(int studentID, Subject subject, int point) {
		super();
		this.studentID = studentID;
		this.subject = subject;
		this.point = point;
	}
	//getter&setter 자동 생성

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	//toString 메소드
	@Override
	public String toString() {
		return "학번: " + studentID + "," + subject.getSubjectName() + ":" + point;
	}
}
