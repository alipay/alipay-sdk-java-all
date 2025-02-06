package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业解约
 *
 * @author auto create
 * @since 1.0, 2024-07-22 17:41:52
 */
public class AlipayCommerceEcEnterpriseUnsignModel extends AlipayObject {

	private static final long serialVersionUID = 5778176333196353591L;

	/**
	 * 通过企业码1.0接口签约的共同账户，和agreement_no搭配使用。 当前字段已废弃(为兼容企业码1.0老接口的参数，已过时，新接客户请传企业ID)
	 */
	@ApiField("account_id")
	@Deprecated
	private String accountId;

	/**
	 * 可通过签约消息获取。配合共同账户id使用，当填写企业共同账户id时，此字段必填。 当前字段已废弃(为兼容企业码1.0老接口的参数，已过时，新接客户请传企业ID)
	 */
	@ApiField("agreement_no")
	@Deprecated
	private String agreementNo;

	/**
	 * 通过企业码2.0签约接口签约，只填写企业id，无需填写共同账户id和授权签约协议号。
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
