package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 社交评论中的图片信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class CommentImageInfo extends AlipayObject {

	private static final long serialVersionUID = 6316655896511435737L;

	/**
	 * 图片高度(px)
	 */
	@ApiField("height")
	private String height;

	/**
	 * 图片地址（支持djangoId）
	 */
	@ApiField("src")
	private String src;

	/**
	 * 图片宽度(px)
	 */
	@ApiField("width")
	private String width;

	public String getHeight() {
		return this.height;
	}
	public void setHeight(String height) {
		this.height = height;
	}

	public String getSrc() {
		return this.src;
	}
	public void setSrc(String src) {
		this.src = src;
	}

	public String getWidth() {
		return this.width;
	}
	public void setWidth(String width) {
		this.width = width;
	}

}
