package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 低纹词数据对象
 *
 * @author auto create
 * @since 1.0, 2025-12-01 15:47:09
 */
public class PatternWord extends AlipayObject {

	private static final long serialVersionUID = 1225474915588738275L;

	/**
	 * 跳转链接
	 */
	@ApiField("app_url")
	private String appUrl;

	/**
	 * 图标链接
	 */
	@ApiField("icon_url")
	private String iconUrl;

	/**
	 * 跳转链接
	 */
	@ApiField("mp_url")
	private String mpUrl;

	/**
	 * 跳转链接
	 */
	@ApiField("pc_url")
	private String pcUrl;

	/**
	 * 跳转链接
	 */
	@ApiField("touch_url")
	private String touchUrl;

	/**
	 * 低纹词内容
	 */
	@ApiField("word")
	private String word;

	public String getAppUrl() {
		return this.appUrl;
	}
	public void setAppUrl(String appUrl) {
		this.appUrl = appUrl;
	}

	public String getIconUrl() {
		return this.iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public String getMpUrl() {
		return this.mpUrl;
	}
	public void setMpUrl(String mpUrl) {
		this.mpUrl = mpUrl;
	}

	public String getPcUrl() {
		return this.pcUrl;
	}
	public void setPcUrl(String pcUrl) {
		this.pcUrl = pcUrl;
	}

	public String getTouchUrl() {
		return this.touchUrl;
	}
	public void setTouchUrl(String touchUrl) {
		this.touchUrl = touchUrl;
	}

	public String getWord() {
		return this.word;
	}
	public void setWord(String word) {
		this.word = word;
	}

}
