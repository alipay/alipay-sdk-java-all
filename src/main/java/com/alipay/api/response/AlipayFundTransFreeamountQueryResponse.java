package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.freeamount.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-05 00:13:48
 */
public class AlipayFundTransFreeamountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5449616428521469264L;

	/** 
	 * 剩余金额
	 */
	@ApiField("remain_free_amount")
	private String remainFreeAmount;

	/** 
	 * 成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setRemainFreeAmount(String remainFreeAmount) {
		this.remainFreeAmount = remainFreeAmount;
	}
	public String getRemainFreeAmount( ) {
		return this.remainFreeAmount;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
