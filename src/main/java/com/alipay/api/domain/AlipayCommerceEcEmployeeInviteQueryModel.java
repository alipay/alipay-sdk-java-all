package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取员工邀请链接
 *
 * @author auto create
 * @since 1.0, 2022-11-18 23:04:50
 */
public class AlipayCommerceEcEmployeeInviteQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3151837343883591251L;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

}
