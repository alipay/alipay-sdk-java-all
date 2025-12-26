package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.hdfaitransfer.pictureocr.identify response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-26 17:32:36
 */
public class AlipayCommerceHdfaitransferPictureocrIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8642842248221977576L;

	/** 
	 * ocr识别结果，结果中包含制表符\t和换行符\n
	 */
	@ApiField("ocr_result")
	private String ocrResult;

	public void setOcrResult(String ocrResult) {
		this.ocrResult = ocrResult;
	}
	public String getOcrResult( ) {
		return this.ocrResult;
	}

}
