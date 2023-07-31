package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.onelogin.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-26 09:47:02
 */
public class DatadigitalFincloudGeneralsaasOneloginInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 1576792826727512969L;

	/** 
	 * 一键登录流水ID，请保留方便排查问题
	 */
	@ApiField("certify_id")
	private String certifyId;

	public void setCertifyId(String certifyId) {
		this.certifyId = certifyId;
	}
	public String getCertifyId( ) {
		return this.certifyId;
	}

}
