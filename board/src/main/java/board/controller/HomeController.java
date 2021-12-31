package board.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/")
	public ModelAndView time() {
		ModelAndView mav = new ModelAndView("home");
		Date now = new Date();
		mav.addObject("serverTime", now);
		return mav;
	}
}
