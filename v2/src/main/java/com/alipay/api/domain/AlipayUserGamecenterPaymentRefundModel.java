package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充值退款接口
 *
 * @author auto create
 * @since 1.0, 2023-06-21 10:05:16
 */
public class AlipayUserGamecenterPaymentRefundModel extends AlipayObject {

	private static final long serialVersionUID = 3426858791542269967L;

	/**
	 * 商户app_id维度下的用户标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 平台侧订单号，在下单的时候平台返回的trade_no
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
