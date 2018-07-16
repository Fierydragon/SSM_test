package com.chen.li.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.chen.li.pojo.NextTestBean;
import com.chen.li.service.NextTestService;

@Controller
public class NextTestController {
	private static final Logger logger = LoggerFactory.getLogger(NextTestController.class);
	@Autowired
    NextTestService nextTestService;
	
	@RequestMapping(value="/nextTest", method=RequestMethod.GET)
	public String nextTest(Locale locale, Model model) {
		logger.info("Local is: {}", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		logger.info("formttedDate: " + formattedDate);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "nextTest";
	}
	
	@RequestMapping(value="/nextTest", method=RequestMethod.POST)
    public String add(NextTestBean formBean, Model model) throws Exception {
//        ModelAndView mav = new ModelAndView("home");
        logger.info("NextTestBean: {}", formBean);
        
        String message = "Form submitted successfully.  Bound " + formBean;
		// Success response handling
			// prepare model for rendering success message in this request
        logger.info("nextTestService is: {}", nextTestService);
        
//        nextTestService.hasNextTestMapper();
        nextTestService.add(formBean);
        
		model.addAttribute("message", message);
		return null;
        
//        return mav;
    }
}
