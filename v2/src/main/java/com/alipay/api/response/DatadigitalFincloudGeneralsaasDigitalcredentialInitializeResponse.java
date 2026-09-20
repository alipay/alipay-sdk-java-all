package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.digitalcredential.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-07 17:12:52
 */
public class DatadigitalFincloudGeneralsaasDigitalcredentialInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 6837947279764544167L;

	/** 
	 * query_status 为 SUCCESS 时返回的数字凭证单据号，请妥善保存，后续使用该值查询加密 VP。
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
