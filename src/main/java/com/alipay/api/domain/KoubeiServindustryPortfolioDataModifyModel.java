package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 系统商修改作品集
 *
 * @author auto create
 * @since 1.0, 2020-06-18 11:56:34
 */
public class KoubeiServindustryPortfolioDataModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4359785778934688827L;

	/**
	 * 头图素材ID
	 */
	@ApiField("cover_media_id")
	private String coverMediaId;

	/**
	 * 头图素材type,枚举(PICTURE/VIDEO),更改头图时必传
	 */
	@ApiField("cover_media_type")
	private String coverMediaType;

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

	/**
	 * 作品集门店关系&展示权重,需要传要关联的全部店铺,更新模式为覆盖
	 */
	@ApiListField("portfolio_shops")
	@ApiField("portfolio_shop")
	private List<PortfolioShop> portfolioShops;

	/**
	 * 作品集标题
	 */
	@ApiField("title")
	private String title;

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
