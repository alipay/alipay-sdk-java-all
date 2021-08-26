package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 系统商查询作品接口
 *
 * @author auto create
 * @since 1.0, 2020-06-18 11:56:00
 */
public class KoubeiServindustryPortfolioOpusBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3696548529472519496L;

	/**
	 * 插件id
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/**
	 * 当前页码；页码必须大于等于1；最大值：100
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 分页大小;默认值：20；最大值：100
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 作品集id
	 */
	@ApiField("portfolio_id")
	private String portfolioId;

	public String getCommodityId() {
		return this.commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getPortfolioId() {
		return this.portfolioId;
	}
	public void setPortfolioId(String portfolioId) {
		this.portfolioId = portfolioId;
	}

}
