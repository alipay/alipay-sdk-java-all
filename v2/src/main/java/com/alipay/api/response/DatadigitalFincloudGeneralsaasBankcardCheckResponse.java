package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.bankcard.check response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-07 19:27:21
 */
public class DatadigitalFincloudGeneralsaasBankcardCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 1565285989764838859L;

	/** 
	 * 认证单据号，用于认证问题排查
	 */
	@ApiField("certify_id")
	private String certifyId;

	/** 
	 * 核验详情
	 */
	@ApiField("detail")
	private String detail;

	/** 
	 * 是否核验通过
	 */
	@ApiField("match")
	private String match;

	public void setCertifyId(String certifyId) {
		this.certifyId = certifyId;
	}
	public String getCertifyId( ) {
		return this.certifyId;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getDetail( ) {
		return this.detail;
	}

	public void setMatch(String match) {
		this.match = match;
	}
	public String getMatch( ) {
		return this.match;
	}

}
