package com.haileyhm.spring0527_2;

import java.lang.reflect.Field;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		SelectData selectData = new SelectData();
		selectData.selectStudent();
		selectData.getSeoul();
		selectData.getGyeonggi();
		model.addAttribute("select_result", selectData.getHtmlString());
		model.addAttribute("seoul_count", selectData.seoulCount);
		model.addAttribute("gyeonggi_count", selectData.gyeonggiCount); // gyeonggiCount 세서 gyeonggi_count 변수에 담아줘

		return "list";
	}

	@RequestMapping(value = "/input_student", method = RequestMethod.GET)
	public String input(Locale locale, Model model) {
		return "input_student";
	}

	@RequestMapping(value = "/input_data", method = RequestMethod.GET)
	public String inputData(@RequestParam("name") String name, @RequestParam("address") String address,
			@RequestParam("birthday") String birthday) {
		Student student = new Student(0, name, address, birthday);
		InsertData insertData = new InsertData();
		insertData.insertStudent(student);

		return "done1";
	}

	@RequestMapping(value = "/create_db", method = RequestMethod.GET)
	public String createDB(Locale locale, Model model) {
		// db 생성하는 매서드를 만들었어, 객체 생성하고 작동시켜줌

		CreateDatabase createDatabase = new CreateDatabase();
		createDatabase.createTable();
		return "done1";
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(Locale locale, Model model) {
		Student student = new Student(1, "abc", "bb", "cc");
		Class<?> dataClass = student.getClass();

		try {
			Field field = dataClass.getField("idx"); // getField 는 컬럼 안의 값을 가져오는 줄 알았는데, 아니었네
			System.out.println(field);  // System.out.println(field); 을 찍으면 위에 getField("컬럼명") 의 자료형이 찍혀
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch(SecurityException e) {
			e.printStackTrace();
		}

		return "done1"; 
	}	
	
	
	
	@RequestMapping(value = "/create_table", method = RequestMethod.GET)
	public String createTable(Locale locale, Model model) {
		// db 생성하는 매서드를 만들었어, 객체 생성하고 작동시켜줌

		DBCommon<People> dbCommon = new DBCommon<People>("c:\\tomcat_JavaLec\\people.sqlite", "people");
		return "done1";
	}
	
	@RequestMapping(value = "/input", method = RequestMethod.GET)
	public String insertTable(Locale locale, Model model) {
		// db 생성하는 매서드를 만들었어, 객체 생성하고 작동시켜줌

		DBCommon<People> dbCommon = new DBCommon<People>("c:\\tomcat_JavaLec\\people.sqlite", "people");
		return "input_student";
	}
	
	
		
		
		
		
		
		
	
//		Student student = new Student(1, "abc", "bb", "cc");
//		Class<?> dataClass = student.getClass();
//
//		try {
//			Field field = dataClass.getField("idx"); // getField 는 컬럼 안의 값을 가져오는 줄 알았는데, 아니었네
//			System.out.println(field);  // System.out.println(field); 을 찍으면 위에 getField("컬럼명") 의 자료형이 찍혀
//		} catch (NoSuchFieldException e) {
//			e.printStackTrace();
//		} catch(SecurityException e) {
//			e.printStackTrace();
//		}
//
//		return "done1"; 
//	}

}
