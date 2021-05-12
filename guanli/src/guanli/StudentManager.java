package guanli;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
public class StudentManager {
	//(1)public void stumapp(ArrayList<Student> array) {
	/**(8)
	 * @Title：stumApp
	 * @Description : This method implements a circular menu function that allows you
	 *  to select different operations for student information
	 * @param array
	 * @return void
	 */
	public void stumApp(ArrayList<Student> array) {
		int choose =0;
		while(choose!=6) {
			System.out.println("请选择操作：");
			System.out.println("****************************************");
			System.out.println("*              1 插入                               * ");
			System.out.println("*              2 查找                               * ");
			System.out.println("*              3 删除                               * ");
			System.out.println("*              4 修改                               * ");
			System.out.println("*              5 输出                               * ");
			System.out.println("*              6 退出                               * ");
			System.out.println("****************************************");
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			choose = sc.nextInt();
			switch(choose) {
			case 1: 
				insertStudent(array);
			    break;
			case 2:
				findStudent(array);
				break;
			case 3:
				deleteStudent(array);
				break;
			case 4:
				updateStudent(array);
				break;
			case 5:
				shuChuStudent(array);
				break;
			case 6:
				tuiChuStudent(array);
		//(37)
			default:
			}
		}
	}//界面
	//(13)
	
	/**(8)
	 * @Title：insertStudent
	 * @Description : This method realizes the insertion function of student information
	 * @param array
	 * @return void
	 */
	public static void insertStudent(ArrayList<Student> array) {
		@SuppressWarnings("resource")
		Scanner sa=new Scanner(System.in);
		System.out.println("请输入学生ID");
		int ID = sa.nextInt();
		System.out.println("请输入学生班级");
		int banji = sa.nextInt();
		System.out.println("请输入学生成绩");
		int grade = sa.nextInt();
		System.out.println("请输入学生姓名：");
		String name =sa.nextLine();
		System.out.println("请输入学生生日：");
		String birDate=sa.nextLine();
		System.out.println("请输入学生性别");
		Boolean gender =sa.hasNext();
		/*(1)Student s = new Student();//创建学生对象，把键盘录入赋值
		s.setName(name);
		s.setBirDate(birDate);
		s.setID(ID);
		s.setGender(gender);
		s.setBanji(banji);
		s.setGrade(grade);
		array.add(s);//把学生对象添加到集合
		*/
		Student student = new Student();//创建学生对象，把键盘录入赋值
		student.setName(name);
		student.setBirDate(birDate);
		student.setID(ID);
		student.setGender(gender);
		student.setBanji(banji);
		student.setGrade(grade);
		array.add(student);//把学生对象添加到集合
		Collections.sort(array,new Comparator<Student>() {
			@Override
			public int compare(Student o1,Student o2) {
				Integer i1=o1.getID();
				Integer i2=o2.getID();
				return i1.compareTo(i2);
			}
		});
		System.out.println("添加学生成功");
	}//插入
	//(13)
	
	/**(8)
	 * @Title：findStudent
	 * @Description : This method realizes the adding function of student information
	 * @param array
	 * @return void
	 */
	public void findStudent(ArrayList<Student>array) {
		if(array.size()==0) {
			System.out.println("无信息，请先添加信息在查询");
			return;
		}
		System.out.println("学号\t\t\t姓名\t\t性别\t\t生日\t\t班级\t\t成绩");
		for(int i=0;i<array.size();i++) {
			/*Student s =array.get(i);
			System.out.println(s.getID()+"\t"+s.getName()+"\t"+s.getGender()+"\t"+s.getBirDate()+"\t"+s.getBanji()+"\t"+s.getGrade());
			*/
			Student student =array.get(i);
			//(15)System.out.println(student.getID()+"\t"+student.getName()+"\t"+student.getGender()+"\t"+student.getBirDate()+"\t"+student.getBanji()+"\t"+student.getGrade());
			System.out.println(student.getID()
					+"\t"+student.getName()+"\t"+student.getGender()
					+"\t"+student.getBirDate()+"\t"+student.getBanji()
					+"\t"+student.getGrade());
			}
			
	}//查看
	//(13)
	
	/**(8)
	 * @Title：deleteStudent
	 * @Description : This method realizes the deletion function of student information
	 * @param array
	 * @return void
	 */
	@SuppressWarnings("unlikely-arg-type")
	public void deleteStudent(ArrayList<Student>array) {
		@SuppressWarnings("resource")
		Scanner sma=new Scanner(System.in);
		System.out.println("请输入你要删除的学生的姓名：");
		String name =sma.nextLine();
		array.remove(name);
		System.out.println("删除学生信息成功");
	}//删除
	//(13)
	
	/**(8)
	 * @Title：updateStudent
	 * @Description : This method realizes the modification function of student information
	 * @param array
	 * @return void
	 */
	public void updateStudent(ArrayList<Student>array) {
		@SuppressWarnings("resource")
		Scanner sd=new Scanner(System.in);
		System.out.println("请输入要修改的学生姓名");
		String name=sd.nextLine();
		System.out.println("请输入学生的新班级：");
		//(1)int banji=sd.nextInt();
		int banJi=sd.nextInt();
		System.out.println("请输入学生的新成绩：");
		int grade=sd.nextInt();
		/*Student s = new Student();
		s.setBanji(banji);
		s.setGrade(grade);
		for(int i=0;i<=array.size();i++) {
			Student m=array.get(i);
			if(m.getName().equals(name)) {
				array.set(i,s);
			}
		}*/
		Student student = new Student();
		student.setBanji(banJi);
		student.setGrade(grade);
		for(int i=0;i<=array.size();i++) {
			Student studentOne=array.get(i);
			if(studentOne.getName().equals(name)) {
				array.set(i,student);
			}
		}
		System.out.println("修改学生信息成功");
	}//修改
	//(13)
	
	/**(8)
	 * @Title：shuChuStudent
	 * @Description : This method realizes the output function of student information
	 * @param array
	 * @return void
	 */
	// (1)public void shuchuStudent(ArrayList<Student>array) { 
	public void shuChuStudent(ArrayList<Student>array) {
		System.out.println(array);
			
	}//输出
	//(13)
	/**(8)
	 * @Title：tuiChuStudent
	 * @Description : This method implements the ability to exit the entire system
	 * @param array
	 * @return void
	 */
	//(1)public void tuichuStudent(ArrayList<Student>array) {
	public void tuiChuStudent(ArrayList<Student>array) {
		System.out.println("谢谢使用");
		System.exit(0);
	}//退出
	
}



