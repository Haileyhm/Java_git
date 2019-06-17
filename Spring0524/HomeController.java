package com.haileyhm.spring0524;

import java.sql.SQLException;
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
		return "input";
	}
	
		
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Locale locale, Model model) {
		DataReader dataReader = new DataReader("c:\\tomcat_JavaLec\\students.sqlite", "students");
		dataReader.open();
		try {
			model.addAttribute("list_results", dataReader.selectData());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dataReader.close();
		return "list"; //list_results 변수에 조회한 기록을 html 테이블구조 명령어에 담아 list 파일을 열어
	}
	
	@RequestMapping(value = "/create_table", method = RequestMethod.GET)
	public String createTable(Locale locale, Model model) {
		DataReader dataReader = new DataReader("c:\\tomcat_JavaLec\\students.sqlite", "students"); //원하는 위치에 임의로 만들어서 사용 
		dataReader.open();
		try {
			dataReader.createTable();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dataReader.close();
		return "done";
	}
	
	
	@RequestMapping(value = "/input_data", method = RequestMethod.GET)
	public String inputData(@RequestParam("name") String name, 
			@RequestParam("middle_score") String middleScore,  //숫자를 문자로 잘못 입력할 수 있으니 처음에 문자로 변환해서 받아 
			@RequestParam("final_score") String finalScore) {
		DataReader dataReader = new DataReader("c:\\tomcat_JavaLec\\students.sqlite", "students"); //"경로명","DB명"
		dataReader.open();
		try {
			//아래 애를 입력하면 try - catch 해야한다고 자동으로 떠
			dataReader.insertData(name, Integer.parseInt(middleScore), Integer.parseInt(finalScore));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		dataReader.close();
		return "done";
	}
	
	
	
	
}
