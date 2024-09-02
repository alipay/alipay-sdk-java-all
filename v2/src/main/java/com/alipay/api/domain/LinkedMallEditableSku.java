package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * SKU编辑属性
 *
 * @author auto create
 * @since 1.0, 2024-07-10 10:29:05
 */
public class LinkedMallEditableSku extends AlipayObject {

	private static final long serialVersionUID = 8256445437339823435L;

	/**
	 * sku图片链接
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * sku价格，单位分
	 */
	@ApiField("price")
	private String price;

	/**
	 * sku状态
	 */
	@ApiField("status")
	private String status;

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

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
