package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.cert.check response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-24 10:17:55
 */
public class DatadigitalFincloudGeneralsaasCertCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 3814415867645364255L;

	/** 
	 * OCR识别单据号，计费依据，请保留以便排查问题。
	 */
	@ApiField("certify_id")
	private String certifyId;

	/** 
	 * 分类结果
	 */
	@ApiField("classify_result")
	private String classifyResult;

	public void setCertifyId(String certifyId) {
		this.certifyId = certifyId;
	}
	public String getCertifyId( ) {
		return this.certifyId;
	}

	public void setClassifyResult(String classifyResult) {
		this.classifyResult = classifyResult;
	}
	public String getClassifyResult( ) {
		return this.classifyResult;
	}

}
