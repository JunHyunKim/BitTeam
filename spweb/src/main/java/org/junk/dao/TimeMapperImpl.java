package org.junk.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TimeMapperImpl implements TimeMapper {

	@Autowired
	private SqlSession session;
	
	@Override
	public String getTime() {
		// TODO Auto-generated method stub
		return session.selectOne("org.junk.dao.TimeMapper.getTime");
	}

}
