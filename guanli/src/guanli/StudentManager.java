package guanli;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
public class StudentManager {
	public void stumapp(ArrayList<Student> array) {
		int choose =0;
		while(choose!=6) {
			System.out.println("��ѡ�������");
			System.out.println("**************************************");
			System.out.println("*              1 ����                               * ");
			System.out.println("*              2 ����                               * ");
			System.out.println("*              3 ɾ��                               * ");
			System.out.println("*              4 �޸�                               * ");
			System.out.println("*              5 ���                               * ");
			System.out.println("*              6 �˳�                               * ");
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
	}//����
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
		Student s = new Student();//����ѧ�����󣬰Ѽ���¼�븳ֵ
		s.setName(name);
		s.setBirDate(birDate);
		s.setID(ID);
		s.setGender(gender);
		s.setBanji(banji);
		s.setGrade(grade);
		array.add(s);//��ѧ��������ӵ�����
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
	public void findStudent(ArrayList<Student>array) {
		if(array.size()==0) {
			System.out.println("����Ϣ�����������Ϣ�ڲ�ѯ");
			return;
		}
		System.out.println("ѧ��\t\t\t����\t\t�Ա�\t\t����\t\t�༶\t\t�ɼ�");
		for(int i=0;i<array.size();i++) {
			Student s =array.get(i);
			System.out.println(s.getID()+"\t"+s.getName()+"\t"+s.getGender()+"\t"+s.getBirDate()+"\t"+s.getBanji()+"\t"+s.getGrade());
			}
	}//�鿴
	@SuppressWarnings("unlikely-arg-type")
	public void deleteStudent(ArrayList<Student>array) {
		@SuppressWarnings("resource")
		Scanner sb=new Scanner(System.in);
		System.out.println("��������Ҫɾ����ѧ����������");
		String name =sb.nextLine();
		array.remove(name);
		System.out.println("ɾ��ѧ����Ϣ�ɹ�");
	}//ɾ��
	public void updateStudent(ArrayList<Student>array) {
		@SuppressWarnings("resource")
		Scanner sd=new Scanner(System.in);
		System.out.println("������Ҫ�޸ĵ�ѧ������");
		String name=sd.nextLine();
		System.out.println("������ѧ�����°༶��");
		int banji=sd.nextInt();
		System.out.println("������ѧ�����³ɼ���");
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
		System.out.println("�޸�ѧ����Ϣ�ɹ�");
	}//�޸�
	public void shuchuStudent(ArrayList<Student>array) {
		System.out.println(array);
			
	}//���
	public void tuichuStudent(ArrayList<Student>array) {
		System.out.println("ллʹ��");
		System.exit(0);
	}//�˳�
	
}



