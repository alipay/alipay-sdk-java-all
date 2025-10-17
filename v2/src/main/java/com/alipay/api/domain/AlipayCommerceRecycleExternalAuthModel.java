package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收预授权
 *
 * @author auto create
 * @since 1.0, 2025-07-02 14:25:31
 */
public class AlipayCommerceRecycleExternalAuthModel extends AlipayObject {

	private static final long serialVersionUID = 1691759684622671558L;

	/**
	 * 用户的支付宝登陆号，可以是手机或邮箱
	 */
	@ApiField("login_id")
	private String loginId;

	public String getLoginId() {
		return this.loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

}
