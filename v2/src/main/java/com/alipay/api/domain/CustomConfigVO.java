package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自定义配置
 *
 * @author auto create
 * @since 1.0, 2025-06-19 20:02:23
 */
public class CustomConfigVO extends AlipayObject {

	private static final long serialVersionUID = 6546532363959827971L;

	/**
	 * 配置开关 true|false
	 */
	@ApiField("config_switch")
	private Boolean configSwitch;

	/**
	 * 图片地址
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 链接地址
	 */
	@ApiField("link_url")
	private String linkUrl;

	/**
	 * 配置类型 LINK|IMAGE
	 */
	@ApiField("type")
	private String type;

	public Boolean getConfigSwitch() {
		return this.configSwitch;
	}
	public void setConfigSwitch(Boolean configSwitch) {
		this.configSwitch = configSwitch;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getLinkUrl() {
		return this.linkUrl;
	}
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
