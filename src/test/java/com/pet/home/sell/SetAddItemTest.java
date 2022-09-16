package com.pet.home.sell;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.pet.home.MyAbstractTest;

public class SetAddItemTest extends MyAbstractTest {
	
	@Autowired
	private SellItemDAO sellItemDAO;
	
	@Test
	public void test() {
		SellItemDTO sellItemDTO = new SellItemDTO();
		sellItemDTO.setUserId("test2");
		sellItemDTO.setItemName("테스트");
		sellItemDTO.setItemPrice(10000L);
		sellItemDTO.setItemContents("테스트");
		sellItemDTO.setItemLatitude(20L);
		sellItemDTO.setItemLongtitude(20L);
		sellItemDTO.setItemCount(10L);
		sellItemDTO.setItemCatg("2");
		try {
			int result = sellItemDAO.setItemAdd(sellItemDTO);
			assertEquals(1, result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
