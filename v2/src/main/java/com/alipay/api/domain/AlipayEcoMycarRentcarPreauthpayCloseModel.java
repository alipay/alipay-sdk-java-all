package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝租车预授权扣款关闭
 *
 * @author auto create
 * @since 1.0, 2023-12-05 14:27:30
 */
public class AlipayEcoMycarRentcarPreauthpayCloseModel extends AlipayObject {

	private static final long serialVersionUID = 7787688699843693549L;

	/**
	 * 扣款时的外部交易号
	 */
	@ApiField("deduct_out_trade_no")
	private String deductOutTradeNo;

	/**
	 * 支付宝用户开放平台id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 2088000000000000
	 */
	@ApiField("user_id")
	private String userId;

	public String getDeductOutTradeNo() {
		return this.deductOutTradeNo;
	}
	public void setDeductOutTradeNo(String deductOutTradeNo) {
		this.deductOutTradeNo = deductOutTradeNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
