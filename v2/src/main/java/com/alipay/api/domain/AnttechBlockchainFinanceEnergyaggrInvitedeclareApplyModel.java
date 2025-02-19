package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 负荷聚合需求响应邀约申报申请
 *
 * @author auto create
 * @since 1.0, 2024-12-02 10:48:28
 */
public class AnttechBlockchainFinanceEnergyaggrInvitedeclareApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7866266576664416219L;

	/**
	 * 是否需要申报
	 */
	@ApiField("declare_flag")
	private Boolean declareFlag;

	/**
	 * 产品合约码
	 */
	@ApiField("product_agreement_code")
	private String productAgreementCode;

	/**
	 * 子邀约ID
	 */
	@ApiField("sub_invite_id")
	private String subInviteId;

	/**
	 * 申报目标调节负荷
	 */
	@ApiListField("target_adjustment")
	@ApiField("load_info_node")
	private List<LoadInfoNode> targetAdjustment;

	public Boolean getDeclareFlag() {
		return this.declareFlag;
	}
	public void setDeclareFlag(Boolean declareFlag) {
		this.declareFlag = declareFlag;
	}

	public String getProductAgreementCode() {
		return this.productAgreementCode;
	}
	public void setProductAgreementCode(String productAgreementCode) {
		this.productAgreementCode = productAgreementCode;
	}

	public String getSubInviteId() {
		return this.subInviteId;
	}
	public void setSubInviteId(String subInviteId) {
		this.subInviteId = subInviteId;
	}

	public List<LoadInfoNode> getTargetAdjustment() {
		return this.targetAdjustment;
	}
	public void setTargetAdjustment(List<LoadInfoNode> targetAdjustment) {
		this.targetAdjustment = targetAdjustment;
	}

}
