package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 通行证账号批量查询
 *
 * @author auto create
 * @since 1.0, 2023-01-04 10:51:50
 */
public class AnttechOceanbasePassaccountBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5639887327288774273L;

	/**
	 * 通行证账号名称列表
	 */
	@ApiListField("account_names")
	@ApiField("string")
	private List<String> accountNames;

	/**
	 * 通行证id列表
	 */
	@ApiListField("passport_ids")
	@ApiField("string")
	private List<String> passportIds;

	public List<String> getAccountNames() {
		return this.accountNames;
	}
	public void setAccountNames(List<String> accountNames) {
		this.accountNames = accountNames;
	}

	public List<String> getPassportIds() {
		return this.passportIds;
	}
	public void setPassportIds(List<String> passportIds) {
		this.passportIds = passportIds;
	}

}
