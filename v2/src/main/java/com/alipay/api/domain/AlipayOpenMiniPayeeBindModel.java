package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序绑定收款账号
 *
 * @author auto create
 * @since 1.0, 2025-08-13 16:09:20
 */
public class AlipayOpenMiniPayeeBindModel extends AlipayObject {

	private static final long serialVersionUID = 1859654646294747352L;

	/**
	 * 支付宝登陆账号,和pid两者必选其一，小程序如收款pid与小程序PID非同主体，则只支持通过pid绑定
	 */
	@ApiField("logonid")
	private String logonid;

	/**
	 * 支付宝账号id,和logonid两者必选其一，小程序如收款pid与小程序PID非同主体，则只支持通过pid绑定
	 */
	@ApiField("pid")
	private String pid;

	public String getLogonid() {
		return this.logonid;
	}
	public void setLogonid(String logonid) {
		this.logonid = logonid;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

}
