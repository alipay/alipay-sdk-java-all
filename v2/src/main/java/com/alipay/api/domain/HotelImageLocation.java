package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 地址列表
 *
 * @author auto create
 * @since 1.0, 2024-01-24 11:20:15
 */
public class HotelImageLocation extends AlipayObject {

	private static final long serialVersionUID = 5599949819956561828L;

	/**
	 * 图片描述
	 */
	@ApiField("image_description")
	private String imageDescription;

	/**
	 * 图片大小
	 */
	@ApiField("size")
	private String size;

	/**
	 * 图片地址
	 */
	@ApiField("url")
	private String url;

	/**
	 * 是否有水印
	 */
	@ApiField("water_mark")
	private Boolean waterMark;

	public String getImageDescription() {
		return this.imageDescription;
	}
	public void setImageDescription(String imageDescription) {
		this.imageDescription = imageDescription;
	}

	public String getSize() {
		return this.size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public Boolean getWaterMark() {
		return this.waterMark;
	}
	public void setWaterMark(Boolean waterMark) {
		this.waterMark = waterMark;
	}

}
