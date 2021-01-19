package com.rubypaper;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.rubypaper.service.BoardService;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.MOCK) //톰켓을 사용하지 않는다.
@AutoConfigureMockMvc  //@Service @Repository 객체를 모두 참조(메모리로딩)
public class BoardControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private BoardService boardService;
	
	@Test
	public void testHello() throws Exception {
		//서비스를 사용할 경우 설정 - 개발이 덜 되었을 경우 확인? 음..
		when(boardService.hello("둘리")).thenReturn("Hello : 둘리");
		//파라미터 전달 테스트
		mockMvc.perform(get("/hello").param("name","둘리"))  //get,post,put,delete
		.andExpect(status().isOk())
		.andExpect(content().string("Hello : 둘리"))
		.andDo(print());
		
	}
}