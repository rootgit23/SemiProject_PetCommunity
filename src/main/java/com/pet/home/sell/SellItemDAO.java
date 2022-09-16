package com.pet.home.sell;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SellItemDAO {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.pet.home.sell.SellItemDAO.";
	
	public int setItemAdd(SellItemDTO sellItemDTO) throws Exception{
		return sqlSession.insert(NAMESPACE+"setItemAdd",sellItemDTO);
	}
}
