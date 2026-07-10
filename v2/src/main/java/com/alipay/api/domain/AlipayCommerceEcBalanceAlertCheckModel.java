package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业余额预警查询
 *
 * @author auto create
 * @since 1.0, 2026-04-08 14:27:44
 */
public class AlipayCommerceEcBalanceAlertCheckModel extends AlipayObject {

	private static final long serialVersionUID = 5661146195366284366L;

	/**
	 * 企业码企业ID
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
