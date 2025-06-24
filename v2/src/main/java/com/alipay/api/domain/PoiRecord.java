package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-03-19 14:12:27
 */
public class PoiRecord extends AlipayObject {

	private static final long serialVersionUID = 7827552277998798747L;

	/**
	 * 图片
	 */
	@ApiField("img_url")
	private String imgUrl;

	/**
	 * 景点类别
	 */
	@ApiField("tag")
	private String tag;

	/**
	 * 景点名称
	 */
	@ApiField("title")
	private String title;

	/**
	 * 是否途经
	 */
	@ApiField("via_flag")
	private Boolean viaFlag;

	public String getImgUrl() {
		return this.imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getTag() {
		return this.tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Boolean getViaFlag() {
		return this.viaFlag;
	}
	public void setViaFlag(Boolean viaFlag) {
		this.viaFlag = viaFlag;
	}

}
