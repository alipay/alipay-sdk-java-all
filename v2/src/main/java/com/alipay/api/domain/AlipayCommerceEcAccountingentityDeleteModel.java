package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除核算主体
 *
 * @author auto create
 * @since 1.0, 2025-04-08 09:38:10
 */
public class AlipayCommerceEcAccountingentityDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1449751485941177412L;

	/**
	 * 核算主体id
	 */
	@ApiField("accounting_entity_id")
	private String accountingEntityId;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	public String getAccountingEntityId() {
		return this.accountingEntityId;
	}
	public void setAccountingEntityId(String accountingEntityId) {
		this.accountingEntityId = accountingEntityId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

}
