package cn.cqy_020.cao;
/**
 * ���Ͳ�����
 * 		(1)��ʹ��ʱ��ָ����������;
 * 		(2)����̳С�ʵ������ʱ��ָ���������͡�
 * ��ʱ����������ͳһ����Object�Դ���
 * 		(1)����������;
 * 		(2)��Ȼ����Object����,���ǲ���ȫ��ͬ��Object,����ʱ�������ͼ�顣
 * @author MRSC
 *
 */
public class Test_04_GenericWrapped {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Student stu01 = new Student ();
		Student<Object> stu02 = new Student<Object>();	//	ע������<Object> ���������������档
		
		stu02.setJavaseScore("A+");		//	ע������Object���Ϳ�����
		 
		test01(stu01);
		test01(stu02);

		test02(stu01);
		test02(stu02);
		
		test03(stu01);		
		//test03(stu02);		//	ע��stu02�൱��Object���͵Ĳ��������ǲ���ͬ��Object���͵Ĳ�������,�޷����������������롣-----	�����������ͼ�顣
	}
	
	public static void test01(Student<Object> a) {		//	ע���������ʹ��static , ��Ϊָ���˾������͡�
		
	}
	
	public static void test02(Student<?> a) {
		
	}
	
	public static void test03(Student<Integer> a) {
		
	}
}

class Student<T>{
	private T javaseScore;
	private T oracleScore;
		
	public Student(){
		
	}
	
	public Student(T javaseScore, T oracleScore) {
		super();
		this.javaseScore = javaseScore;
		this.oracleScore = oracleScore;
	}
	
	public T getJavaseScore() {
		return javaseScore;
	}
	public void setJavaseScore(T javaseScore) {
		this.javaseScore = javaseScore;
	}
	public T getOracleScore() {
		return oracleScore;
	}
	public void setOracleScore(T oracleScore) {
		this.oracleScore = oracleScore;
	}
}

