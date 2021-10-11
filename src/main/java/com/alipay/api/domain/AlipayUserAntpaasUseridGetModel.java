package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝会员注册提前获取userId
 *
 * @author auto create
 * @since 1.0, 2020-05-07 20:39:54
 */
public class AlipayUserAntpaasUseridGetModel extends AlipayObject {

	private static final long serialVersionUID = 7592495646561357742L;

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
