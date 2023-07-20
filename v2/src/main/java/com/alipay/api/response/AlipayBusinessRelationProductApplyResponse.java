package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.business.relation.product.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 04:45:27
 */
public class AlipayBusinessRelationProductApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5819628451233373247L;

	/** 
	 * 业务流水编号
	 */
	@ApiField("biz_no")
	private String bizNo;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

}
