package Report;

import java.util.ArrayList;

import grade.BasicEvaluation;
import grade.GradeEvaluation;
import grade.MajorEvaluation;
import grade.PassFailEvaluation;
import school.School;
import school.Score;
import school.Student;
import school.Subject;
import utils.Define;

public class GenerateGradeReport {
	School school = School.getInstance();
	public static final String TITLE = "수강생 학점 \t\t\n";
	public static final String HEADER = "이름    |  학번   |   필수과목    |  점수  |\n";
	public static final String LINE = "------------------------\n";
	private StringBuffer buffer = new StringBuffer();
	
	public String getReport() { //과목별 리포트 출력
		ArrayList<Subject> subjectList = school.getSubjectList();
		
		for(Subject sb : subjectList) {
			makeeHeader(sb);
			makeBody(sb);
			makeFooter();
		}
		return buffer.toString();
	}

	private void makeFooter() {
		buffer.append("\n");		
	}

	private void makeBody(Subject sb) {
		ArrayList<Student> studentList = sb.getStudentList();
		
		for(int i = 0; i <studentList.size(); i++) {
			Student st = studentList.get(i);
			buffer.append(st.getStudentName()); //이름
			buffer.append(" | ");
			buffer.append(st.getStudentID()); //아이디
			buffer.append(" | ");
			buffer.append(st.getMajor().getSubjectName()+"\t"); //과목 이름
			buffer.append(" | ");
			
			getScoreGrade(st, sb.getSubjectID()); //과목 점수와 등급
			
			buffer.append("\n");
			buffer.append(LINE);
		}	
		
	}
	private void getScoreGrade(Student st, int subjectID) {
		ArrayList<Score> scoreList = st.getScoreList();
		int majorID = st.getMajor().getSubjectID();

		GradeEvaluation[] gradeEvaluation = { new BasicEvaluation(),
				new MajorEvaluation(), new PassFailEvaluation()}; //학점평가 클래스
		
		for(int i=0; i<scoreList.size(); i++) {
			Score score = scoreList.get(i);
			if(score.getSubject().getSubjectID() == subjectID) {
				String grade;
				if(score.getSubject().getGradeType() == Define.PF_TYPE) {
					grade = gradeEvaluation[Define.PF_TYPE].getGrade(score.getPoint());
				} else {
				if(score.getSubject().getSubjectID() == majorID) {
					grade = gradeEvaluation[Define.SAB_TYPE].getGrade(score.getPoint());
				} else {
					grade = gradeEvaluation[Define.AB_TYPE].getGrade(score.getPoint());
				}
				}
				
				buffer.append(score.getPoint());
				buffer.append(":");
				buffer.append(grade);
				buffer.append("|");
			}
		}
		
	}

	private void makeeHeader(Subject sb) {
		buffer.append(GenerateGradeReport.LINE);
		buffer.append("\t"+sb.getSubjectName());
		buffer.append(GenerateGradeReport.TITLE);
		buffer.append(GenerateGradeReport.HEADER);
		buffer.append(GenerateGradeReport.LINE);
	}
}
