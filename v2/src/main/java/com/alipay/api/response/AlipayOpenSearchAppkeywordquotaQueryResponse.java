package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.appkeywordquota.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-27 14:46:46
 */
public class AlipayOpenSearchAppkeywordquotaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4448496821467258812L;

	/** 
	 * 剩余可配置额度数量，返回具体数字
	 */
	@ApiField("quota_num")
	private String quotaNum;

	public void setQuotaNum(String quotaNum) {
		this.quotaNum = quotaNum;
	}
	public String getQuotaNum( ) {
		return this.quotaNum;
	}

}
