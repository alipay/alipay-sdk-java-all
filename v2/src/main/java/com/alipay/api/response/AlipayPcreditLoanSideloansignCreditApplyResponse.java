package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.sideloansign.credit.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-25 15:02:33
 */
public class AlipayPcreditLoanSideloansignCreditApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4499493926786529794L;

	/** 
	 * 冷静期类型
	 */
	@ApiField("cool_off_type")
	private String coolOffType;

	/** 
	 * 授信申请状态
	 */
	@ApiField("credit_status")
	private String creditStatus;

	/** 
	 * 业务原因编码
	 */
	@ApiField("fail_reason_code")
	private String failReasonCode;

	/** 
	 * 业务失败原因描述
	 */
	@ApiField("fail_reason_message")
	private String failReasonMessage;

	/** 
	 * 机构支用申请单号，成功受理时返回
	 */
	@ApiField("institution_loan_apply_no")
	private String institutionLoanApplyNo;

	/** 
	 * 表示请求处理状态
	 */
	@ApiField("return_code")
	private String returnCode;

	/** 
	 * return_code为FAIL或者NEED_RETRY状态下，返回具体错误码。注意：支用通过与否通过异步通知
	 */
	@ApiField("return_sub_code")
	private String returnSubCode;

	/** 
	 * 可以详细描述失败原因，方便双方定位问题
	 */
	@ApiField("return_sub_message")
	private String returnSubMessage;

	public void setCoolOffType(String coolOffType) {
		this.coolOffType = coolOffType;
	}
	public String getCoolOffType( ) {
		return this.coolOffType;
	}

	public void setCreditStatus(String creditStatus) {
		this.creditStatus = creditStatus;
	}
	public String getCreditStatus( ) {
		return this.creditStatus;
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

	public void setInstitutionLoanApplyNo(String institutionLoanApplyNo) {
		this.institutionLoanApplyNo = institutionLoanApplyNo;
	}
	public String getInstitutionLoanApplyNo( ) {
		return this.institutionLoanApplyNo;
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
