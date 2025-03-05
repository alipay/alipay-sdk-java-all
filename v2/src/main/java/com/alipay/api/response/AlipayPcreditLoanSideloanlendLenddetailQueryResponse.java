package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SideloanInstitution;
import com.alipay.api.domain.LendInstallment;
import com.alipay.api.domain.GrantBankCard;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.sideloanlend.lenddetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-10 11:28:21
 */
public class AlipayPcreditLoanSideloanlendLenddetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6251554963941554563L;

	/** 
	 * 放款资方，贷款实际出资机构
	 */
	@ApiField("fund_supplier")
	private SideloanInstitution fundSupplier;

	/** 
	 * 分期详情列表
	 */
	@ApiListField("installment_list")
	@ApiField("lend_installment")
	private List<LendInstallment> installmentList;

	/** 
	 * 机构支用借据号
	 */
	@ApiField("institution_loan_no")
	private String institutionLoanNo;

	/** 
	 * 实际执行年化利率，小数点保留6位
	 */
	@ApiField("interest_rate")
	private String interestRate;

	/** 
	 * 支用放款金额，单位元
	 */
	@ApiField("loan_amount")
	private String loanAmount;

	/** 
	 * 客户收放款的卡
	 */
	@ApiField("loan_bank_card")
	private GrantBankCard loanBankCard;

	/** 
	 * 到期日 日期格式是：yyyy-mm-dd hh:mi:ss
	 */
	@ApiField("loan_end_date")
	private Date loanEndDate;

	/** 
	 * 支用日(放款日) 日期格式是：yyyy-mm-dd hh:mi:ss
	 */
	@ApiField("loan_start_date")
	private Date loanStartDate;

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
	 * 每期固定还款日，1到28
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
	 * 表示请求处理状态。可选值：
SUCCESS - 成功
NEED_RETRY - 需要重试
FAIL - 不可重试
	 */
	@ApiField("return_code")
	private String returnCode;

	/** 
	 * returnCode为FAIL或者NEED_RETRY状态下，返回具体错误码
	 */
	@ApiField("return_sub_code")
	private String returnSubCode;

	/** 
	 * 可以详细描述失败原因，方便双方定位问题
	 */
	@ApiField("return_sub_message")
	private String returnSubMessage;

	/** 
	 * 借据状态：
NEW 正常
OVERDUE 预期
SETTLED 结清
	 */
	@ApiField("status")
	private String status;

	public void setFundSupplier(SideloanInstitution fundSupplier) {
		this.fundSupplier = fundSupplier;
	}
	public SideloanInstitution getFundSupplier( ) {
		return this.fundSupplier;
	}

	public void setInstallmentList(List<LendInstallment> installmentList) {
		this.installmentList = installmentList;
	}
	public List<LendInstallment> getInstallmentList( ) {
		return this.installmentList;
	}

	public void setInstitutionLoanNo(String institutionLoanNo) {
		this.institutionLoanNo = institutionLoanNo;
	}
	public String getInstitutionLoanNo( ) {
		return this.institutionLoanNo;
	}

	public void setInterestRate(String interestRate) {
		this.interestRate = interestRate;
	}
	public String getInterestRate( ) {
		return this.interestRate;
	}

	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getLoanAmount( ) {
		return this.loanAmount;
	}

	public void setLoanBankCard(GrantBankCard loanBankCard) {
		this.loanBankCard = loanBankCard;
	}
	public GrantBankCard getLoanBankCard( ) {
		return this.loanBankCard;
	}

	public void setLoanEndDate(Date loanEndDate) {
		this.loanEndDate = loanEndDate;
	}
	public Date getLoanEndDate( ) {
		return this.loanEndDate;
	}

	public void setLoanStartDate(Date loanStartDate) {
		this.loanStartDate = loanStartDate;
	}
	public Date getLoanStartDate( ) {
		return this.loanStartDate;
	}

	public void setLoanTerm(Long loanTerm) {
		this.loanTerm = loanTerm;
	}
	public Long getLoanTerm( ) {
		return this.loanTerm;
	}

	public void setLoanTermUnit(String loanTermUnit) {
		this.loanTermUnit = loanTermUnit;
	}
	public String getLoanTermUnit( ) {
		return this.loanTermUnit;
	}

	public void setRepaymentDay(Long repaymentDay) {
		this.repaymentDay = repaymentDay;
	}
	public Long getRepaymentDay( ) {
		return this.repaymentDay;
	}

	public void setRepaymentMethod(String repaymentMethod) {
		this.repaymentMethod = repaymentMethod;
	}
	public String getRepaymentMethod( ) {
		return this.repaymentMethod;
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

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
