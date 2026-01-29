package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用风险信息，如租物场景风险等级、履约历史等级等
 *
 * @author auto create
 * @since 1.0, 2025-10-14 16:27:40
 */
public class CreditRiskDTO extends AlipayObject {

	private static final long serialVersionUID = 2433578528525654765L;

	/**
	 * 查询失败的情况下，是否可以通过重试解决。true 表示可以适当重试一定次数；false 表示有明确的失败原因，无需重试
	 */
	@ApiField("can_retry")
	private Boolean canRetry;

	/**
	 * 用户信用风险信息，如：租物场景风险等级、履约历史等级、共租行为等级
	 */
	@ApiField("data")
	private String data;

	/**
	 * 用户信用数据查询状态
	 */
	@ApiField("risk_code")
	private String riskCode;

	public Boolean getCanRetry() {
		return this.canRetry;
	}
	public void setCanRetry(Boolean canRetry) {
		this.canRetry = canRetry;
	}

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getRiskCode() {
		return this.riskCode;
	}
	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

}
