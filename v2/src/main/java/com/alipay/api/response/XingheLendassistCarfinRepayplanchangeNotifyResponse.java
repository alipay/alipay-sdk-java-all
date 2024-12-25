package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: xinghe.lendassist.carfin.repayplanchange.notify response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-25 18:02:03
 */
public class XingheLendassistCarfinRepayplanchangeNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8634237138337742248L;

	/** 
	 * 还款计划更新信息
	 */
	@ApiField("repayplan_content")
	private String repayplanContent;

	public void setRepayplanContent(String repayplanContent) {
		this.repayplanContent = repayplanContent;
	}
	public String getRepayplanContent( ) {
		return this.repayplanContent;
	}

}
