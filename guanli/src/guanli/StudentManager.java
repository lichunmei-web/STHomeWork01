package guanli;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
public class StudentManager {
	public void stumapp(ArrayList<Student> array) {
		int choose =0;
		while(choose!=6) {
			System.out.println("请选择操作：");
			System.out.println("**************************************");
			System.out.println("*              1 插入                               * ");
			System.out.println("*              2 查找                               * ");
			System.out.println("*              3 删除                               * ");
			System.out.println("*              4 修改                               * ");
			System.out.println("*              5 输出                               * ");
			System.out.println("*              6 退出                               * ");
			System.out.println("**************************************");
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
				shuchuStudent(array);
				break;
			case 6:
				tuichuStudent(array);
			
		}
			
      }
	}//界面
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
		Student s = new Student();//创建学生对象，把键盘录入赋值
		s.setName(name);
		s.setBirDate(birDate);
		s.setID(ID);
		s.setGender(gender);
		s.setBanji(banji);
		s.setGrade(grade);
		array.add(s);//把学生对象添加到集合
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
	public void findStudent(ArrayList<Student>array) {
		if(array.size()==0) {
			System.out.println("无信息，请先添加信息在查询");
			return;
		}
		System.out.println("学号\t\t\t姓名\t\t性别\t\t生日\t\t班级\t\t成绩");
		for(int i=0;i<array.size();i++) {
			Student s =array.get(i);
			System.out.println(s.getID()+"\t"+s.getName()+"\t"+s.getGender()+"\t"+s.getBirDate()+"\t"+s.getBanji()+"\t"+s.getGrade());
			}
	}//查看
	@SuppressWarnings("unlikely-arg-type")
	public void deleteStudent(ArrayList<Student>array) {
		@SuppressWarnings("resource")
		Scanner sb=new Scanner(System.in);
		System.out.println("请输入你要删除的学生的姓名：");
		String name =sb.nextLine();
		array.remove(name);
		System.out.println("删除学生信息成功");
	}//删除
	public void updateStudent(ArrayList<Student>array) {
		@SuppressWarnings("resource")
		Scanner sd=new Scanner(System.in);
		System.out.println("请输入要修改的学生姓名");
		String name=sd.nextLine();
		System.out.println("请输入学生的新班级：");
		int banji=sd.nextInt();
		System.out.println("请输入学生的新成绩：");
		int grade=sd.nextInt();
		Student s = new Student();
		s.setBanji(banji);
		s.setGrade(grade);
		for(int i=0;i<=array.size();i++) {
			Student m=array.get(i);
			if(m.getName().equals(name)) {
				array.set(i,s);
			}
		}
		System.out.println("修改学生信息成功");
	}//修改
	public void shuchuStudent(ArrayList<Student>array) {
		System.out.println(array);
			
	}//输出
	public void tuichuStudent(ArrayList<Student>array) {
		System.out.println("谢谢使用");
		System.exit(0);
	}//退出
	
}



