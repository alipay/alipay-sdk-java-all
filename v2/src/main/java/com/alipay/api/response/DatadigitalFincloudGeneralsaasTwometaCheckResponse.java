package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.twometa.check response.
 * 
 * @author auto create
 * @since 1.0, 2024-02-26 17:01:58
 */
public class DatadigitalFincloudGeneralsaasTwometaCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 8411448359684311293L;

	/** 
	 * 认证单据号，用于认证问题排查
	 */
	@ApiField("certify_id")
	private String certifyId;

	/** 
	 * 二要素是否匹配成功
	 */
	@ApiField("match")
	private String match;

	public void setCertifyId(String certifyId) {
		this.certifyId = certifyId;
	}
	public String getCertifyId( ) {
		return this.certifyId;
	}

	public void setMatch(String match) {
		this.match = match;
	}
	public String getMatch( ) {
		return this.match;
	}

}
