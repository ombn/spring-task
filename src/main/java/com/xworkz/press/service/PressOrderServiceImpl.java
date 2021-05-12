package com.xworkz.press.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.press.dao.PressOrderDAO;
import com.xworkz.press.dto.PressOrderDTO;

@Component
public class PressOrderServiceImpl implements PressOrderService {

	@Autowired
	private PressOrderDAO dao;

	public PressOrderServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	public boolean validateAndSave(PressOrderDTO dto) {

		System.out.println("invoked validateAndSave from service" + dto);
		boolean valid = false;
		if (dto != null) {
			String orderFrom = dto.getOrderFrom();

			if (orderFrom != null && orderFrom.length() > 4) {
				System.out.println("order from is valid");
				valid = true;
			} else {
				System.out.println("order from is in valid");
				valid = false;
			}

		}
		if (valid) {
			this.dao.save(dto);
		}

		return valid;
	}

	@Override
	public PressOrderDTO validateAndSearchByOrderFrom(String from) {
		return this.dao.fetchByOrderFrom(from);
	}

}
