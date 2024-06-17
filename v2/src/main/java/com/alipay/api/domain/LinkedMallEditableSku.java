package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * SKU编辑属性
 *
 * @author auto create
 * @since 1.0, 2024-06-07 13:59:56
 */
public class LinkedMallEditableSku extends AlipayObject {

	private static final long serialVersionUID = 3684231413672614238L;

	/**
	 * sku图片链接
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * sku名称
	 */
	@ApiField("title")
	private String title;

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
