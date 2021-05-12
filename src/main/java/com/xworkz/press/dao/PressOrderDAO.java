package com.xworkz.press.dao;

import com.xworkz.press.dto.PressOrderDTO;

public interface PressOrderDAO {
	
	
	public void save(PressOrderDTO dto);
	
	public PressOrderDTO fetchByOrderFrom(String name);
	

}
