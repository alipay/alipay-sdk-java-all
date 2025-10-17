package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构跨通道信息互备
 *
 * @author auto create
 * @since 1.0, 2024-10-11 11:29:14
 */
public class AlipayMerchantIndirectUnionccAuthModel extends AlipayObject {

	private static final long serialVersionUID = 8373969386395124834L;

	/**
	 * 收单机构在支付宝签约的商户名称，和PID对应。
	 */
	@ApiField("org_name")
	private String orgName;

	/**
	 * 收单机构的PID
	 */
	@ApiField("org_pid")
	private String orgPid;

	public String getOrgName() {
		return this.orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getOrgPid() {
		return this.orgPid;
	}
	public void setOrgPid(String orgPid) {
		this.orgPid = orgPid;
	}

}
