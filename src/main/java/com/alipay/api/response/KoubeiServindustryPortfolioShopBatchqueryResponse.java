package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PortfolioInfoOpenModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.servindustry.portfolio.shop.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2020-06-18 11:52:45
 */
public class KoubeiServindustryPortfolioShopBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4784427987381795492L;

	/** 
	 * 总数
	 */
	@ApiField("portfolio_count")
	private Long portfolioCount;

	/** 
	 * 返回作品集列表
	 */
	@ApiListField("portfolio_info_list")
	@ApiField("portfolio_info_open_model")
	private List<PortfolioInfoOpenModel> portfolioInfoList;

	public void setPortfolioCount(Long portfolioCount) {
		this.portfolioCount = portfolioCount;
	}
	public Long getPortfolioCount( ) {
		return this.portfolioCount;
	}

	public void setPortfolioInfoList(List<PortfolioInfoOpenModel> portfolioInfoList) {
		this.portfolioInfoList = portfolioInfoList;
	}
	public List<PortfolioInfoOpenModel> getPortfolioInfoList( ) {
		return this.portfolioInfoList;
	}

}
