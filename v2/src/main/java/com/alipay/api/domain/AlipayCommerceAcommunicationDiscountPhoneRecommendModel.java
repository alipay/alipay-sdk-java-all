package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充值话费推荐
 *
 * @author auto create
 * @since 1.0, 2024-06-13 09:55:55
 */
public class AlipayCommerceAcommunicationDiscountPhoneRecommendModel extends AlipayObject {

	private static final long serialVersionUID = 5587494479937221743L;

	/**
	 * 格式是逗号分隔的字符串看，示例值中给值代表，客户端只需要5元，10元，20元，50元金额的面值的充值商品。
	 */
	@ApiField("faces")
	private String faces;

	/**
	 * 用户手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 支付宝侧分配场景码，用于风控限制和商品查询
	 */
	@ApiField("scene")
	private String scene;

	public String getFaces() {
		return this.faces;
	}
	public void setFaces(String faces) {
		this.faces = faces;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
