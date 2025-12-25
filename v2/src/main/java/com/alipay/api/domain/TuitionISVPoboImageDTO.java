package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 留学VCC图片证明信息
 *
 * @author auto create
 * @since 1.0, 2023-06-29 15:26:57
 */
public class TuitionISVPoboImageDTO extends AlipayObject {

	private static final long serialVersionUID = 4777456653938394239L;

	/**
	 * 图片格式
	 */
	@ApiField("image_format")
	private String imageFormat;

	/**
	 * 图片id
	 */
	@ApiField("image_id")
	private String imageId;

	public String getImageFormat() {
		return this.imageFormat;
	}
	public void setImageFormat(String imageFormat) {
		this.imageFormat = imageFormat;
	}

	public String getImageId() {
		return this.imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

}
