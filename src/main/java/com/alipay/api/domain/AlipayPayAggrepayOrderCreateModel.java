package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建微信订单
 *
 * @author auto create
 * @since 1.0, 2022-08-17 14:39:27
 */
public class AlipayPayAggrepayOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7444587911774531854L;

	/**
	 * 微信用户openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝订单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
