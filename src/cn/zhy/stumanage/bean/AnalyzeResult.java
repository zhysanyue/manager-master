package cn.zhy.stumanage.bean;
//分析结果类
public class AnalyzeResult {
	private String studentId;	//学号
	private String studentName;	//姓名
	private String sumScore;	//总成绩
	private String avgScore;	//平均成绩
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getSumScore() {
		return sumScore;
	}
	public void setSumScore(String sumScore) {
		this.sumScore = sumScore;
	}
	public String getAvgScore() {
		return avgScore;
	}
	public void setAvgScore(String avgScore) {
		this.avgScore = avgScore;
	}
}
