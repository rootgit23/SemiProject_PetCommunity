package com.pet.home.sell;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellItemService {
	@Autowired
	private SellItemDAO sellItemDAO;
	
	public int setItemAdd(SellItemDTO sellItemDTO) throws Exception{
		String s = sellItemDTO.getItemEndDate();
		sellItemDTO.setItemEndDate(s.replace("-", ""));
		System.out.println(sellItemDTO.getItemEndDate());
		return sellItemDAO.setItemAdd(sellItemDTO);
	}
}
