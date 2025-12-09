package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 随身贷支用申请
 *
 * @author auto create
 * @since 1.0, 2025-12-04 11:27:16
 */
public class AlipayPcreditLoanSideloanlendLendApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8282563925312753246L;

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
	 * 候选授信机构列表
	 */
	@ApiListField("candidate_credit_fund_supplier_list")
	@ApiField("institution_v_o")
	private List<InstitutionVO> candidateCreditFundSupplierList;

	/**
	 * 营销卡券Code列表,不能超过100个
	 */
	@ApiListField("coupon_code_list")
	@ApiField("string")
	private List<String> couponCodeList;

	/**
	 * 渠道侧授信申请单号
	 */
	@ApiField("credit_apply_no")
	private String creditApplyNo;

	/**
	 * 扩展字段JSON String
	 */
	@ApiField("extension")
	private String extension;

	/**
	 * 支用扩展处理(目前有支用拒绝转签TRANSFER_CREDIT)
	 */
	@ApiField("loan_additional_process")
	private String loanAdditionalProcess;

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
	 * 优惠利息，单位元，保留2位小数
	 */
	@ApiField("promotion_amount")
	private String promotionAmount;

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

	public List<InstitutionVO> getCandidateCreditFundSupplierList() {
		return this.candidateCreditFundSupplierList;
	}
	public void setCandidateCreditFundSupplierList(List<InstitutionVO> candidateCreditFundSupplierList) {
		this.candidateCreditFundSupplierList = candidateCreditFundSupplierList;
	}

	public List<String> getCouponCodeList() {
		return this.couponCodeList;
	}
	public void setCouponCodeList(List<String> couponCodeList) {
		this.couponCodeList = couponCodeList;
	}

	public String getCreditApplyNo() {
		return this.creditApplyNo;
	}
	public void setCreditApplyNo(String creditApplyNo) {
		this.creditApplyNo = creditApplyNo;
	}

	public String getExtension() {
		return this.extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getLoanAdditionalProcess() {
		return this.loanAdditionalProcess;
	}
	public void setLoanAdditionalProcess(String loanAdditionalProcess) {
		this.loanAdditionalProcess = loanAdditionalProcess;
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

	public String getPromotionAmount() {
		return this.promotionAmount;
	}
	public void setPromotionAmount(String promotionAmount) {
		this.promotionAmount = promotionAmount;
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
