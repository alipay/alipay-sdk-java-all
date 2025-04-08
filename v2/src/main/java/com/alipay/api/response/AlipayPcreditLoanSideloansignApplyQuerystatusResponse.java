package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.sideloansign.apply.querystatus response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-10 11:32:24
 */
public class AlipayPcreditLoanSideloansignApplyQuerystatusResponse extends AlipayResponse {

	private static final long serialVersionUID = 1756962348514343988L;

	/** 
	 * 授信成功后返回，授信总额度，单位元，保留两位小数
	 */
	@ApiField("credit_quota")
	private String creditQuota;

	/** 
	 * 用户授信申请状态
	 */
	@ApiField("credit_status")
	private String creditStatus;

	/** 
	 * 授信通过时间（格式yyyy-MM-ddHH:mm:ss ）
	 */
	@ApiField("credit_time")
	private Date creditTime;

	/** 
	 * 授信失效日期
	 */
	@ApiField("end_time")
	private Date endTime;

	/** 
	 * 授信申请失败时返回拒绝原因码
	 */
	@ApiField("fail_reason_code")
	private String failReasonCode;

	/** 
	 * 返回失败原因描述
	 */
	@ApiField("fail_reason_message")
	private String failReasonMessage;

	/** 
	 * 授信机构编码
	 */
	@ApiField("fund_supplier_code")
	private String fundSupplierCode;

	/** 
	 * 蚂蚁授信申请受理单号
	 */
	@ApiField("institution_credit_apply_no")
	private String institutionCreditApplyNo;

	/** 
	 * 授信拒绝后，下次可以申请的时间 永远不允许是
9999-12-31 23:59:59
	 */
	@ApiField("next_available_apply_time")
	private Date nextAvailableApplyTime;

	/** 
	 * 请求的处理结果状态，可选值：
SUCCESS - 成功
NEED_RETRY - 需要重试
FAIL - 不可重试
	 */
	@ApiField("return_code")
	private String returnCode;

	/** 
	 * returnCode为FAIL或者
NEED_RETRY状态下，返回具体
错误码
	 */
	@ApiField("return_sub_code")
	private String returnSubCode;

	/** 
	 * 对returnSubCode失败的具体详情
	 */
	@ApiField("return_sub_message")
	private String returnSubMessage;

	/** 
	 * 授信生效日期
	 */
	@ApiField("start_time")
	private Date startTime;

	public void setCreditQuota(String creditQuota) {
		this.creditQuota = creditQuota;
	}
	public String getCreditQuota( ) {
		return this.creditQuota;
	}

	public void setCreditStatus(String creditStatus) {
		this.creditStatus = creditStatus;
	}
	public String getCreditStatus( ) {
		return this.creditStatus;
	}

	public void setCreditTime(Date creditTime) {
		this.creditTime = creditTime;
	}
	public Date getCreditTime( ) {
		return this.creditTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Date getEndTime( ) {
		return this.endTime;
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

	public void setFundSupplierCode(String fundSupplierCode) {
		this.fundSupplierCode = fundSupplierCode;
	}
	public String getFundSupplierCode( ) {
		return this.fundSupplierCode;
	}

	public void setInstitutionCreditApplyNo(String institutionCreditApplyNo) {
		this.institutionCreditApplyNo = institutionCreditApplyNo;
	}
	public String getInstitutionCreditApplyNo( ) {
		return this.institutionCreditApplyNo;
	}

	public void setNextAvailableApplyTime(Date nextAvailableApplyTime) {
		this.nextAvailableApplyTime = nextAvailableApplyTime;
	}
	public Date getNextAvailableApplyTime( ) {
		return this.nextAvailableApplyTime;
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

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getStartTime( ) {
		return this.startTime;
	}

}
