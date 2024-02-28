package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 拓展字段
 *
 * @author auto create
 * @since 1.0, 2022-02-23 10:19:09
 */
public class BillSendExtInfo extends AlipayObject {

	private static final long serialVersionUID = 7685932336419676977L;

	/**
	 * 账单唤起收银台的方式：
1-手机wap;2-当面付。默认值为1（不传值或传非数字值）
	 */
	@ApiField("order_pay_type")
	private String orderPayType;

	/**
	 * 分账金额
	 */
	@ApiField("royalty_amount")
	private String royaltyAmount;

	/**
	 * 2088xxx
	 */
	@ApiField("trans_in_pid")
	private String transInPid;

	public String getOrderPayType() {
		return this.orderPayType;
	}
	public void setOrderPayType(String orderPayType) {
		this.orderPayType = orderPayType;
	}

	public String getRoyaltyAmount() {
		return this.royaltyAmount;
	}
	public void setRoyaltyAmount(String royaltyAmount) {
		this.royaltyAmount = royaltyAmount;
	}

	public String getTransInPid() {
		return this.transInPid;
	}
	public void setTransInPid(String transInPid) {
		this.transInPid = transInPid;
	}

}
