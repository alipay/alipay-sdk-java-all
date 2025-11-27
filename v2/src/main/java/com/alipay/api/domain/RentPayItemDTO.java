package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁订单费用项明细
 *
 * @author auto create
 * @since 1.0, 2025-10-24 11:08:24
 */
public class RentPayItemDTO extends AlipayObject {

	private static final long serialVersionUID = 6329541494113326621L;

	/**
	 * 费用金额，单位：元，精确到小数点后两位。 当前字段已废弃(不再需要商户传该字段)
	 */
	@ApiField("amount")
	@Deprecated
	private String amount;

	/**
	 * 第几期租金，从1开始
	 */
	@ApiField("installment_no")
	private Long installmentNo;

	/**
	 * 当前费用项支付金额，单位：元，精确到小数点后两位。
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 商家租中减收费用时传，单位：元，精确到小数点后两位。
	 */
	@ApiField("reduction")
	private String reduction;

	/**
	 * 订单费用类型
	 */
	@ApiField("type")
	private String type;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Long getInstallmentNo() {
		return this.installmentNo;
	}
	public void setInstallmentNo(Long installmentNo) {
		this.installmentNo = installmentNo;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getReduction() {
		return this.reduction;
	}
	public void setReduction(String reduction) {
		this.reduction = reduction;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
