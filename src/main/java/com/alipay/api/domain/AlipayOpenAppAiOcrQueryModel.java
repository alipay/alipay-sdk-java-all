package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝认知服务
 *
 * @author auto create
 * @since 1.0, 2018-03-23 17:33:11
 */
public class AlipayOpenAppAiOcrQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5714694279873333979L;

	/**
	 * 图片id
	 */
	@ApiField("image")
	private String image;

	/**
	 * 调用服务的方法
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
