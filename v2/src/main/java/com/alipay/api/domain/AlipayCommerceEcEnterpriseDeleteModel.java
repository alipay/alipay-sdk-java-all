package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业注销
 *
 * @author auto create
 * @since 1.0, 2024-05-30 17:52:35
 */
public class AlipayCommerceEcEnterpriseDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 7287977223711638392L;

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
