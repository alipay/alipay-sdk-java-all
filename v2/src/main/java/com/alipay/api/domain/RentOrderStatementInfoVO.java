package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁账单信息
 *
 * @author auto create
 * @since 1.0, 2025-08-08 18:31:32
 */
public class RentOrderStatementInfoVO extends AlipayObject {

	private static final long serialVersionUID = 4267751349315329444L;

	/**
	 * 用户支付时，实际申领的支付宝平台优惠金额，单位：元,精确到小数点后两位
	 */
	@ApiField("actual_promo_amount")
	private String actualPromoAmount;

	/**
	 * 账单金额，单位：元,精确到小数点后两位
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 租金分期期号
	 */
	@ApiField("installment_no")
	private Long installmentNo;

	/**
	 * 已支付金额，单位：元,精确到小数点后两位
	 */
	@ApiField("paid_amount")
	private String paidAmount;

	/**
	 * 计划付款时间
	 */
	@ApiField("plan_pay_time")
	private Date planPayTime;

	/**
	 * 用户下单时，计划申领的支付宝平台优惠金额，单位：元,精确到小数点后两位
	 */
	@ApiField("plan_promo_amount")
	private String planPromoAmount;

	/**
	 * 商家租中减收费用，单位：元,精确到小数点后两位
	 */
	@ApiField("reduction")
	private String reduction;

	/**
	 * 账单状态
	 */
	@ApiField("statement_status")
	private String statementStatus;

	/**
	 * 账单类型
	 */
	@ApiField("statement_type")
	private String statementType;

	public String getActualPromoAmount() {
		return this.actualPromoAmount;
	}
	public void setActualPromoAmount(String actualPromoAmount) {
		this.actualPromoAmount = actualPromoAmount;
	}

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

	public String getPaidAmount() {
		return this.paidAmount;
	}
	public void setPaidAmount(String paidAmount) {
		this.paidAmount = paidAmount;
	}

	public Date getPlanPayTime() {
		return this.planPayTime;
	}
	public void setPlanPayTime(Date planPayTime) {
		this.planPayTime = planPayTime;
	}

	public String getPlanPromoAmount() {
		return this.planPromoAmount;
	}
	public void setPlanPromoAmount(String planPromoAmount) {
		this.planPromoAmount = planPromoAmount;
	}

	public String getReduction() {
		return this.reduction;
	}
	public void setReduction(String reduction) {
		this.reduction = reduction;
	}

	public String getStatementStatus() {
		return this.statementStatus;
	}
	public void setStatementStatus(String statementStatus) {
		this.statementStatus = statementStatus;
	}

	public String getStatementType() {
		return this.statementType;
	}
	public void setStatementType(String statementType) {
		this.statementType = statementType;
	}

}
