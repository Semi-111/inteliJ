package com.hyun3.domain.board;

// 장터 게시판, 학과게시판
public class BoardDTO {
	private String division; // 학과 구분
	
	private String title; // 제목
	private String content; // 내용
	private int views; // 조회수
	private String nickName;
	private String CA_date; // 생성일(학과별, 장터 게시판 작성일)
	private String fileName; // 파일 이름
	private int CO_num; // 댓글 번호
	
	private String role; // 회원레벨(관리자, 학생..)
	
	private int marketNum; // 마켓번호
	private int MB_num; // 회원번호
	private int CM_num; // 게시글 번호
	private int lessonNum; // 학과번호
	private int CT_num; // 카테고리 번호
	
	private String CT_name; // 카테고리 이름
	private String reg_date; // 학과별 게시판 댓글 등록일
	private String dateTime; // 좋아요 누른 시간
	
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getMarketNum() {
		return marketNum;
	}
	public void setMarketNum(int marketNum) {
		this.marketNum = marketNum;
	}
	public int getCT_num() {
		return CT_num;
	}
	public void setCT_num(int cT_num) {
		CT_num = cT_num;
	}
	public String getCT_name() {
		return CT_name;
	}
	public void setCT_name(String cT_name) {
		CT_name = cT_name;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	public int getCO_num() {
		return CO_num;
	}
	public void setCO_num(int cO_num) {
		CO_num = cO_num;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCA_date() {
		return CA_date;
	}
	public void setCA_date(String cA_date) {
		CA_date = cA_date;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public int getMB_num() {
		return MB_num;
	}
	public void setMB_num(int mB_num) {
		MB_num = mB_num;
	}
	public int getCM_num() {
		return CM_num;
	}
	public void setCM_num(int cM_num) {
		CM_num = cM_num;
	}
	public int getLessonNum() {
		return lessonNum;
	}
	public void setLessonNum(int lessonNum) {
		this.lessonNum = lessonNum;
	}
	
}
