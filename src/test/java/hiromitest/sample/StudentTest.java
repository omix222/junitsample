package hiromitest.sample;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.hamcrest.beans.SamePropertyValuesAs;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StudentTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void ベタにgetterを使って確認するテストケース() throws Exception {
	    // Setup
	    // Student オブジェクトに設定する属性を定義する
	    String name = "学生太郎"; // 学生の氏名
	    String studentIdNumber = "abc123456"; // 学生証番号
	    int age = 20; // 年齢

	    // Exercise
	    // Student オブジェクトを生成する
	    Student student = Student.newInstance(name, studentIdNumber, age);

	    // Verify
	    // 生成した Student オブジェクトの属性を個々に確認する
	    assertThat(student.getName(), is(name));
	    assertThat(student.getStudentIdNumber(), is(studentIdNumber));
	    assertThat(student.getAge(), is(age));
	}

	@Test
	public void SamePropertyValuesAsを使ったアサーション() throws Exception {
	    // Setup
	    // Student オブジェクトに設定する属性を定義する
	    String name = "学生太郎"; // 学生の氏名
	    String studentIdNumber = "abc123456"; // 学生証番号
	    int age = 20; // 年齢
	    // 検証用の Student オブジェクトを生成する
	    Student expected = Student.newInstance(name, studentIdNumber, age);

	    // Exercise
	    // Student オブジェクトを生成する
	    Student student = Student.newInstance(name, studentIdNumber, age);

	    // Verify
	    // org.hamcrest.beans.SamePropertyValuesAs#samePropertyValuesAs を使って生成した Student オブジェクトの属性を確認する
	    assertThat(student, is(SamePropertyValuesAs.samePropertyValuesAs(expected)));
	}
}
