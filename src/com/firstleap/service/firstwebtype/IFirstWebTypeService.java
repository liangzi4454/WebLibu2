package com.firstleap.service.firstwebtype;

import java.util.List;

import com.firstleap.common.pagination.Pagination;
import com.firstleap.common.service.BaseService;
import com.firstleap.entity.po.FirstWebType;

/**
 * @author zsc
 * 
 */
public interface IFirstWebTypeService extends BaseService {
	/**
	 * @param id
	 * @return
	 */
	FirstWebType getByid(String id);

	/**
	 * @param pageNo
	 * @return 分页
	 */
	public Pagination findAllOrQuery(int pageNo, FirstWebType firstWebType);

	public Pagination findAllOrQueryi(int pageNo, FirstWebType firstWebType);

	List<FirstWebType> listFirstWebType(String hosid);
}