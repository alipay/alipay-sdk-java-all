package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.ocr.server.detect response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-12 10:56:46
 */
public class DatadigitalFincloudGeneralsaasOcrServerDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 1527371481247464816L;

	/** 
	 * OCR识别结果
	 */
	@ApiField("ocr_data")
	private String ocrData;

	public void setOcrData(String ocrData) {
		this.ocrData = ocrData;
	}
	public String getOcrData( ) {
		return this.ocrData;
	}

}
