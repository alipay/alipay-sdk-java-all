package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.pf.apply.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 06:58:10
 */
public class AnttechBlockchainFinancePfApplySendResponse extends AlipayResponse {

	private static final long serialVersionUID = 1582857618568536553L;

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
