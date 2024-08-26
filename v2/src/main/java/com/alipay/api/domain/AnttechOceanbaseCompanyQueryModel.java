package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 组织信息查询接口
 *
 * @author auto create
 * @since 1.0, 2024-06-19 17:06:39
 */
public class AnttechOceanbaseCompanyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6743252179897452156L;

	/**
	 * 组织名称
	 */
	@ApiField("org_name")
	private String orgName;

	public String getOrgName() {
		return this.orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

}
