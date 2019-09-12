package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投放账户开户
 *
 * @author auto create
 * @since 1.0, 2019-07-30 17:28:33
 */
public class AlipayDataDataserviceAdUserCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5292719743711119761L;

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

}
