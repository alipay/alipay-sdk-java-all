package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.remit.fund.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:29:05
 */
public class AlipayOverseasRemitFundInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 7223148219937375237L;

	/** 
	 * 合规检查的业务结果
	 */
	@ApiField("compliance_check_result")
	private String complianceCheckResult;

	/** 
	 * 合规检查的所有结果
	 */
	@ApiField("compliance_check_result_info")
	private String complianceCheckResultInfo;

	/** 
	 * 合规检查结果的签名
	 */
	@ApiField("compliance_result_signature")
	private String complianceResultSignature;

	/** 
	 * 扩展信息
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/** 
	 * 外部单据号
	 */
	@ApiField("external_biz_no")
	private String externalBizNo;

	/** 
	 * 接收端的mid
	 */
	@ApiField("receiver_mid")
	private String receiverMid;

	/** 
	 * 发端的mid
	 */
	@ApiField("sender_mid")
	private String senderMid;

	public void setComplianceCheckResult(String complianceCheckResult) {
		this.complianceCheckResult = complianceCheckResult;
	}
	public String getComplianceCheckResult( ) {
		return this.complianceCheckResult;
	}

	public void setComplianceCheckResultInfo(String complianceCheckResultInfo) {
		this.complianceCheckResultInfo = complianceCheckResultInfo;
	}
	public String getComplianceCheckResultInfo( ) {
		return this.complianceCheckResultInfo;
	}

	public void setComplianceResultSignature(String complianceResultSignature) {
		this.complianceResultSignature = complianceResultSignature;
	}
	public String getComplianceResultSignature( ) {
		return this.complianceResultSignature;
	}

	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}
	public String getExtendInfo( ) {
		return this.extendInfo;
	}

	public void setExternalBizNo(String externalBizNo) {
		this.externalBizNo = externalBizNo;
	}
	public String getExternalBizNo( ) {
		return this.externalBizNo;
	}

	public void setReceiverMid(String receiverMid) {
		this.receiverMid = receiverMid;
	}
	public String getReceiverMid( ) {
		return this.receiverMid;
	}

	public void setSenderMid(String senderMid) {
		this.senderMid = senderMid;
	}
	public String getSenderMid( ) {
		return this.senderMid;
	}

}
