package cn.cqy_020.cao;
/**
 * 泛型擦除：
 * 		(1)在使用时不指定具体类型;
 * 		(2)子类继承、实现声明时不指定数据类型。
 * 此时，参数类型统一当成Object对待：
 * 		(1)编译器警告;
 * 		(2)虽然当作Object看待,但是不完全等同于Object,编译时不会类型检查。
 * @author MRSC
 *
 */
public class Test_04_GenericWrapped {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Student stu01 = new Student ();
		Student<Object> stu02 = new Student<Object>();	//	注：加上<Object> 可消除编译器警告。
		
		stu02.setJavaseScore("A+");		//	注：当作Object类型看待。
		 
		test01(stu01);
		test01(stu02);

		test02(stu01);
		test02(stu02);
		
		test03(stu01);		
		//test03(stu02);		//	注：stu02相当于Object类型的参数，但是不等同于Object类型的参数。故,无法当作函数参数传入。-----	擦除不会类型检查。
	}
	
	public static void test01(Student<Object> a) {		//	注：这里可以使用static , 因为指定了具体类型。
		
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

