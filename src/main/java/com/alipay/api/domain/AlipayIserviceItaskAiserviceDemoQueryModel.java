package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 认知服务demo
 *
 * @author auto create
 * @since 1.0, 2018-04-25 15:42:54
 */
public class AlipayIserviceItaskAiserviceDemoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7176797821722234465L;

	/**
	 * 图片base64加密后
	 */
	@ApiField("image_id")
	private String imageId;

	public String getImageId() {
		return this.imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

}
