package cn.zhy.stumanage.bean;

import java.util.HashMap;

public class Student {
	private String student_Name;	//姓名
	private String student_ID;	//学号
	private String sex;	//性别
	private String classe;	//班级
	private String grade;	//年级
	public HashMap<String, String> getScores() {
		return scores;
	}
	public void setScores(HashMap<String, String> scores) {
		this.scores = scores;
	}
	private String Major_ID;	//专业编号
	private String Department_ID;	//院系编号
	private String Major_Name;	//院系名称
	private String Department_Name;//专业名称
	private HashMap<String, String> scores;	//成绩
	public String getMajor_Name() {
		return Major_Name;
	}
	public void setMajor_Name(String major_Name) {
		Major_Name = major_Name;
	}
	public String getDepartment_Name() {
		return Department_Name;
	}
	public void setDepartment_Name(String department_Name) {
		Department_Name = department_Name;
	}
	public String getStudent_Name() {
		return student_Name;
	}
	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}
	public String getStudent_ID() {
		return student_ID;
	}
	public void setStudent_ID(String student_ID) {
		this.student_ID = student_ID;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getMajor_ID() {
		return Major_ID;
	}
	public void setMajor_ID(String major_ID) {
		Major_ID = major_ID;
	}
	public String getDepartment_ID() {
		return Department_ID;
	}
	public void setDepartment_ID(String department_ID) {
		Department_ID = department_ID;
	}
	
	
	
}
