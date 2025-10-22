package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预校验拒绝列表
 *
 * @author auto create
 * @since 1.0, 2024-06-21 11:07:51
 */
public class ConsultRefuseResponse extends AlipayObject {

	private static final long serialVersionUID = 4227175495968278393L;

	/**
	 * 渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 拒绝编码
	 */
	@ApiField("refuse_code")
	private String refuseCode;

	/**
	 * 拒绝文案
	 */
	@ApiField("refuse_msg")
	private String refuseMsg;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getRefuseCode() {
		return this.refuseCode;
	}
	public void setRefuseCode(String refuseCode) {
		this.refuseCode = refuseCode;
	}

	public String getRefuseMsg() {
		return this.refuseMsg;
	}
	public void setRefuseMsg(String refuseMsg) {
		this.refuseMsg = refuseMsg;
	}

}
