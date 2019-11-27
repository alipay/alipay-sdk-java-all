package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 认知在线服务
 *
 * @author auto create
 * @since 1.0, 2018-03-23 18:27:42
 */
public class AlipayDataAiserviceOcrOcrQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8717741834542285846L;

	/**
	 * 图片id
	 */
	@ApiField("image")
	private String image;

	/**
	 * 服务调用防范
	 */
	@ApiField("ocr_method")
	private String ocrMethod;

	public String getImage() {
		return this.image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	public String getOcrMethod() {
		return this.ocrMethod;
	}
	public void setOcrMethod(String ocrMethod) {
		this.ocrMethod = ocrMethod;
	}

}
