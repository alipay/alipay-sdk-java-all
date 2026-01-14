package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.claim.overdue.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-24 09:57:41
 */
public class AlipayInsSceneClaimOverdueQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5362377694949684989L;

	/** 
	 * 追偿金额，单位（分）
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 赔案单号
	 */
	@ApiField("claim_no")
	private String claimNo;

	/** 
	 * 外部订单单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/** 
	 * 追偿完成时间
	 */
	@ApiField("overdue_finished_time")
	private Date overdueFinishedTime;

	/** 
	 * 追偿单号
	 */
	@ApiField("overdue_no")
	private String overdueNo;

	/** 
	 * 合作商标识
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/** 
	 * 支付流水号
	 */
	@ApiField("pay_flow_id")
	private String payFlowId;

	/** 
	 * 支付类型
	 */
	@ApiField("pay_flow_type")
	private String payFlowType;

	/** 
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/** 
	 * 报案单号
	 */
	@ApiField("report_no")
	private String reportNo;

	/** 
	 * 状态
	 */
	@ApiField("status")
	private String status;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}
	public String getClaimNo( ) {
		return this.claimNo;
	}

	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}
	public String getOutOrderId( ) {
		return this.outOrderId;
	}

	public void setOverdueFinishedTime(Date overdueFinishedTime) {
		this.overdueFinishedTime = overdueFinishedTime;
	}
	public Date getOverdueFinishedTime( ) {
		return this.overdueFinishedTime;
	}

	public void setOverdueNo(String overdueNo) {
		this.overdueNo = overdueNo;
	}
	public String getOverdueNo( ) {
		return this.overdueNo;
	}

	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}
	public String getPartnerOrgId( ) {
		return this.partnerOrgId;
	}

	public void setPayFlowId(String payFlowId) {
		this.payFlowId = payFlowId;
	}
	public String getPayFlowId( ) {
		return this.payFlowId;
	}

	public void setPayFlowType(String payFlowType) {
		this.payFlowType = payFlowType;
	}
	public String getPayFlowType( ) {
		return this.payFlowType;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getPolicyNo( ) {
		return this.policyNo;
	}

	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}
	public String getReportNo( ) {
		return this.reportNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
