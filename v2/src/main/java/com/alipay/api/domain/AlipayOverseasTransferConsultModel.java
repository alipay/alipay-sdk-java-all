package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 跨境汇款
 *
 * @author auto create
 * @since 1.0, 2023-01-10 17:15:11
 */
public class AlipayOverseasTransferConsultModel extends AlipayObject {

	private static final long serialVersionUID = 1147575261193124547L;

	/**
	 * 汇款相关信息
	 */
	@ApiField("additional_transfer_details")
	private String additionalTransferDetails;

	/**
	 * 收端用户收款的方式
	 */
	@ApiField("beneficiary_receipt_method")
	private String beneficiaryReceiptMethod;

	/**
	 * 业务类型
	 */
	@ApiField("biz_scene_type")
	private String bizSceneType;

	/**
	 * 透传信息
	 */
	@ApiField("pass_through_info")
	private String passThroughInfo;

	/**
	 * 发端机构id
	 */
	@ApiField("payer_agent_id")
	private String payerAgentId;

	/**
	 * 汇出金额
	 */
	@ApiField("transfer_to_amount")
	private Money transferToAmount;

	public String getAdditionalTransferDetails() {
		return this.additionalTransferDetails;
	}
	public void setAdditionalTransferDetails(String additionalTransferDetails) {
		this.additionalTransferDetails = additionalTransferDetails;
	}

	public String getBeneficiaryReceiptMethod() {
		return this.beneficiaryReceiptMethod;
	}
	public void setBeneficiaryReceiptMethod(String beneficiaryReceiptMethod) {
		this.beneficiaryReceiptMethod = beneficiaryReceiptMethod;
	}

	public String getBizSceneType() {
		return this.bizSceneType;
	}
	public void setBizSceneType(String bizSceneType) {
		this.bizSceneType = bizSceneType;
	}

	public String getPassThroughInfo() {
		return this.passThroughInfo;
	}
	public void setPassThroughInfo(String passThroughInfo) {
		this.passThroughInfo = passThroughInfo;
	}

	public String getPayerAgentId() {
		return this.payerAgentId;
	}
	public void setPayerAgentId(String payerAgentId) {
		this.payerAgentId = payerAgentId;
	}

	public Money getTransferToAmount() {
		return this.transferToAmount;
	}
	public void setTransferToAmount(Money transferToAmount) {
		this.transferToAmount = transferToAmount;
	}

}
