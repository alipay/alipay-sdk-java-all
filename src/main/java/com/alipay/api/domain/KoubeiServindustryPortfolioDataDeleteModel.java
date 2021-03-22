package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 系统商删除作品集接口
 *
 * @author auto create
 * @since 1.0, 2020-06-18 11:53:34
 */
public class KoubeiServindustryPortfolioDataDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6874318691355893965L;

	/**
	 * 作品集id
	 */
	@ApiField("portfolio_id")
	private String portfolioId;

	/**
	 * 操作人信息
	 */
	@ApiField("portfolio_operator_info")
	private PortfolioOperatorInfo portfolioOperatorInfo;

	public String getPortfolioId() {
		return this.portfolioId;
	}
	public void setPortfolioId(String portfolioId) {
		this.portfolioId = portfolioId;
	}

	public PortfolioOperatorInfo getPortfolioOperatorInfo() {
		return this.portfolioOperatorInfo;
	}
	public void setPortfolioOperatorInfo(PortfolioOperatorInfo portfolioOperatorInfo) {
		this.portfolioOperatorInfo = portfolioOperatorInfo;
	}

}
