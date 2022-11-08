package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.ocr.server.detect response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-19 14:01:47
 */
public class DatadigitalFincloudGeneralsaasOcrServerDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 2568649381485774268L;

	/** 
	 * OCR识别单据号，计费依据，请保留以便排查问题。
	 */
	@ApiField("certify_id")
	private String certifyId;

	/** 
	 * OCR识别结果
	 */
	@ApiField("ocr_data")
	private String ocrData;

	public void setCertifyId(String certifyId) {
		this.certifyId = certifyId;
	}
	public String getCertifyId( ) {
		return this.certifyId;
	}

	public void setOcrData(String ocrData) {
		this.ocrData = ocrData;
	}
	public String getOcrData( ) {
		return this.ocrData;
	}

}
