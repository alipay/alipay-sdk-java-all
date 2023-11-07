package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单记录
 *
 * @author auto create
 * @since 1.0, 2023-03-27 14:03:00
 */
public class SupervisionBillInfo extends AlipayObject {

	private static final long serialVersionUID = 6489351974134538522L;

	/**
	 * 来账金额
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 来账单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 收方户名
	 */
	@ApiField("payee_card_name")
	private String payeeCardName;

	/**
	 * 收方卡号
	 */
	@ApiField("payee_card_no")
	private String payeeCardNo;

	/**
	 * 付方户名
	 */
	@ApiField("payer_card_name")
	private String payerCardName;

	/**
	 * 付方卡号
	 */
	@ApiField("payer_card_no")
	private String payerCardNo;

	/**
	 * 来账附言
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 来账时间
	 */
	@ApiField("vostro_time")
	private String vostroTime;

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getPayeeCardName() {
		return this.payeeCardName;
	}
	public void setPayeeCardName(String payeeCardName) {
		this.payeeCardName = payeeCardName;
	}

	public String getPayeeCardNo() {
		return this.payeeCardNo;
	}
	public void setPayeeCardNo(String payeeCardNo) {
		this.payeeCardNo = payeeCardNo;
	}

	public String getPayerCardName() {
		return this.payerCardName;
	}
	public void setPayerCardName(String payerCardName) {
		this.payerCardName = payerCardName;
	}

	public String getPayerCardNo() {
		return this.payerCardNo;
	}
	public void setPayerCardNo(String payerCardNo) {
		this.payerCardNo = payerCardNo;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getVostroTime() {
		return this.vostroTime;
	}
	public void setVostroTime(String vostroTime) {
		this.vostroTime = vostroTime;
	}

}
