package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户的支付宝交易信息
 *
 * @author auto create
 * @since 1.0, 2022-11-19 00:20:13
 */
public class AlipayEbppInvoiceUserTradeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6551424279623252242L;

	/**
	 * 发票管家交易id，来源于用户支付后开票申请跳转开票方的链接中带入参数einv_trade_id
	 */
	@ApiField("einv_trade_id")
	private String einvTradeId;

	/**
	 * 随机数，从支付宝钱包链接跳转到开票方外部链接中带入的一项参数，调用该方法需将此参数透传回来，参数名：random
	 */
	@ApiField("random")
	private String random;

	/**
	 * 时间戳，从支付宝钱包链接跳转到开票方外部链接中带入的一项参数，调用该方法需将此参数透传回来，参数名：timestamp
	 */
	@ApiField("timestamp")
	private String timestamp;

	/**
	 * 令牌，从支付宝钱包链接跳转到开票方外部链接中带入的一项参数，调用该方法需将此参数透传回来,传入时请进行URLEncode,采用utf-编码格式，参数名：token
	 */
	@ApiField("token")
	private String token;

	public String getEinvTradeId() {
		return this.einvTradeId;
	}
	public void setEinvTradeId(String einvTradeId) {
		this.einvTradeId = einvTradeId;
	}

	public String getRandom() {
		return this.random;
	}
	public void setRandom(String random) {
		this.random = random;
	}

	public String getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getToken() {
		return this.token;
	}
	public void setToken(String token) {
		this.token = token;
	}

}
