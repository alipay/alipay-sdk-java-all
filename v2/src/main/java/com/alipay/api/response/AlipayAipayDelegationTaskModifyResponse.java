package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.aipay.delegation.task.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-07 14:27:52
 */
public class AlipayAipayDelegationTaskModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8381596965523279381L;

	/** 
	 * 获取签名后的业务数据
	 */
	@ApiField("orderStr")
	private String orderStr;

	public void setOrderStr(String orderStr) {
		this.orderStr = orderStr;
	}
	public String getOrderStr( ) {
		return this.orderStr;
	}

}
