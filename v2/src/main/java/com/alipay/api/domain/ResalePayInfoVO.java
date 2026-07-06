package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-06 10:46:12
 */
public class ResalePayInfoVO extends AlipayObject {

	private static final long serialVersionUID = 5346167944857233516L;

	/**
	 * 支付金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 支付说明
	 */
	@ApiField("pay_memo")
	private String payMemo;

	/**
	 * SEND_BACK_LOGISTICS_FEE（退货物流费）、COMPENSATION_FEE（物品赔付费）。总费用不能超过订单总金额
	 */
	@ApiField("pay_scene")
	private String payScene;

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getPayMemo() {
		return this.payMemo;
	}
	public void setPayMemo(String payMemo) {
		this.payMemo = payMemo;
	}

	public String getPayScene() {
		return this.payScene;
	}
	public void setPayScene(String payScene) {
		this.payScene = payScene;
	}

}
