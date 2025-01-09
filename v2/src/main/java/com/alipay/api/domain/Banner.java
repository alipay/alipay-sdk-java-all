package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Banner
 *
 * @author auto create
 * @since 1.0, 2024-05-21 15:16:49
 */
public class Banner extends AlipayObject {

	private static final long serialVersionUID = 3515717731784483586L;

	/**
	 * 链接
	 */
	@ApiField("link")
	private String link;

	/**
	 * 图片
	 */
	@ApiField("picture")
	private String picture;

	public String getLink() {
		return this.link;
	}
	public void setLink(String link) {
		this.link = link;
	}

	public String getPicture() {
		return this.picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}

}
