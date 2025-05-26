package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建核算主体
 *
 * @author auto create
 * @since 1.0, 2025-04-08 09:38:08
 */
public class AlipayCommerceEcAccountingentityCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8741137139159538179L;

	/**
	 * 核算主体编码
	 */
	@ApiField("accounting_entity_code")
	private String accountingEntityCode;

	/**
	 * 核算主体名称
	 */
	@ApiField("accounting_entity_name")
	private String accountingEntityName;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	public String getAccountingEntityCode() {
		return this.accountingEntityCode;
	}
	public void setAccountingEntityCode(String accountingEntityCode) {
		this.accountingEntityCode = accountingEntityCode;
	}

	public String getAccountingEntityName() {
		return this.accountingEntityName;
	}
	public void setAccountingEntityName(String accountingEntityName) {
		this.accountingEntityName = accountingEntityName;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

}
