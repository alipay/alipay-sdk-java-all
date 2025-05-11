package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * OCR图片识别
 *
 * @author auto create
 * @since 1.0, 2025-04-08 16:22:14
 */
public class AlipayOfflineSmddOcrImageIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 8494584264818971743L;

	/**
	 * 图片地址
	 */
	@ApiField("afts_url")
	private String aftsUrl;

	/**
	 * 图片类型
	 */
	@ApiField("ocr_type")
	private String ocrType;

	public String getAftsUrl() {
		return this.aftsUrl;
	}
	public void setAftsUrl(String aftsUrl) {
		this.aftsUrl = aftsUrl;
	}

	public String getOcrType() {
		return this.ocrType;
	}
	public void setOcrType(String ocrType) {
		this.ocrType = ocrType;
	}

}
