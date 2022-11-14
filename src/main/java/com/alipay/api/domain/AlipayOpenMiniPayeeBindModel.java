package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序绑定收款账号
 *
 * @author auto create
 * @since 1.0, 2018-12-03 09:20:19
 */
public class AlipayOpenMiniPayeeBindModel extends AlipayObject {

	private static final long serialVersionUID = 8337485652952164472L;

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
