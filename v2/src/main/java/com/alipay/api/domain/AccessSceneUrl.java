package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户准入地址
 *
 * @author auto create
 * @since 1.0, 2024-10-31 20:52:11
 */
public class AccessSceneUrl extends AlipayObject {

	private static final long serialVersionUID = 3767277261861957667L;

	/**
	 * 跳转url信息
	 */
	@ApiField("access_url")
	private String accessUrl;

	/**
	 * scheme地址
	 */
	@ApiField("scheme_url")
	private String schemeUrl;

	/**
	 * url文案信息
	 */
	@ApiField("text")
	private String text;

	public String getAccessUrl() {
		return this.accessUrl;
	}
	public void setAccessUrl(String accessUrl) {
		this.accessUrl = accessUrl;
	}

	public String getSchemeUrl() {
		return this.schemeUrl;
	}
	public void setSchemeUrl(String schemeUrl) {
		this.schemeUrl = schemeUrl;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
