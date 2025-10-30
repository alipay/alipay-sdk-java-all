package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SideloanInstitution;
import com.alipay.api.domain.InstallmentPlan;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.sideloanlend.calc.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-25 15:02:33
 */
public class AlipayPcreditLoanSideloanlendCalcConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 8492458557684273929L;

	/** 
	 * 试算是否准入
	 */
	@ApiField("admit")
	private Boolean admit;

	/** 
	 * 本次试算使用的营销卡券列表
	 */
	@ApiListField("coupon_code_list")
	@ApiField("string")
	private List<String> couponCodeList;

	/** 
	 * 授信总额度，单位元，保留两位小数
	 */
	@ApiField("credit_quota")
	private String creditQuota;

	/** 
	 * 试算日利率，保留6位小数
	 */
	@ApiField("daily_interest_rate")
	private String dailyInterestRate;

	/** 
	 * 支用试算扩展信息
	 */
	@ApiField("extension")
	private String extension;

	/** 
	 * 拒绝必填，支用拒绝原因code
	 */
	@ApiField("fail_reason_code")
	private String failReasonCode;

	/** 
	 * 咨询不准入时拒绝原因描述
	 */
	@ApiField("fail_reason_message")
	private String failReasonMessage;

	/** 
	 * 放款机构
	 */
	@ApiField("fund_supplier")
	private SideloanInstitution fundSupplier;

	/** 
	 * 还款计划明细列表
	 */
	@ApiListField("installment_plan_list")
	@ApiField("installment_plan")
	private List<InstallmentPlan> installmentPlanList;

	/** 
	 * 10.00，利息 ，单位元（如果有卡券优惠则时，则是使用优惠后的最终利息）,保留小数点后两位
	 */
	@ApiField("interest")
	private String interest;

	/** 
	 * 试算的最终的年化利率，0.18代表年化利率18%，保留小数点6位
	 */
	@ApiField("interest_rate")
	private String interestRate;

	/** 
	 * 本金 ，单位元,保留小数点后两位
	 */
	@ApiField("principal")
	private String principal;

	/** 
	 * 减免金额，由于优惠减免了多少利息
	 */
	@ApiField("promotion_amount")
	private String promotionAmount;

	/** 
	 * 还款日
	 */
	@ApiField("repayment_day")
	private Long repaymentDay;

	/** 
	 * 标识从此调用结果
	 */
	@ApiField("return_code")
	private String returnCode;

	/** 
	 * 二级错误码
	 */
	@ApiField("return_sub_code")
	private String returnSubCode;

	/** 
	 * 二级错误描述
	 */
	@ApiField("return_sub_message")
	private String returnSubMessage;

	/** 
	 * 剩余可用授信额度，单位元，保留小数点后两位
	 */
	@ApiField("surplus_quota")
	private String surplusQuota;

	/** 
	 * 总金额 ，单位元,保留小数点后两位
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public void setAdmit(Boolean admit) {
		this.admit = admit;
	}
	public Boolean getAdmit( ) {
		return this.admit;
	}

	public void setCouponCodeList(List<String> couponCodeList) {
		this.couponCodeList = couponCodeList;
	}
	public List<String> getCouponCodeList( ) {
		return this.couponCodeList;
	}

	public void setCreditQuota(String creditQuota) {
		this.creditQuota = creditQuota;
	}
	public String getCreditQuota( ) {
		return this.creditQuota;
	}

	public void setDailyInterestRate(String dailyInterestRate) {
		this.dailyInterestRate = dailyInterestRate;
	}
	public String getDailyInterestRate( ) {
		return this.dailyInterestRate;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}
	public String getExtension( ) {
		return this.extension;
	}

	public void setFailReasonCode(String failReasonCode) {
		this.failReasonCode = failReasonCode;
	}
	public String getFailReasonCode( ) {
		return this.failReasonCode;
	}

	public void setFailReasonMessage(String failReasonMessage) {
		this.failReasonMessage = failReasonMessage;
	}
	public String getFailReasonMessage( ) {
		return this.failReasonMessage;
	}

	public void setFundSupplier(SideloanInstitution fundSupplier) {
		this.fundSupplier = fundSupplier;
	}
	public SideloanInstitution getFundSupplier( ) {
		return this.fundSupplier;
	}

	public void setInstallmentPlanList(List<InstallmentPlan> installmentPlanList) {
		this.installmentPlanList = installmentPlanList;
	}
	public List<InstallmentPlan> getInstallmentPlanList( ) {
		return this.installmentPlanList;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}
	public String getInterest( ) {
		return this.interest;
	}

	public void setInterestRate(String interestRate) {
		this.interestRate = interestRate;
	}
	public String getInterestRate( ) {
		return this.interestRate;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	public String getPrincipal( ) {
		return this.principal;
	}

	public void setPromotionAmount(String promotionAmount) {
		this.promotionAmount = promotionAmount;
	}
	public String getPromotionAmount( ) {
		return this.promotionAmount;
	}

	public void setRepaymentDay(Long repaymentDay) {
		this.repaymentDay = repaymentDay;
	}
	public Long getRepaymentDay( ) {
		return this.repaymentDay;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}
	public String getReturnCode( ) {
		return this.returnCode;
	}

	public void setReturnSubCode(String returnSubCode) {
		this.returnSubCode = returnSubCode;
	}
	public String getReturnSubCode( ) {
		return this.returnSubCode;
	}

	public void setReturnSubMessage(String returnSubMessage) {
		this.returnSubMessage = returnSubMessage;
	}
	public String getReturnSubMessage( ) {
		return this.returnSubMessage;
	}

	public void setSurplusQuota(String surplusQuota) {
		this.surplusQuota = surplusQuota;
	}
	public String getSurplusQuota( ) {
		return this.surplusQuota;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

}
