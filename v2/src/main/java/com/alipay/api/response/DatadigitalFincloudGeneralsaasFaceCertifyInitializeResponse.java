package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.face.certify.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 03:56:54
 */
public class DatadigitalFincloudGeneralsaasFaceCertifyInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 5216441242984331975L;

	/** 
	 * 本次申请操作的唯一标识，商户需要记录，后续的操作都需要用到
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
