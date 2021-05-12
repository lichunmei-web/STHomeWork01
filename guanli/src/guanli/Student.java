package guanli;
public class Student {
	private int ID;
	//£¨10£©private String name,birDate;
	private String name;
	private String birDate;
	private Boolean gender;
	private int grade;
	//(1)private int banji;
	private int banJi;
	/**(8)
	 * @Title£ºgetID
	 * @Description : This method realizes the student ID acquisition
	 * @param @return
	 * @return int
	 */
	public int getID() {
		return ID;
	}
	//(13£©
	
	/**(8)
	 * @Title£ºsetID
	 * @Description :This method realizes the storage of student ID
	 * @param @param ID
	 * @return void
	 */
	public void setID(int ID) {
		this.ID=ID;
	}//ID
	//(13)
	
	/**(8)
	 * @Title£ºgetName
	 * @Description : This method realizes the student name acquisition 
	 * @param @return
	 * @return String
	 */
	public String getName() {
		return name;
	}
	//£¨13£©
	
	/**£¨8£©
	 * @Title£ºsetName
	 * @Description :This method realizes the storage of student name 
	 * @param @param name
	 * @return void
	 */
	public void setName(String name) {
		this.name=name;
	}//name
	//£¨13£©
	
	/**£¨8£©
	 * @Title£ºgetBirDate
	 * @Description : This method realizes the student's date of birth  acquisition
	 * @param @return
	 * @return String
	 */
	public String getBirDate() {
		return birDate;
	}
	//(13)
	
	/**(8)
	 * @Title£ºsetBirDate
	 * @Description : This method realizes the acquisition of the information of the student's date of birth 
	 * @param @param birDate
	 * @return void
	 */
	public void setBirDate(String birDate) {
		this.birDate=birDate;
	}//birDate
	//(13)
	
	/**(8)
	 * @Title£ºgetGrade
	 * @Description : This method realizes the student grade acquisition
	 * @param @return
	 * @return int
	 */
	public int getGrade() {
		return grade;
	}
	//(13)
	
	/**(8)
	 * @Title£ºsetGrade
	 * @Description : This method realizes the storage of student grade
	 * @param @param grade
	 * @return void
	 */
	public void setGrade(int grade) {
		this.grade=grade;
	}//grade
	//(13)
	
	/**(8)
	 * @Title£ºgetBanji
	 * @Description : This method realizes the acquisition of the information of the student's class
	 * @param @return
	 * @return int
	 */
	public int getBanji() {
		return banJi;
	}//(13)
	
	/**
	 * @Title£ºsetBanji
	 * @Description : This method realizes the storage of the information of the student's class
	 * @param @param banJi
	 * @return void
	 */
	public void setBanji(int banJi) {
		this.banJi=banJi;
	}//banJi
	//(13)
	
	/**(8)
	 * @Title£ºgetGender
	 * @Description : This method realizes the acquistion of students'senior information
	 * @param @return
	 * @return Boolean
	 */
	public Boolean getGender() {
		return gender;
	}
	//(13)
	
	/**(8)
	 * @Title£ºsetGender
	 * @Description : This method realizes the storage of students'senior information
	 * @param @param gender
	 * @return void
	 */
	void setGender(Boolean gender) {
		this.gender=gender;
	}//gender
	//(13)
	
	public Student () {
		super();
		}
	public Student (int ID,String name,String birDate,int grade,int banJi,Boolean gender) {
		super();
		//(21)this.ID=ID;this.name=name;this.birDate=birDate;this.grade=grade;this.banJi=banJi;this.gender=gender;
		this.ID=ID;
		this.name=name;
		this.birDate=birDate;
		this.grade=grade;
		this.banJi=banJi;
		this.gender=gender;
	}
}
