package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金专户查询
 *
 * @author auto create
 * @since 1.0, 2025-01-02 16:24:19
 */
public class AlipayCommerceEcTransAccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2273917568923312182L;

	/**
	 * 企业ID
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
