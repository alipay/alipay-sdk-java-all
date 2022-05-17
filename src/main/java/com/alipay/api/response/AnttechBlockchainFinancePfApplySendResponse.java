package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.pf.apply.send response.
 * 
 * @author auto create
 * @since 1.0, 2020-09-14 19:55:36
 */
public class AnttechBlockchainFinancePfApplySendResponse extends AlipayResponse {

	private static final long serialVersionUID = 8344112225343278551L;

	/** 
	 * 支用标识
	 */
	@ApiField("financing_id")
	private String financingId;

	/** 
	 * passed
	 */
	@ApiField("msg")
	private String msg;

	/** 
	 * 平台标识
	 */
	@ApiField("platform_id")
	private String platformId;

	public void setFinancingId(String financingId) {
		this.financingId = financingId;
	}
	public String getFinancingId( ) {
		return this.financingId;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}
	public String getPlatformId( ) {
		return this.platformId;
	}

}
