package school;

import java.util.ArrayList;

public class Student {
	private int studentID; //학번
	private String studentName; //이름
	private Subject major; //전공과목
	//과목 점수들(학생이 신청한 과목의)
	private ArrayList<Score> scoreList = new ArrayList<>();
	//생성자
	public Student(int studentID, String studentName, Subject major) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.major = major;
	}
	//getter&setter 자동 생성
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public ArrayList<Score> getScoreList() {
		return scoreList;
	}
	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
	}	
	
	public Subject getMajor() {
		return major;
	}
	public void setMajor(Subject major) {
		this.major = major;
	}
	//점수를 추가하는 매소드
	public void addSubjectScore(Score s) {
		scoreList.add(s);
	}

}
