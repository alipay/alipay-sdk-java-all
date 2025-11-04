package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 随身贷支用试算
 *
 * @author auto create
 * @since 1.0, 2025-07-25 14:59:44
 */
public class AlipayPcreditLoanSideloanlendCalcConsultModel extends AlipayObject {

	private static final long serialVersionUID = 2352994598618782473L;

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
	 * 端上请求时间（时间戳，精确到毫秒）
	 */
	@ApiField("calc_time")
	private String calcTime;

	/**
	 * 营销卡券Code列表，传权益实例ID列表，试算接口从列表中可选的卡券进行试算
	 */
	@ApiListField("coupon_code_list")
	@ApiField("string")
	private List<String> couponCodeList;

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
	 * 支用类型
	 */
	@ApiField("loan_type")
	private String loanType;

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

	public String getCalcTime() {
		return this.calcTime;
	}
	public void setCalcTime(String calcTime) {
		this.calcTime = calcTime;
	}

	public List<String> getCouponCodeList() {
		return this.couponCodeList;
	}
	public void setCouponCodeList(List<String> couponCodeList) {
		this.couponCodeList = couponCodeList;
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

	public String getLoanType() {
		return this.loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
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
