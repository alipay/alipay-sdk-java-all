package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GrantBankCard;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.sideloanlend.lend.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-25 15:02:33
 */
public class AlipayPcreditLoanSideloanlendLendApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6417782417937667339L;

	/** 
	 * loanStatus=FAILED支用失败，拒绝原因码
	 */
	@ApiField("fail_reason_code")
	private String failReasonCode;

	/** 
	 * 描述拒绝的原因
	 */
	@ApiField("fail_reason_message")
	private String failReasonMessage;

	/** 
	 * 待补充
	 */
	@ApiField("institution_loan_apply_no")
	private String institutionLoanApplyNo;

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
	 * 放款时间，事件发生时间（格式yyyy-MM-dd HH:mm:ss）
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
	 * returnCode为FAIL或者NEED_RETRY状态下，返回具体错误码
注意：支用通过与否通过异步通知
	 */
	@ApiField("return_sub_code")
	private String returnSubCode;

	/** 
	 * 详细描述失败原因，方便双方定位问题
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

	public void setInstitutionLoanApplyNo(String institutionLoanApplyNo) {
		this.institutionLoanApplyNo = institutionLoanApplyNo;
	}
	public String getInstitutionLoanApplyNo( ) {
		return this.institutionLoanApplyNo;
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
