package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车辆行驶证信息识别
 *
 * @author auto create
 * @since 1.0, 2018-05-21 18:03:35
 */
public class AlipayIserviceCognitiveOcrVehiclelicenseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8766129591371122455L;

	/**
	 * 行驶证图片base64加密后内容，大小限制在1.5M
	 */
	@ApiField("image_content")
	private String imageContent;

	public String getImageContent() {
		return this.imageContent;
	}
	public void setImageContent(String imageContent) {
		this.imageContent = imageContent;
	}

}
