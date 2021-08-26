package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑泛行业系统商创建作品集接口
 *
 * @author auto create
 * @since 1.0, 2020-06-18 11:55:07
 */
public class KoubeiServindustryPortfolioDataCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7166233297697543168L;

	/**
	 * ISV插件ID
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/**
	 * 头图素材id
	 */
	@ApiField("cover_media_id")
	private String coverMediaId;

	/**
	 * 头图素材type;
枚举（PICTURE/VIDEO）
	 */
	@ApiField("cover_media_type")
	private String coverMediaType;

	/**
	 * 外部作品集ID
	 */
	@ApiField("external_portfolio_id")
	private String externalPortfolioId;

	/**
	 * 操作人信息
	 */
	@ApiField("portfolio_operator_info")
	private PortfolioOperatorInfo portfolioOperatorInfo;

	/**
	 * 作品集与门店的关系、作品集在门店的展示权重
	 */
	@ApiListField("portfolio_shops")
	@ApiField("portfolio_shop")
	private List<PortfolioShop> portfolioShops;

	/**
	 * 作品集标题
	 */
	@ApiField("title")
	private String title;

	public String getCommodityId() {
		return this.commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	public String getCoverMediaId() {
		return this.coverMediaId;
	}
	public void setCoverMediaId(String coverMediaId) {
		this.coverMediaId = coverMediaId;
	}

	public String getCoverMediaType() {
		return this.coverMediaType;
	}
	public void setCoverMediaType(String coverMediaType) {
		this.coverMediaType = coverMediaType;
	}

	public String getExternalPortfolioId() {
		return this.externalPortfolioId;
	}
	public void setExternalPortfolioId(String externalPortfolioId) {
		this.externalPortfolioId = externalPortfolioId;
	}

	public PortfolioOperatorInfo getPortfolioOperatorInfo() {
		return this.portfolioOperatorInfo;
	}
	public void setPortfolioOperatorInfo(PortfolioOperatorInfo portfolioOperatorInfo) {
		this.portfolioOperatorInfo = portfolioOperatorInfo;
	}

	public List<PortfolioShop> getPortfolioShops() {
		return this.portfolioShops;
	}
	public void setPortfolioShops(List<PortfolioShop> portfolioShops) {
		this.portfolioShops = portfolioShops;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
