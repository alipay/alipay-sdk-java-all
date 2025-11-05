package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业有效授信资产查询
 *
 * @author auto create
 * @since 1.0, 2024-07-08 14:33:16
 */
public class AlipayCommerceEcAssetValidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3193246522453145366L;

	/**
	 * 共同账户ID 当前字段已废弃(历史兼容逻辑冗余字段增加了接口复杂性，统一移除)
	 */
	@ApiField("account_id")
	@Deprecated
	private String accountId;

	/**
	 * 授权签约协议号 当前字段已废弃(历史兼容逻辑冗余字段增加了接口复杂性，统一移除)
	 */
	@ApiField("agreement_no")
	@Deprecated
	private String agreementNo;

	/**
	 * 企业Id，企业入驻企业码时自动分配的用于唯一标识的编号
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

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

}
