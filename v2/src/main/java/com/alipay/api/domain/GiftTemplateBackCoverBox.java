package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 封底容器，封装普通封底和异形封底，用于拆包页
 *
 * @author auto create
 * @since 1.0, 2023-07-17 15:11:31
 */
public class GiftTemplateBackCoverBox extends AlipayObject {

	private static final long serialVersionUID = 2533796649542763316L;

	/**
	 * 封底图片，用于拆包页
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 异形封底图，用于拆包页
	 */
	@ApiField("special_shaped_url")
	private String specialShapedUrl;

	public String getImageUrl() {
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getSpecialShapedUrl() {
		return this.specialShapedUrl;
	}
	public void setSpecialShapedUrl(String specialShapedUrl) {
		this.specialShapedUrl = specialShapedUrl;
	}

}
