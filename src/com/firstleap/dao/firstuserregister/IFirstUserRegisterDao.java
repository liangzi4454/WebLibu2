package com.firstleap.dao.firstuserregister;

import com.firstleap.common.hibernate.BaseDao;
import com.firstleap.common.pagination.Pagination;
import com.firstleap.entity.po.FirstUserRegister;

/**
 * dao��
 * 
 * �и�
 * 
 * @author ������
 * 
 * @param <T>
 */
public interface IFirstUserRegisterDao extends BaseDao<FirstUserRegister> {
	Pagination queryByPagination(int pageNo, int pageSize, String aid);
	
	
}
