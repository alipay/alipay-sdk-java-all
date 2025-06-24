package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.onepass.web.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-06 17:02:03
 */
public class DatadigitalFincloudGeneralsaasOnepassWebInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 6457415335699499823L;

	/** 
	 * H5本机校验流水ID，请保留方便排查问题
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
