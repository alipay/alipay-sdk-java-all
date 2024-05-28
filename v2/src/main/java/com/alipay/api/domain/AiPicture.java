package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 定制周边图片信息模型
 *
 * @author auto create
 * @since 1.0, 2023-12-06 18:13:35
 */
public class AiPicture extends AlipayObject {

	private static final long serialVersionUID = 3511428464867161557L;

	/**
	 * 支付宝AIGC生成的订单ID
	 */
	@ApiField("aigc_order_id")
	private String aigcOrderId;

	/**
	 * 多媒体图片ID
	 */
	@ApiField("image_id")
	private String imageId;

	/**
	 * 安全状态
	 */
	@ApiField("sec_status")
	private String secStatus;

	public String getAigcOrderId() {
		return this.aigcOrderId;
	}
	public void setAigcOrderId(String aigcOrderId) {
		this.aigcOrderId = aigcOrderId;
	}

	public String getImageId() {
		return this.imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getSecStatus() {
		return this.secStatus;
	}
	public void setSecStatus(String secStatus) {
		this.secStatus = secStatus;
	}

}
