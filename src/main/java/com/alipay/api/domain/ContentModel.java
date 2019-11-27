package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 各个场景展示的内容及跳转链接的复杂类型
 *
 * @author auto create
 * @since 1.0, 2017-12-22 11:17:31
 */
public class ContentModel extends AlipayObject {

	private static final long serialVersionUID = 7699983864673642963L;

	/**
	 * 点击展示内容，要跳转的url
	 */
	@ApiField("action_url")
	private String actionUrl;

	/**
	 * 展示内容，目前支持：1. type为text时，info为要展示的文案
	 */
	@ApiField("info")
	private String info;

	/**
	 * 展示内容的类型，目前支持：1. text（文字）
	 */
	@ApiField("type")
	private String type;

	public String getActionUrl() {
		return this.actionUrl;
	}
	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

	public String getInfo() {
		return this.info;
	}
	public void setInfo(String info) {
		this.info = info;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
