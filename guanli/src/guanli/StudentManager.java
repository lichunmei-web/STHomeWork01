package guanli;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
public class StudentManager {
	//(1)public void stumapp(ArrayList<Student> array) {
	/**(8)
	 * @Title��stumApp
	 * @Description : This method implements a circular menu function that allows you
	 *  to select different operations for student information
	 * @param array
	 * @return void
	 */
	public void stumApp(ArrayList<Student> array) {
		int choose =0;
		while(choose!=6) {
			System.out.println("��ѡ�������");
			System.out.println("****************************************");
			System.out.println("*              1 ����                               * ");
			System.out.println("*              2 ����                               * ");
			System.out.println("*              3 ɾ��                               * ");
			System.out.println("*              4 �޸�                               * ");
			System.out.println("*              5 ���                               * ");
			System.out.println("*              6 �˳�                               * ");
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
	}//����
	//(13)
	
	/**(8)
	 * @Title��insertStudent
	 * @Description : This method realizes the insertion function of student information
	 * @param array
	 * @return void
	 */
	public static void insertStudent(ArrayList<Student> array) {
		@SuppressWarnings("resource")
		Scanner sa=new Scanner(System.in);
		System.out.println("������ѧ��ID");
		int ID = sa.nextInt();
		System.out.println("������ѧ���༶");
		int banji = sa.nextInt();
		System.out.println("������ѧ���ɼ�");
		int grade = sa.nextInt();
		System.out.println("������ѧ��������");
		String name =sa.nextLine();
		System.out.println("������ѧ�����գ�");
		String birDate=sa.nextLine();
		System.out.println("������ѧ���Ա�");
		Boolean gender =sa.hasNext();
		/*(1)Student s = new Student();//����ѧ�����󣬰Ѽ���¼�븳ֵ
		s.setName(name);
		s.setBirDate(birDate);
		s.setID(ID);
		s.setGender(gender);
		s.setBanji(banji);
		s.setGrade(grade);
		array.add(s);//��ѧ��������ӵ�����
		*/
		Student student = new Student();//����ѧ�����󣬰Ѽ���¼�븳ֵ
		student.setName(name);
		student.setBirDate(birDate);
		student.setID(ID);
		student.setGender(gender);
		student.setBanji(banji);
		student.setGrade(grade);
		array.add(student);//��ѧ��������ӵ�����
		Collections.sort(array,new Comparator<Student>() {
			@Override
			public int compare(Student o1,Student o2) {
				Integer i1=o1.getID();
				Integer i2=o2.getID();
				return i1.compareTo(i2);
			}
		});
		System.out.println("���ѧ���ɹ�");
	}//����
	//(13)
	
	/**(8)
	 * @Title��findStudent
	 * @Description : This method realizes the adding function of student information
	 * @param array
	 * @return void
	 */
	public void findStudent(ArrayList<Student>array) {
		if(array.size()==0) {
			System.out.println("����Ϣ�����������Ϣ�ڲ�ѯ");
			return;
		}
		System.out.println("ѧ��\t\t\t����\t\t�Ա�\t\t����\t\t�༶\t\t�ɼ�");
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
			
	}//�鿴
	//(13)
	
	/**(8)
	 * @Title��deleteStudent
	 * @Description : This method realizes the deletion function of student information
	 * @param array
	 * @return void
	 */
	@SuppressWarnings("unlikely-arg-type")
	public void deleteStudent(ArrayList<Student>array) {
		@SuppressWarnings("resource")
		Scanner sma=new Scanner(System.in);
		System.out.println("��������Ҫɾ����ѧ����������");
		String name =sma.nextLine();
		array.remove(name);
		System.out.println("ɾ��ѧ����Ϣ�ɹ�");
	}//ɾ��
	//(13)
	
	/**(8)
	 * @Title��updateStudent
	 * @Description : This method realizes the modification function of student information
	 * @param array
	 * @return void
	 */
	public void updateStudent(ArrayList<Student>array) {
		@SuppressWarnings("resource")
		Scanner sd=new Scanner(System.in);
		System.out.println("������Ҫ�޸ĵ�ѧ������");
		String name=sd.nextLine();
		System.out.println("������ѧ�����°༶��");
		//(1)int banji=sd.nextInt();
		int banJi=sd.nextInt();
		System.out.println("������ѧ�����³ɼ���");
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
		System.out.println("�޸�ѧ����Ϣ�ɹ�");
	}//�޸�
	//(13)
	
	/**(8)
	 * @Title��shuChuStudent
	 * @Description : This method realizes the output function of student information
	 * @param array
	 * @return void
	 */
	// (1)public void shuchuStudent(ArrayList<Student>array) { 
	public void shuChuStudent(ArrayList<Student>array) {
		System.out.println(array);
			
	}//���
	//(13)
	/**(8)
	 * @Title��tuiChuStudent
	 * @Description : This method implements the ability to exit the entire system
	 * @param array
	 * @return void
	 */
	//(1)public void tuichuStudent(ArrayList<Student>array) {
	public void tuiChuStudent(ArrayList<Student>array) {
		System.out.println("ллʹ��");
		System.exit(0);
	}//�˳�
	
}



