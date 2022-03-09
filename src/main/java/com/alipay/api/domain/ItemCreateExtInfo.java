package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 请求扩展信息
 *
 * @author auto create
 * @since 1.0, 2022-03-08 11:06:57
 */
public class ItemCreateExtInfo extends AlipayObject {

	private static final long serialVersionUID = 8348543488421313986L;

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
