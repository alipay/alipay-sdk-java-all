package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SportsDepartment;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.sports.depart.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-11 11:47:51
 */
public class AlipayCommerceEducateSportsDepartBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6485478993971349791L;

	/** 
	 * null
	 */
	@ApiListField("list")
	@ApiField("sports_department")
	private List<SportsDepartment> list;

	public void setList(List<SportsDepartment> list) {
		this.list = list;
	}
	public List<SportsDepartment> getList( ) {
		return this.list;
	}

}
