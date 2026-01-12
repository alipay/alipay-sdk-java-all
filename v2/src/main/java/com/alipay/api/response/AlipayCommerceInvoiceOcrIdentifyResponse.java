package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.invoice.ocr.identify response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-18 19:57:40
 */
public class AlipayCommerceInvoiceOcrIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5825745538448536159L;

	/** 
	 * OCR原始解析结果列表
	 */
	@ApiListField("raw_data_list")
	@ApiField("string")
	private List<String> rawDataList;

	public void setRawDataList(List<String> rawDataList) {
		this.rawDataList = rawDataList;
	}
	public List<String> getRawDataList( ) {
		return this.rawDataList;
	}

}
