package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询企业签约企业码信息
 *
 * @author auto create
 * @since 1.0, 2022-11-18 23:31:15
 */
public class AlipayCommerceEcEnterpriseAgreementQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5141293835861114655L;

	/**
	 * 资金共同账号id；enterprise_id与account_id至少传一个，如果都传了优先使用enterprise_id
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 企业id；enterprise_id与account_id至少传一个，如果都传了优先使用enterprise_id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

}
