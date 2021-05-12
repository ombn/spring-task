package com.xworkz.press.service;

import com.xworkz.press.dto.PressOrderDTO;

public interface PressOrderService {

	public boolean validateAndSave(PressOrderDTO dto);
	
	public PressOrderDTO validateAndSearchByOrderFrom(String from);

}
