package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学费码退分账信息
 *
 * @author auto create
 * @since 1.0, 2022-10-13 17:21:18
 */
public class TuitionRefundRoyaltyInfo extends AlipayObject {

	private static final long serialVersionUID = 1374983826162694575L;

	/**
	 * 退分账金额，单位元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 分账百分比，0-100
	 */
	@ApiField("amount_percent")
	private Long amountPercent;

	/**
	 * 分账类型：普通分账为：transfer；补差为：replenish
默认为分账
	 */
	@ApiField("royalty_type")
	private String royaltyType;

	/**
	 * 收入方支付宝uid，分账类型为replenish时必填
	 */
	@ApiField("trans_in")
	private String transIn;

	/**
	 * 退分账转出支付宝uid，分账类型为transfer时必填
	 */
	@ApiField("trans_out")
	private String transOut;

	/**
	 * 账户类型：1-支付宝账号对应的支付宝唯一用户号；
2-卡编号；
3-支付宝登录号；
	 */
	@ApiField("trans_type")
	private String transType;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Long getAmountPercent() {
		return this.amountPercent;
	}
	public void setAmountPercent(Long amountPercent) {
		this.amountPercent = amountPercent;
	}

	public String getRoyaltyType() {
		return this.royaltyType;
	}
	public void setRoyaltyType(String royaltyType) {
		this.royaltyType = royaltyType;
	}

	public String getTransIn() {
		return this.transIn;
	}
	public void setTransIn(String transIn) {
		this.transIn = transIn;
	}

	public String getTransOut() {
		return this.transOut;
	}
	public void setTransOut(String transOut) {
		this.transOut = transOut;
	}

	public String getTransType() {
		return this.transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}

}
