package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SideloanInstitution;
import com.alipay.api.domain.GrantBankCard;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.sideloanlend.apply.querystatus response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-25 15:47:28
 */
public class AlipayPcreditLoanSideloanlendApplyQuerystatusResponse extends AlipayResponse {

	private static final long serialVersionUID = 6555958729547137921L;

	/** 
	 * 风险拒绝
	 */
	@ApiField("fail_reason_code")
	private String failReasonCode;

	/** 
	 * 描述拒绝的原因
	 */
	@ApiField("fail_reason_message")
	private String failReasonMessage;

	/** 
	 * 放款机构信息
	 */
	@ApiField("fund_supplier")
	private SideloanInstitution fundSupplier;

	/** 
	 * 机构支用申请单号
	 */
	@ApiField("institution_loan_apply_no")
	private String institutionLoanApplyNo;

	/** 
	 * 机构支用借据号，支用成功必填
	 */
	@ApiField("institution_loan_no")
	private String institutionLoanNo;

	/** 
	 * 贷款金额（单位：元）保留小数点后两位
	 */
	@ApiField("loan_amount")
	private String loanAmount;

	/** 
	 * 放款银行卡信息
	 */
	@ApiField("loan_bank_card")
	private GrantBankCard loanBankCard;

	/** 
	 * 支用状态
LOANED - 支用成功
FAILED - 支用失败
LOANING - 支用处理中，除了成功和失败之外的中间状态
	 */
	@ApiField("loan_status")
	private String loanStatus;

	/** 
	 * 放款时间，放款成功时必填，事件发生时间（格式yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("loan_time")
	private Date loanTime;

	/** 
	 * 表示请求处理状态。可选值：
SUCCESS - 成功
NEED_RETRY - 需要重试
FAIL - 不可重试
	 */
	@ApiField("return_code")
	private String returnCode;

	/** 
	 * returnCode为FAIL或者NEED_RETRY状态下，返回具体错误码，比如接口参数错误，下游系统异常等
	 */
	@ApiField("return_sub_code")
	private String returnSubCode;

	/** 
	 * 可以详细描述失败原因，方便双方定位问题
	 */
	@ApiField("return_sub_message")
	private String returnSubMessage;

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

	public void setInstitutionLoanApplyNo(String institutionLoanApplyNo) {
		this.institutionLoanApplyNo = institutionLoanApplyNo;
	}
	public String getInstitutionLoanApplyNo( ) {
		return this.institutionLoanApplyNo;
	}

	public void setInstitutionLoanNo(String institutionLoanNo) {
		this.institutionLoanNo = institutionLoanNo;
	}
	public String getInstitutionLoanNo( ) {
		return this.institutionLoanNo;
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

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
	public String getLoanStatus( ) {
		return this.loanStatus;
	}

	public void setLoanTime(Date loanTime) {
		this.loanTime = loanTime;
	}
	public Date getLoanTime( ) {
		return this.loanTime;
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

}
