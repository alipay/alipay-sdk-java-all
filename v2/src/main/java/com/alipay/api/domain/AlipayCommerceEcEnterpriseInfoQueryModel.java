package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询企业详情
 *
 * @author auto create
 * @since 1.0, 2024-05-30 17:52:49
 */
public class AlipayCommerceEcEnterpriseInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3761337136468441469L;

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
