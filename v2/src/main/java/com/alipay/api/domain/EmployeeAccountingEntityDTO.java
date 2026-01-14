package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 员工关联的核算主体
 *
 * @author auto create
 * @since 1.0, 2025-03-27 19:32:21
 */
public class EmployeeAccountingEntityDTO extends AlipayObject {

	private static final long serialVersionUID = 2274289712221795484L;

	/**
	 * 核算主体编码
	 */
	@ApiField("accounting_entity_code")
	private String accountingEntityCode;

	/**
	 * 核算主体id
	 */
	@ApiField("accounting_entity_id")
	private String accountingEntityId;

	/**
	 * 核算主体名称
	 */
	@ApiField("accounting_entity_name")
	private String accountingEntityName;

	public String getAccountingEntityCode() {
		return this.accountingEntityCode;
	}
	public void setAccountingEntityCode(String accountingEntityCode) {
		this.accountingEntityCode = accountingEntityCode;
	}

	public String getAccountingEntityId() {
		return this.accountingEntityId;
	}
	public void setAccountingEntityId(String accountingEntityId) {
		this.accountingEntityId = accountingEntityId;
	}

	public String getAccountingEntityName() {
		return this.accountingEntityName;
	}
	public void setAccountingEntityName(String accountingEntityName) {
		this.accountingEntityName = accountingEntityName;
	}

}
