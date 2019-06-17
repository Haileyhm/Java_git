package com.haileyhm.spring0520thesecond;


import java.sql.SQLException;
import java.util.Locale;

/*****새로운 컨트롤러를 만듬
 * @Controller 어노테이션을 붙여줘야해
 * 컨트롤러들은 주소와 파일을 매칭함 => /select 라는 주소에 요청이 들어왔을 때, sqlite 파일을 읽습니다
 * */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NewController {
	
	@RequestMapping(value = "/insertGrade", method = RequestMethod.GET) //방식이 POST 면 여기를 POST 로 바꿔줘
	public String home(Locale locale, Model model) { //request 가 들어왔을 때, 어떤 작업실행할 지 결정
	DataReader dataReader = new DataReader("C:\\Users\\SMART-01\\Java\\grade.sqlite", "students");
	dataReader.open();
	
	try {
	model.addAttribute("query_result", dataReader.insertData()); 
	} catch (SQLException e) {
	e.printStackTrace();
	} catch (Exception e) { //throw new Exception("DB is not open"); 을 여기서 처리
	} finally {
	 dataReader.close(); //항상 close 시켜줘야해, 아니면 계속 사용되니깐
	}
	return "insertGrade";
	}

}
