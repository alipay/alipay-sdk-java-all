package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 红包数据结构
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class NewsfeedMediaGiftInfo extends AlipayObject {

	private static final long serialVersionUID = 8385559986994833535L;

	/**
	 * 地址
	 */
	@ApiField("action")
	private String action;

	/**
	 * 安卓的高度
	 */
	@ApiField("adr_height")
	private String adrHeight;

	/**
	 * 安卓缩略图
	 */
	@ApiField("adr_thumb")
	private String adrThumb;

	/**
	 * 安卓宽度
	 */
	@ApiField("adr_width")
	private String adrWidth;

	/**
	 * ios高度
	 */
	@ApiField("ios_height")
	private String iosHeight;

	/**
	 * ios缩略图
	 */
	@ApiField("ios_thumb")
	private String iosThumb;

	/**
	 * ios宽度
	 */
	@ApiField("ios_width")
	private String iosWidth;

	/**
	 * 大图
	 */
	@ApiField("theme")
	private String theme;

	/**
	 * 红包类型all、f、m
	 */
	@ApiField("type")
	private String type;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getAdrHeight() {
		return this.adrHeight;
	}
	public void setAdrHeight(String adrHeight) {
		this.adrHeight = adrHeight;
	}

	public String getAdrThumb() {
		return this.adrThumb;
	}
	public void setAdrThumb(String adrThumb) {
		this.adrThumb = adrThumb;
	}

	public String getAdrWidth() {
		return this.adrWidth;
	}
	public void setAdrWidth(String adrWidth) {
		this.adrWidth = adrWidth;
	}

	public String getIosHeight() {
		return this.iosHeight;
	}
	public void setIosHeight(String iosHeight) {
		this.iosHeight = iosHeight;
	}

	public String getIosThumb() {
		return this.iosThumb;
	}
	public void setIosThumb(String iosThumb) {
		this.iosThumb = iosThumb;
	}

	public String getIosWidth() {
		return this.iosWidth;
	}
	public void setIosWidth(String iosWidth) {
		this.iosWidth = iosWidth;
	}

	public String getTheme() {
		return this.theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
