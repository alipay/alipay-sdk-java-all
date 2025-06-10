package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.unitedpids.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-27 20:52:04
 */
public class AlipayCommerceYuntaskUnitedpidsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1814781391241846133L;

	/** 
	 * 返回该unitedId关联的pid列表
	 */
	@ApiListField("pid_list")
	@ApiField("string")
	private List<String> pidList;

	public void setPidList(List<String> pidList) {
		this.pidList = pidList;
	}
	public List<String> getPidList( ) {
		return this.pidList;
	}

}
