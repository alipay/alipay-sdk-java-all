package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单个基金组合详情查询接口
 *
 * @author auto create
 * @since 1.0, 2019-11-25 10:55:23
 */
public class AntfortuneEquityPortfolioQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8838188771114419395L;

	/**
	 * 组合Code
	 */
	@ApiField("portfolio_code")
	private String portfolioCode;

	/**
	 * 组合ID，已废弃，请使用组合Code参数查询
	 */
	@ApiField("product_id")
	private String productId;

	public String getPortfolioCode() {
		return this.portfolioCode;
	}
	public void setPortfolioCode(String portfolioCode) {
		this.portfolioCode = portfolioCode;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

}
