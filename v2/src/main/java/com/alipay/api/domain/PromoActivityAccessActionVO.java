package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 可准入的方法
 *
 * @author auto create
 * @since 1.0, 2023-09-07 19:04:53
 */
public class PromoActivityAccessActionVO extends AlipayObject {

	private static final long serialVersionUID = 7419276584951712466L;

	/**
	 * 下一步应该怎么做
	 */
	@ApiField("action_text")
	private String actionText;

	/**
	 * 行动链接
	 */
	@ApiField("action_url")
	private String actionUrl;

	public String getActionText() {
		return this.actionText;
	}
	public void setActionText(String actionText) {
		this.actionText = actionText;
	}

	public String getActionUrl() {
		return this.actionUrl;
	}
	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

}
