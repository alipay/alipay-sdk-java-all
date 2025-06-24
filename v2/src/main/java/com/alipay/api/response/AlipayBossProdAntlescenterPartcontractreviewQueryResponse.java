package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.antlescenter.partcontractreview.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-14 15:52:06
 */
public class AlipayBossProdAntlescenterPartcontractreviewQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1161785899352197478L;

	/** 
	 * 审核结果，通过：true，拒绝：false。
	 */
	@ApiField("audit_res")
	private Boolean auditRes;

	/** 
	 * 审核时间
	 */
	@ApiField("audit_time")
	private Date auditTime;

	/** 
	 * 审核人工号
	 */
	@ApiField("audit_work_no")
	private String auditWorkNo;

	/** 
	 * 合同编号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/** 
	 * 审核不通过原因
	 */
	@ApiField("reason")
	private String reason;

	/** 
	 * 签约任务流水号
	 */
	@ApiField("sign_flow_id")
	private String signFlowId;

	/** 
	 * 建议
	 */
	@ApiField("suggest_info")
	private String suggestInfo;

	public void setAuditRes(Boolean auditRes) {
		this.auditRes = auditRes;
	}
	public Boolean getAuditRes( ) {
		return this.auditRes;
	}

	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}
	public Date getAuditTime( ) {
		return this.auditTime;
	}

	public void setAuditWorkNo(String auditWorkNo) {
		this.auditWorkNo = auditWorkNo;
	}
	public String getAuditWorkNo( ) {
		return this.auditWorkNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	public String getContractNo( ) {
		return this.contractNo;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getReason( ) {
		return this.reason;
	}

	public void setSignFlowId(String signFlowId) {
		this.signFlowId = signFlowId;
	}
	public String getSignFlowId( ) {
		return this.signFlowId;
	}

	public void setSuggestInfo(String suggestInfo) {
		this.suggestInfo = suggestInfo;
	}
	public String getSuggestInfo( ) {
		return this.suggestInfo;
	}

}
