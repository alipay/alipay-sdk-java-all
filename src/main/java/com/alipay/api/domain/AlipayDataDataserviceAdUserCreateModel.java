package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投放账户开户
 *
 * @author auto create
 * @since 1.0, 2019-11-15 10:57:25
 */
public class AlipayDataDataserviceAdUserCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5676157311212537159L;

	/**
	 * 投放账户支付宝PID
	 */
	@ApiField("alipay_pid")
	private String alipayPid;

	/**
	 * 灯火平台提供给外部系统的访问token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 账户状态，ENABLE-生效；DISABLE-失效。若为空，则默认有效。
	 */
	@ApiField("status")
	private String status;

	public String getAlipayPid() {
		return this.alipayPid;
	}
	public void setAlipayPid(String alipayPid) {
		this.alipayPid = alipayPid;
	}

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
