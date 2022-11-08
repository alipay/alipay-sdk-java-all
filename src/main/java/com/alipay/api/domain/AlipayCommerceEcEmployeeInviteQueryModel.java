package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取员工邀请链接
 *
 * @author auto create
 * @since 1.0, 2022-09-06 16:50:25
 */
public class AlipayCommerceEcEmployeeInviteQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4422157416283719814L;

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
