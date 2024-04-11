package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业授权申请
 *
 * @author auto create
 * @since 1.0, 2023-08-28 21:01:42
 */
public class AlipayCommerceEcContractAuthorizeApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5435912418887511536L;

	/**
	 * 共同账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 可通过签约消息获取。配合account_id使用，当填写企业共同账户id时，此字段必填
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 企业申请授权的场景码。枚举值 三方代调用授权：THIRD_PARTY_INVOKE_AUTH
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
