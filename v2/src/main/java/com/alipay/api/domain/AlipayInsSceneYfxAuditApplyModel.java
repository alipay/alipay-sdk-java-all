package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运费险理赔重开申请
 *
 * @author auto create
 * @since 1.0, 2023-10-24 14:43:43
 */
public class AlipayInsSceneYfxAuditApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4367916267935973656L;

	/**
	 * 开放平台分配的appid
	 */
	@ApiField("app_key")
	private String appKey;

	/**
	 * 理赔单号
	 */
	@ApiField("claim_no")
	private String claimNo;

	/**
	 * 操作员
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 拒绝原因
	 */
	@ApiField("refuse_reason")
	private String refuseReason;

	public String getAppKey() {
		return this.appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getClaimNo() {
		return this.claimNo;
	}
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getRefuseReason() {
		return this.refuseReason;
	}
	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}

}
