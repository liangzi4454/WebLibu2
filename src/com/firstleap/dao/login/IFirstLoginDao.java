package com.firstleap.dao.login;

import java.util.List;

import com.firstleap.common.hibernate.BaseDao;
import com.firstleap.entity.po.FirstLogin;

/**
 * dao��
 * 
 * ��¼
 * 
 * @author ������
 * 
 * @param <T>
 */
public interface IFirstLoginDao extends BaseDao<FirstLogin> {
	/**
	 * ��¼��ҳ��
	 * 
	 * */
	 List<FirstLogin> findUser(FirstLogin ltakLogin);
	
		/**
		 * ����û�ҳ��
		 * 
		 * */
		 List<FirstLogin> checkUser(FirstLogin ltakLogin);
	
	
}
