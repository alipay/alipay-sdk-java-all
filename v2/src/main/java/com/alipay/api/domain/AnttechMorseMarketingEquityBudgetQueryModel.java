package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 摩斯服务商权益预算查询
 *
 * @author auto create
 * @since 1.0, 2026-08-21 10:33:49
 */
public class AnttechMorseMarketingEquityBudgetQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2526745233291817753L;

	/**
	 * 开发者可从摩斯营销计划的权益配置或权益创建结果中获取：立减权益填写对应的discountId；立减金权益填写对应的outputCampaignId。该权益必须归属于tenant_id指定的租户。
	 */
	@ApiField("equity_id")
	private String equityId;

	/**
	 * 摩斯营销计划租户ID，必须与调用应用授权的租户一致
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public String getEquityId() {
		return this.equityId;
	}
	public void setEquityId(String equityId) {
		this.equityId = equityId;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
