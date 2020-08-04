package school;

import java.util.ArrayList;

import utils.Define;

public class Subject {
	private String subjectName; //과목이름
	private int subjectID;		//과목 번호
	private int gradeType;		//학점 평가정책
	//학생 리스트(과목을 신청한)
	private ArrayList<Student> studentList = new ArrayList<>();
	
	//생성자
	public Subject(String subjectName, int subjectID) {
		super();
		this.subjectName = subjectName;
		this.subjectID = subjectID;
		this.gradeType = Define.AB_TYPE; //일반과목 
	}
	//getter&setter 자동 생성
	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSubjectID() {
		return subjectID;
	}

	public void setSubjectID(int subjectID) {
		this.subjectID = subjectID;
	}

	public int getGradeType() {
		return gradeType;
	}

	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	//학생 리스트에 학생을 추가한다.
	public void register(Student s) {
		studentList.add(s);
		
	}
	
}
