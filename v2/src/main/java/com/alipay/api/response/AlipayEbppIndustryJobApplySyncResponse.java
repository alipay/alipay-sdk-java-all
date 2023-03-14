package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.job.apply.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 02:29:35
 */
public class AlipayEbppIndustryJobApplySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4577295629765153552L;

	/** 
	 * 支付宝侧应聘信息唯一标识，正常情况下非空。
	 */
	@ApiField("apply_id")
	private String applyId;

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	public String getApplyId( ) {
		return this.applyId;
	}

}
