package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁订单费用项明细
 *
 * @author auto create
 * @since 1.0, 2025-06-09 16:48:47
 */
public class RentPayItemDTO extends AlipayObject {

	private static final long serialVersionUID = 4771318782155688881L;

	/**
	 * 费用金额，单位：元，精确到小数点后两位。
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 第几期租金，从1开始
	 */
	@ApiField("installment_no")
	private Long installmentNo;

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
