package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询已发布的资金池信息
 *
 * @author auto create
 * @since 1.0, 2025-09-22 10:39:27
 */
public class AlipayMarketingFundschemeBudgetQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2562674353481496928L;

	/**
	 * 资金池id，传入资金池id后，返回对应的资金池详细信息
	 */
	@ApiField("fund_scheme_id")
	private String fundSchemeId;

	public String getFundSchemeId() {
		return this.fundSchemeId;
	}
	public void setFundSchemeId(String fundSchemeId) {
		this.fundSchemeId = fundSchemeId;
	}

}
