package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 算法入参图片信息
 *
 * @author auto create
 * @since 1.0, 2019-04-02 11:22:36
 */
public class ImageInfo extends AlipayObject {

	private static final long serialVersionUID = 2495937975347565541L;

	/**
	 * 图片aftsId或者url
	 */
	@ApiField("image")
	private String image;

	/**
	 * 传入图片类型，ID表示aftsId，URL表示图片url地址
	 */
	@ApiField("image_type")
	private String imageType;

	public String getImage() {
		return this.image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	public String getImageType() {
		return this.imageType;
	}
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

}
