package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.job.applyinfo.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-18 11:51:46
 */
public class AlipayEbppIndustryJobApplyinfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8317933119358945795L;

	/** 
	 * 支付宝就业应聘id
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
