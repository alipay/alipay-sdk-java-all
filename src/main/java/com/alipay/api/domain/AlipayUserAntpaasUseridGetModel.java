package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝会员注册提前获取userId
 *
 * @author auto create
 * @since 1.0, 2016-10-25 19:01:45
 */
public class AlipayUserAntpaasUseridGetModel extends AlipayObject {

	private static final long serialVersionUID = 5725639339358156793L;

	/**
	 * 账户登录号，邮箱或者手机号
	 */
	@ApiField("logon_id")
	private String logonId;

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

}
