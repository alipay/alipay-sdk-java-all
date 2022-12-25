package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车辆行驶证信息识别
 *
 * @author auto create
 * @since 1.0, 2019-03-22 12:51:49
 */
public class AlipayIserviceCognitiveOcrVehiclelicenseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2658315878175824813L;

	/**
	 * 行驶证图片base64加密后内容，大小限制在1.5M
	 */
	@ApiField("image_content")
	private String imageContent;

	/**
	 * face: 行驶证正面 back: 行驶证副页 缺省值是：face
	 */
	@ApiField("side")
	private String side;

	public String getImageContent() {
		return this.imageContent;
	}
	public void setImageContent(String imageContent) {
		this.imageContent = imageContent;
	}

	public String getSide() {
		return this.side;
	}
	public void setSide(String side) {
		this.side = side;
	}

}
