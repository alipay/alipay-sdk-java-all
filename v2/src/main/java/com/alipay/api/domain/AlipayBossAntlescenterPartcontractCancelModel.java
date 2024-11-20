package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 半份签撤销合同
 *
 * @author auto create
 * @since 1.0, 2024-08-14 15:48:30
 */
public class AlipayBossAntlescenterPartcontractCancelModel extends AlipayObject {

	private static final long serialVersionUID = 3374366265925721852L;

	/**
	 * 合同编号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 租户
	 */
	@ApiField("tenant")
	private String tenant;

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

}
