package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停用出资方式
 *
 * @author auto create
 * @since 1.0, 2025-07-30 10:30:18
 */
public class AlipayCommerceEcFundStrategyDestroyModel extends AlipayObject {

	private static final long serialVersionUID = 8354143276945728876L;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 出资方式唯一编号
	 */
	@ApiField("strategy_id")
	private String strategyId;

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getStrategyId() {
		return this.strategyId;
	}
	public void setStrategyId(String strategyId) {
		this.strategyId = strategyId;
	}

}
