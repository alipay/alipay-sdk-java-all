package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.business.relation.product.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-04 13:42:53
 */
public class AlipayBusinessRelationProductApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8353134736635179881L;

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
