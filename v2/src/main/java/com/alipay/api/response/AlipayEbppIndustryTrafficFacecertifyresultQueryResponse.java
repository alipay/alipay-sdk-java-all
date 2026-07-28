package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.traffic.facecertifyresult.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-28 10:32:55
 */
public class AlipayEbppIndustryTrafficFacecertifyresultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6134318197154235476L;

	/** 
	 * 扫脸校验是否通过。true:通过， false:未通过
	 */
	@ApiField("verified")
	private Boolean verified;

	/** 
	 * 扫脸结果校验id
	 */
	@ApiField("zim_id")
	private String zimId;

	public void setVerified(Boolean verified) {
		this.verified = verified;
	}
	public Boolean getVerified( ) {
		return this.verified;
	}

	public void setZimId(String zimId) {
		this.zimId = zimId;
	}
	public String getZimId( ) {
		return this.zimId;
	}

}
