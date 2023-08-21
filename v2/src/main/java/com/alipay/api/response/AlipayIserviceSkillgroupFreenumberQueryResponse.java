package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ListAgentAccountStatesFacadeResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.skillgroup.freenumber.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-03 21:01:53
 */
public class AlipayIserviceSkillgroupFreenumberQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3623212278917715298L;

	/** 
	 * 返回体
	 */
	@ApiField("value")
	private ListAgentAccountStatesFacadeResponse value;

	public void setValue(ListAgentAccountStatesFacadeResponse value) {
		this.value = value;
	}
	public ListAgentAccountStatesFacadeResponse getValue( ) {
		return this.value;
	}

}
