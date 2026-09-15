package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 摩斯服务商权益预算追加
 *
 * @author auto create
 * @since 1.0, 2026-08-21 10:37:50
 */
public class AnttechMorseMarketingEquityBudgetAppendModel extends AlipayObject {

	private static final long serialVersionUID = 1234668995513217764L;

	/**
	 * 追加金额，单位为分，必须大于0
	 */
	@ApiField("append_amount")
	private Long appendAmount;

	/**
	 * 开发者可从摩斯营销计划的权益配置或权益创建结果中获取：立减权益填写对应的discountId；立减金权益填写对应的outputCampaignId。该权益必须归属于tenant_id指定的租户。
	 */
	@ApiField("equity_id")
	private String equityId;

	/**
	 * 客户业务幂等号，同一租户下全局唯一；重试必须复用原值
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 摩斯营销计划租户ID，必须与调用AppId授权的租户一致
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public Long getAppendAmount() {
		return this.appendAmount;
	}
	public void setAppendAmount(Long appendAmount) {
		this.appendAmount = appendAmount;
	}

	public String getEquityId() {
		return this.equityId;
	}
	public void setEquityId(String equityId) {
		this.equityId = equityId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
