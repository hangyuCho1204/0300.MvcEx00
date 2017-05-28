package spring.handler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AnnotationController {
	@RequestMapping(value="test03", method=RequestMethod.GET)
	public String home(Model model){
		System.out.println("�ȳ� �� test03�̾�");
		model.addAttribute("msg", "Hello!!");
		return "home";
	}
	
	@RequestMapping(value="hw", method=RequestMethod.GET)
	public String home(){
		System.out.println("�ȳ� �� hw��");
		return "home";
	}
}
