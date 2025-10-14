package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.mobilethreemeta.detail.check response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-13 11:02:22
 */
public class DatadigitalFincloudGeneralsaasMobilethreemetaDetailCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 2121937163586713397L;

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
	 * 手机号对应的运营商名称
	 */
	@ApiField("isp")
	private String isp;

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

	public void setIsp(String isp) {
		this.isp = isp;
	}
	public String getIsp( ) {
		return this.isp;
	}

	public void setMatch(String match) {
		this.match = match;
	}
	public String getMatch( ) {
		return this.match;
	}

}
