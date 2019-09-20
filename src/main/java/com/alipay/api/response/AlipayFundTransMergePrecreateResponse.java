package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.merge.precreate response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-04 21:05:15
 */
public class AlipayFundTransMergePrecreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2239599612439555116L;

	/** 
	 * 合并转账单据号
	 */
	@ApiField("merge_order_id")
	private String mergeOrderId;

	public void setMergeOrderId(String mergeOrderId) {
		this.mergeOrderId = mergeOrderId;
	}
	public String getMergeOrderId( ) {
		return this.mergeOrderId;
	}

}
