package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询脱敏支付宝账号信息
 *
 * @author auto create
 * @since 1.0, 2021-12-21 11:26:29
 */
public class AlipayCommerceIotMdeviceprodAccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7518169923133126668L;

	/**
	 * 登录ID，需要跟登录类别（logon_type，EMAIL:邮箱登陆 MOBILE:手机登录）结合
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
