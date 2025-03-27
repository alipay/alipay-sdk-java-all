package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 随身贷支用申请
 *
 * @author auto create
 * @since 1.0, 2024-12-02 17:42:10
 */
public class AlipayPcreditLoanSideloanlendLendApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2795544816717135863L;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 客户指定放款卡场景使用，绑卡唯一id
	 */
	@ApiField("bank_card_id")
	private String bankCardId;

	/**
	 * 扩展字段JSON String
	 */
	@ApiField("extension")
	private String extension;

	/**
	 * 贷款金额（单位：元）保留小数点后两位
	 */
	@ApiField("loan_amount")
	private String loanAmount;

	/**
	 * 阿里贷款申请编号，唯一单号，幂等键，长度32
	 */
	@ApiField("loan_apply_no")
	private String loanApplyNo;

	/**
	 * 以阿里侧贷款用途为准
	 */
	@ApiField("loan_purpose")
	private String loanPurpose;

	/**
	 * 贷款期限 6/11/12
	 */
	@ApiField("loan_term")
	private Long loanTerm;

	/**
	 * 贷款期限单位
MONTH -- "月"
DAY -- "日"
TERM -- “期”
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
	 * 固定还款日
	 */
	@ApiField("repayment_day")
	private Long repaymentDay;

	/**
	 * 还款方式，枚举值
AVERAGE_CAPITAL_PLUS_INTEREST等额本息
AVERAGE_CAPITAL等额本金
BALLOON_MORTGAGE按期付息到期还本
REPAY_OUTRIGHT一次性到期还本付息
	 */
	@ApiField("repayment_method")
	private String repaymentMethod;

	/**
	 * 待补充
	 */
	@ApiField("verify_id")
	private String verifyId;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getBankCardId() {
		return this.bankCardId;
	}
	public void setBankCardId(String bankCardId) {
		this.bankCardId = bankCardId;
	}

	public String getExtension() {
		return this.extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getLoanAmount() {
		return this.loanAmount;
	}
	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getLoanApplyNo() {
		return this.loanApplyNo;
	}
	public void setLoanApplyNo(String loanApplyNo) {
		this.loanApplyNo = loanApplyNo;
	}

	public String getLoanPurpose() {
		return this.loanPurpose;
	}
	public void setLoanPurpose(String loanPurpose) {
		this.loanPurpose = loanPurpose;
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

	public Long getRepaymentDay() {
		return this.repaymentDay;
	}
	public void setRepaymentDay(Long repaymentDay) {
		this.repaymentDay = repaymentDay;
	}

	public String getRepaymentMethod() {
		return this.repaymentMethod;
	}
	public void setRepaymentMethod(String repaymentMethod) {
		this.repaymentMethod = repaymentMethod;
	}

	public String getVerifyId() {
		return this.verifyId;
	}
	public void setVerifyId(String verifyId) {
		this.verifyId = verifyId;
	}

}
