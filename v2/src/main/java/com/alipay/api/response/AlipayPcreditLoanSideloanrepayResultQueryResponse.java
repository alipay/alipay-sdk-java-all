package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RepayLoanDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.sideloanrepay.result.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-27 11:52:26
 */
public class AlipayPcreditLoanSideloanrepayResultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4365388677334545395L;

	/** 
	 * 还款失败的金额(单位元)。精确小数点后2位。主动还款部分成功部分失败时，此值必传
	 */
	@ApiField("charge_back_amount")
	private String chargeBackAmount;

	/** 
	 * 还款失败原因编码
	 */
	@ApiField("fail_reason_code")
	private String failReasonCode;

	/** 
	 * 还款失败原因描述
	 */
	@ApiField("fail_reason_message")
	private String failReasonMessage;

	/** 
	 * 蚂蚁还款受理单号，蚂蚁侧生成
	 */
	@ApiField("institution_repayment_no")
	private String institutionRepaymentNo;

	/** 
	 * 还款利息，单位：元，精度：保留两位小数；还款成功时返回。
	 */
	@ApiField("repaid_interest")
	private String repaidInterest;

	/** 
	 * 还款罚息（本罚+利罚），单位：元，精度：保留两位小数；还款成功时返回。
	 */
	@ApiField("repaid_penalty")
	private String repaidPenalty;

	/** 
	 * 还款本金，单位：元，精度：保留两位小数；还款成功时返回。
	 */
	@ApiField("repaid_principal")
	private String repaidPrincipal;

	/** 
	 * 还款成功时间，还款成功时返回（格式yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("repaid_time")
	private Date repaidTime;

	/** 
	 * 还款总额，单位：元，精度：保留两位小数。还款成功时返回。
	 */
	@ApiField("repaid_total_amount")
	private String repaidTotalAmount;

	/** 
	 * 还款申请单号，外部渠道生成
	 */
	@ApiField("repay_apply_no")
	private String repayApplyNo;

	/** 
	 * 还款发起方。
ALI:阿里侧发起还款
INSTITUTION:机构侧发起（批扣或客户在机构侧发起）
	 */
	@ApiField("repay_initiator")
	private String repayInitiator;

	/** 
	 * 还款详情信息，借据维度还款详情列表
	 */
	@ApiListField("repay_loan_detail_list")
	@ApiField("repay_loan_detail")
	private List<RepayLoanDetail> repayLoanDetailList;

	/** 
	 * 还款状态，用来描述还款状态。
SUCCESS - 还款成功
PROCESSING - 还款中
FAILED - 还款失败
	 */
	@ApiField("repay_status")
	private String repayStatus;

	/** 
	 * 表示请求处理状态。 
SUCCESS - 成功 
NEED_RETRY -需要重试 
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

	public void setChargeBackAmount(String chargeBackAmount) {
		this.chargeBackAmount = chargeBackAmount;
	}
	public String getChargeBackAmount( ) {
		return this.chargeBackAmount;
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

	public void setInstitutionRepaymentNo(String institutionRepaymentNo) {
		this.institutionRepaymentNo = institutionRepaymentNo;
	}
	public String getInstitutionRepaymentNo( ) {
		return this.institutionRepaymentNo;
	}

	public void setRepaidInterest(String repaidInterest) {
		this.repaidInterest = repaidInterest;
	}
	public String getRepaidInterest( ) {
		return this.repaidInterest;
	}

	public void setRepaidPenalty(String repaidPenalty) {
		this.repaidPenalty = repaidPenalty;
	}
	public String getRepaidPenalty( ) {
		return this.repaidPenalty;
	}

	public void setRepaidPrincipal(String repaidPrincipal) {
		this.repaidPrincipal = repaidPrincipal;
	}
	public String getRepaidPrincipal( ) {
		return this.repaidPrincipal;
	}

	public void setRepaidTime(Date repaidTime) {
		this.repaidTime = repaidTime;
	}
	public Date getRepaidTime( ) {
		return this.repaidTime;
	}

	public void setRepaidTotalAmount(String repaidTotalAmount) {
		this.repaidTotalAmount = repaidTotalAmount;
	}
	public String getRepaidTotalAmount( ) {
		return this.repaidTotalAmount;
	}

	public void setRepayApplyNo(String repayApplyNo) {
		this.repayApplyNo = repayApplyNo;
	}
	public String getRepayApplyNo( ) {
		return this.repayApplyNo;
	}

	public void setRepayInitiator(String repayInitiator) {
		this.repayInitiator = repayInitiator;
	}
	public String getRepayInitiator( ) {
		return this.repayInitiator;
	}

	public void setRepayLoanDetailList(List<RepayLoanDetail> repayLoanDetailList) {
		this.repayLoanDetailList = repayLoanDetailList;
	}
	public List<RepayLoanDetail> getRepayLoanDetailList( ) {
		return this.repayLoanDetailList;
	}

	public void setRepayStatus(String repayStatus) {
		this.repayStatus = repayStatus;
	}
	public String getRepayStatus( ) {
		return this.repayStatus;
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
