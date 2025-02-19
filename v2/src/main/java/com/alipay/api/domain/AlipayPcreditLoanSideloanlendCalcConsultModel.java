package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 随身贷支用试算
 *
 * @author auto create
 * @since 1.0, 2024-12-10 11:28:20
 */
public class AlipayPcreditLoanSideloanlendCalcConsultModel extends AlipayObject {

	private static final long serialVersionUID = 8721651557478513418L;

	/**
	 * 支付宝用户id，客户在支付宝的身份证
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 试算总金额 单位元，保留两位小数
	 */
	@ApiField("apply_loan_amount")
	private String applyLoanAmount;

	/**
	 * 待补充
	 */
	@ApiField("extension")
	private String extension;

	/**
	 * 支用期限，配合支用期限单位 loan_term_unit使用
	 */
	@ApiField("loan_term")
	private Long loanTerm;

	/**
	 * 贷款期限单位
MONTH -- "月"
DAY -- "日"
	 */
	@ApiField("loan_term_unit")
	private String loanTermUnit;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 蚂蚁借贷款产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 试算方式
AVERAGE_CAPITAL_PLUS_INTEREST等额本息
AVERAGE_CAPITAL等额本金
BALLOON_MORTGAGE按期付息到期还本
	 */
	@ApiField("repayment_method")
	private String repaymentMethod;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getApplyLoanAmount() {
		return this.applyLoanAmount;
	}
	public void setApplyLoanAmount(String applyLoanAmount) {
		this.applyLoanAmount = applyLoanAmount;
	}

	public String getExtension() {
		return this.extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}

	public Long getLoanTerm() {
		return this.loanTerm;
	}
	public void setLoanTerm(Long loanTerm) {
		this.loanTerm = loanTerm;
	}

	public String getLoanTermUnit() {
		return this.loanTermUnit;
	}
	public void setLoanTermUnit(String loanTermUnit) {
		this.loanTermUnit = loanTermUnit;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRepaymentMethod() {
		return this.repaymentMethod;
	}
	public void setRepaymentMethod(String repaymentMethod) {
		this.repaymentMethod = repaymentMethod;
	}

}
