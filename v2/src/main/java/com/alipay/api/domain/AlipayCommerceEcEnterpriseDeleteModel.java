package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业注销
 *
 * @author auto create
 * @since 1.0, 2023-06-28 11:22:07
 */
public class AlipayCommerceEcEnterpriseDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6467466224342748186L;

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
