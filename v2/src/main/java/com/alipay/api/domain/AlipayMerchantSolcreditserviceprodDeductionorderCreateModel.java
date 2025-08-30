package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扣款单创建
 *
 * @author auto create
 * @since 1.0, 2024-11-14 19:50:54
 */
public class AlipayMerchantSolcreditserviceprodDeductionorderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5422724715346424246L;

	/**
	 * 扣押金必填，不能大于押金剩余金额
	 */
	@ApiField("deduction_amount")
	private String deductionAmount;

	/**
	 * 扣押金必填
	 */
	@ApiField("deduction_reason")
	private String deductionReason;

	/**
	 * 押金扣款单: DEPOSIT
租金扣款单: RENT
	 */
	@ApiField("deduction_type")
	private String deductionType;

	/**
	 * 系统生成订单唯一编号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 商户保证唯一
	 */
	@ApiField("request_no")
	private String requestNo;

	public String getDeductionAmount() {
		return this.deductionAmount;
	}
	public void setDeductionAmount(String deductionAmount) {
		this.deductionAmount = deductionAmount;
	}

	public String getDeductionReason() {
		return this.deductionReason;
	}
	public void setDeductionReason(String deductionReason) {
		this.deductionReason = deductionReason;
	}

	public String getDeductionType() {
		return this.deductionType;
	}
	public void setDeductionType(String deductionType) {
		this.deductionType = deductionType;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

}
