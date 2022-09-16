package com.pet.home.sell;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/sell/*")
public class SellItemController {
	
	@Autowired
	private SellItemService sellItemService;
	
	@GetMapping("list")
	public ModelAndView getList() throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("sell/list");
		return mv;
	}
	
	@GetMapping("add")
	public ModelAndView setItemAdd() throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("sell/add");
		return mv;
	}
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String setItemAdd(SellItemDTO sellItemDTO) throws Exception{
		System.out.println("post실행");
		int result = sellItemService.setItemAdd(sellItemDTO);
		return "sell/list";
	}

}
