package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扩展区
 *
 * @author auto create
 * @since 1.0, 2024-09-10 19:39:18
 */
public class ExtensionArea extends AlipayObject {

	private static final long serialVersionUID = 8587431548563983877L;

	/**
	 * 跳转链接，当type为"image"时必传，必须是https或alipays开头的url链接。已废弃
	 */
	@ApiField("goto_url")
	private String gotoUrl;

	/**
	 * 扩展区高度，当type值为"h5"时必填，取值范围为200-500的整数,单位是px
	 */
	@ApiField("height")
	private Long height;

	/**
	 * 扩展区名字
	 */
	@ApiField("name")
	private String name;

	/**
	 * 扩展区类型，当前支持的值为h5，表示扩展区内容类型为h5。
	 */
	@ApiField("type")
	private String type;

	/**
	 * 扩展区url，传入h5页面url，必须是https开头的链接
	 */
	@ApiField("url")
	private String url;

	public String getGotoUrl() {
		return this.gotoUrl;
	}
	public void setGotoUrl(String gotoUrl) {
		this.gotoUrl = gotoUrl;
	}

	public Long getHeight() {
		return this.height;
	}
	public void setHeight(Long height) {
		this.height = height;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
