package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业账户余额阀值设置
 *
 * @author auto create
 * @since 1.0, 2026-04-08 14:27:44
 */
public class AlipayCommerceEcBalanceThresholdSetModel extends AlipayObject {

	private static final long serialVersionUID = 3779268975125751831L;

	/**
	 * 企业码企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 阀值金（分），不能低于 50000（500元）
	 */
	@ApiField("threshold")
	private Long threshold;

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public Long getThreshold() {
		return this.threshold;
	}
	public void setThreshold(Long threshold) {
		this.threshold = threshold;
	}

}
