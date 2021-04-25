package guanli;
public class Student {
	private int ID;
	private String name,birDate;
	private Boolean gender;
	private int grade;
	private int banji;
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID=ID;
	}//ID
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}//name
	public String getBirDate() {
		return birDate;
	}
	public void setBirDate(String birDate) {
		this.birDate=birDate;
	}//birDate
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade=grade;
	}//grade
	public int getBanji() {
		return banji;
	}
	public void setBanji(int banji) {
		this.banji=banji;
	}//banji
	public Boolean getGender() {
		return gender;
	}
	public void setGender(Boolean gender) {
		this.gender=gender;
	}//gender
	public Student () {
		super();
		}
	public Student (int ID,String name,String birDate,int grade,int banji,Boolean gender) {
		super();
		this.ID=ID;this.name=name;this.birDate=birDate;this.grade=grade;this.banji=banji;this.gender=gender;
	}
	
	
}
