package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业充电退款查询接口
 *
 * @author auto create
 * @since 1.0, 2025-04-25 19:35:23
 */
public class AlipayCommerceTransportChargerRefundQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4851168338984137259L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 退款请求业务流水号。每次退款请求需不同，保证单笔退款订单唯一性
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 商户订单号。 订单支付时传入的商户订单号，商家自定义且保证商家系统中唯一
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
