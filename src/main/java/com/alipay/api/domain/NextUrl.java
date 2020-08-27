package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小宝账户详情页跳转链接
 *
 * @author auto create
 * @since 1.0, 2019-08-08 10:58:59
 */
public class NextUrl extends AlipayObject {

	private static final long serialVersionUID = 8451279687665548327L;

	/**
	 * 小宝账户详情页跳转链接
	 */
	@ApiField("jump_url")
	private String jumpUrl;

	/**
	 * 跳转链接的展示文案
	 */
	@ApiField("text")
	private String text;

	public String getJumpUrl() {
		return this.jumpUrl;
	}
	public void setJumpUrl(String jumpUrl) {
		this.jumpUrl = jumpUrl;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
