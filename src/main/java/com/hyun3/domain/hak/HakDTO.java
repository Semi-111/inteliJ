package com.hyun3.domain.hak;

public class HakDTO {
	private String lessonName; // 학과이름
	private String sb_Name; // 과목명
	private String pf_Name; // 교수명
	private String grade_year; // 학년
	private String semester; // 학기
	private String hakscore; // 학점(1,2,3학점)
	private String grade; // 성적(A+)
	
	private long mb_Num; // 회원번호
	private String userId; // 아이디
	private String nickName; // 닉네임
	
	private String content; // 리뷰 내용
	private String reg_date; // 리뷰 작성 날짜
	
	
	public String getLessonName() {
		return lessonName;
	}
	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}
	public String getSb_Name() {
		return sb_Name;
	}
	public void setSb_Name(String sb_Name) {
		this.sb_Name = sb_Name;
	}
	public String getPf_Name() {
		return pf_Name;
	}
	public void setPf_Name(String pf_Name) {
		this.pf_Name = pf_Name;
	}
	public String getGrade_year() {
		return grade_year;
	}
	public void setGrade_year(String grade_year) {
		this.grade_year = grade_year;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getHakscore() {
		return hakscore;
	}
	public void setHakscore(String hakscore) {
		this.hakscore = hakscore;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public long getMb_Num() {
		return mb_Num;
	}
	public void setMb_Num(long mb_Num) {
		this.mb_Num = mb_Num;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	
	
	
}
