package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.smdd.ocr.image.identify response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 11:12:36
 */
public class AlipayOfflineSmddOcrImageIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4288585816314729773L;

	/** 
	 * 解析结果
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
