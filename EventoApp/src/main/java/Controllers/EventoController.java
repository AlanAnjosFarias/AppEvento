package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventoController {
		
	@RequestMapping("/evento")
	public String evento() {
		return "evento.html";
	}
	

}
