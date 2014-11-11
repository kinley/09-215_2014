package apa;
import java.util.*;
public class Person {
	private String fname;
	private String sname;
	private String gender;
	private int year_of_Birth;
	private int number_of_children;
	
	//�����������
	public Person (String fname, String sname, String gender, int year_of_Birth, int number_of_children)
	{
        this.fname=fname;
        this.sname=sname;
        this.gender=gender;
        this.year_of_Birth=year_of_Birth;
        this.number_of_children=number_of_children;
	   }
	// ������ �����������
	public Person() {}
	//������������
	//�������� �������
	public void change_sname(String sname)
	{
		this.sname=sname;
	}
	//�������� ���-�� ����� �� �������� �������
	public int add_number_of_children(int add)
	{
		return add+getNumber_of_children();
	}
	//���������
	//�������� ���-�� �����
	public int getNumber_of_children()
	{
		return this.number_of_children;
	}
	public void setNumber_of_children(int a)
	{
		this.number_of_children=a;
	}
	//��������� �� ���������������
	public int getYear_of_Birth()
	{
		return this.year_of_Birth;
	}
	public boolean age_verification(int year)
	{
		if(year-getYear_of_Birth()>=16)
			return true;
		else
			return false;
	}
	
	//����������
	// ������ ������ �� ���������� ��������
	public Person create_child (String fname, String gender, int year_of_Birth)
	{
		Person child = new Person();
		child.fname = fname;
		child.sname = this.sname; // ���� ������� ��������
		child.gender = gender;
		child.year_of_Birth = year_of_Birth;
		child.number_of_children = 0;
		this.number_of_children = this.number_of_children + 1;// ����������� ���-�� ����� � �������� �� 1
		return child;
	}
	//������� �������
	public String toString() {
		return this.fname + " " + this.sname + " " + this.gender + " "
		+ this.year_of_Birth + " " + this.number_of_children;
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person parent = new Person ("Ramzia", "Hasanchina", "�", 1963, 1);
		System.out.println(parent);
		System.out.println("Vvedite god");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(parent.age_verification(year))
		{
			System.out.println("Vvedite familiu");
			Scanner sc1 = new Scanner(System.in);
			String sname=sc1.nextLine();
			parent.change_sname(sname);
			sc.close();
			sc1.close();
		}
		else
			System.out.println("�� ������ ��������������!");
		System.out.println(parent);
		Person child = parent.create_child("Zarina", "�", 1994);
		System.out.println(child);
		System.out.println(parent);
		Person parent1 = new Person ("Albina", "Hamidullina", "�", 1965, parent.getNumber_of_children());
		System.out.println(parent1);
		parent.setNumber_of_children(0);
		System.out.println(parent);
	}
}
