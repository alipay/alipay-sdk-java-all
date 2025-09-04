package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 随身贷产品支用试算时返回的详细还款计划列表对象
 *
 * @author auto create
 * @since 1.0, 2025-04-25 11:19:58
 */
public class InstallmentPlan extends AlipayObject {

	private static final long serialVersionUID = 4782327932681438743L;

	/**
	 * 分期还款日、分期到期日
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 还款计划期次，整数类型依次递增
	 */
	@ApiField("installment_no")
	private Long installmentNo;

	/**
	 * 分期利息，如果有优惠则是优惠后的利息，单位元，保留两位小数
	 */
	@ApiField("interest")
	private String interest;

	/**
	 * 分期本金，单位元，保留两位小数
	 */
	@ApiField("principal")
	private String principal;

	/**
	 * 优惠利息，单位元，保留两位小数
	 */
	@ApiField("promotion_amount")
	private String promotionAmount;

	/**
	 * 总金额，单位元，保留两位小数
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Long getInstallmentNo() {
		return this.installmentNo;
	}
	public void setInstallmentNo(Long installmentNo) {
		this.installmentNo = installmentNo;
	}

	public String getInterest() {
		return this.interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}

	public String getPrincipal() {
		return this.principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public String getPromotionAmount() {
		return this.promotionAmount;
	}
	public void setPromotionAmount(String promotionAmount) {
		this.promotionAmount = promotionAmount;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
