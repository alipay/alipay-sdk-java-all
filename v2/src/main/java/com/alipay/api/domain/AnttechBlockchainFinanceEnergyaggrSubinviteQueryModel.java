package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 负荷聚合需求响应子邀约查询
 *
 * @author auto create
 * @since 1.0, 2024-12-02 10:48:27
 */
public class AnttechBlockchainFinanceEnergyaggrSubinviteQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6743371687732183968L;

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

}
