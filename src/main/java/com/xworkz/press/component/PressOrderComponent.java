package com.xworkz.press.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.press.dto.PressOrderDTO;
import com.xworkz.press.service.PressOrderService;

@Component
@RequestMapping("/")
public class PressOrderComponent {

	@Autowired
	private PressOrderService pressOrderService;

	public PressOrderComponent() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	// @RequestMapping(value="/order.do",method = RequestMethod.POST)
	@PostMapping("/order.do")
	public String onOrder(PressOrderDTO dto, Model model) {
		System.out.println("invoked onOrder" + dto);

		boolean saved = this.pressOrderService.validateAndSave(dto);

		if (saved) {
			System.out.println("data saved successfully, will navigate to order success ");
			model.addAttribute("message", "Order success !!");
			model.addAttribute("data", dto);

			return "OrderSuccess";
		} else {
			model.addAttribute("message", "Order failed !!");
			System.out.println("data not saved , will navigate to Order Page");
		}
		return "PressOrder";
	}
	
	@GetMapping("/search.do")
	public String onSearchByOrderFrom(String from,Model model)
	{
		
		PressOrderDTO dto =pressOrderService.validateAndSearchByOrderFrom(from);
		
		if(dto==null)
		{
			model.addAttribute("message", "No Records Found");
		}
		else {
		model.addAttribute("data", dto);
		}
		
		return "OrderSearch";
	}
	
	

}
