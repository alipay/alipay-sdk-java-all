package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EduOcrResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.educertify.result.get response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-18 10:47:49
 */
public class AlipayEbppIndustryEducertifyResultGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6176627114318932337L;

	/** 
	 * 学历认证票据
	 */
	@ApiField("certify_token")
	private String certifyToken;

	/** 
	 * 学历认证结果
	 */
	@ApiField("ocr_result")
	private EduOcrResult ocrResult;

	public void setCertifyToken(String certifyToken) {
		this.certifyToken = certifyToken;
	}
	public String getCertifyToken( ) {
		return this.certifyToken;
	}

	public void setOcrResult(EduOcrResult ocrResult) {
		this.ocrResult = ocrResult;
	}
	public EduOcrResult getOcrResult( ) {
		return this.ocrResult;
	}

}
