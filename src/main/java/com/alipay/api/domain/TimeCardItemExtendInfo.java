package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 次卡商品扩展字段
 *
 * @author auto create
 * @since 1.0, 2022-04-20 10:37:57
 */
public class TimeCardItemExtendInfo extends AlipayObject {

	private static final long serialVersionUID = 7736271898198581578L;

	/**
	 * 小程序跳转链接
	 */
	@ApiField("action_link")
	private String actionLink;

	public String getActionLink() {
		return this.actionLink;
	}
	public void setActionLink(String actionLink) {
		this.actionLink = actionLink;
	}

}
