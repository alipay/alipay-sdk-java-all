package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能营销券的使用说明描述
 *
 * @author auto create
 * @since 1.0, 2018-01-22 16:28:44
 */
public class InteligentVoucherDescDetail extends AlipayObject {

	private static final long serialVersionUID = 8466724568157498995L;

	/**
	 * 具体描述信息列表
	 */
	@ApiField("details")
	private String details;

	/**
	 * 图片描述信息
	 */
	@ApiField("images")
	private String images;

	/**
	 * 券说明的标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 券外部详情描述
	 */
	@ApiField("url")
	private String url;

	public String getDetails() {
		return this.details;
	}
	public void setDetails(String details) {
		this.details = details;
	}

	public String getImages() {
		return this.images;
	}
	public void setImages(String images) {
		this.images = images;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
