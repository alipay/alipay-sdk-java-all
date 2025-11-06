package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ocr解析发票文件返回的发票详情信息
 *
 * @author auto create
 * @since 1.0, 2024-01-23 16:42:57
 */
public class OcrData extends AlipayObject {

	private static final long serialVersionUID = 8595289724344358898L;

	/**
	 * ocr按业务类型返回的字段key
	 */
	@ApiField("ocr_data_key")
	private String ocrDataKey;

	/**
	 * ocr识别出来的内容
	 */
	@ApiField("ocr_data_value")
	private String ocrDataValue;

	public String getOcrDataKey() {
		return this.ocrDataKey;
	}
	public void setOcrDataKey(String ocrDataKey) {
		this.ocrDataKey = ocrDataKey;
	}

	public String getOcrDataValue() {
		return this.ocrDataValue;
	}
	public void setOcrDataValue(String ocrDataValue) {
		this.ocrDataValue = ocrDataValue;
	}

}
