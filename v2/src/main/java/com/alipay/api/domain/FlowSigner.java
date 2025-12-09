package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签署人信息
 *
 * @author auto create
 * @since 1.0, 2020-04-30 10:04:32
 */
public class FlowSigner extends AlipayObject {

	private static final long serialVersionUID = 1812293954798713364L;

	/**
	 * 创建流程时指定的企业唯一标识，仅签署主体为企业时返回
	 */
	@ApiField("org_third_party_user_id")
	private String orgThirdPartyUserId;

	/**
	 * 签署状态：0-待签, 1-未签, 2-已签 3-待审批 4-拒签
	 */
	@ApiField("sign_status")
	private Long signStatus;

	/**
	 * 签署主体类型：0-个人, 1-企业
	 */
	@ApiField("signer_account_type")
	private Long signerAccountType;

	/**
	 * 创建流程时指定个人唯一标识
	 */
	@ApiField("third_party_user_id")
	private String thirdPartyUserId;

	public String getOrgThirdPartyUserId() {
		return this.orgThirdPartyUserId;
	}
	public void setOrgThirdPartyUserId(String orgThirdPartyUserId) {
		this.orgThirdPartyUserId = orgThirdPartyUserId;
	}

	public Long getSignStatus() {
		return this.signStatus;
	}
	public void setSignStatus(Long signStatus) {
		this.signStatus = signStatus;
	}

	public Long getSignerAccountType() {
		return this.signerAccountType;
	}
	public void setSignerAccountType(Long signerAccountType) {
		this.signerAccountType = signerAccountType;
	}

	public String getThirdPartyUserId() {
		return this.thirdPartyUserId;
	}
	public void setThirdPartyUserId(String thirdPartyUserId) {
		this.thirdPartyUserId = thirdPartyUserId;
	}

}
