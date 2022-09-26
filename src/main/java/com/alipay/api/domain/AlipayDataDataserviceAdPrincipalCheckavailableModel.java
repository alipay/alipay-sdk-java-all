package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询商家签约状态
 *
 * @author auto create
 * @since 1.0, 2021-05-08 11:49:37
 */
public class AlipayDataDataserviceAdPrincipalCheckavailableModel extends AlipayObject {

	private static final long serialVersionUID = 3494253222193482557L;

	/**
	 * 商家支付宝PID，根据该ID查询签约状态
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
