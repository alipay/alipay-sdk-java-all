package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 作品集信息
 *
 * @author auto create
 * @since 1.0, 2019-01-03 10:35:05
 */
public class PortfolioInfoOpenModel extends AlipayObject {

	private static final long serialVersionUID = 7749113939184271935L;

	/**
	 * 头图素材id
	 */
	@ApiField("cover_image_id")
	private String coverImageId;

	/**
	 * 头图素材type；
枚举（PICTURE/VIDEO）
	 */
	@ApiField("cover_image_type")
	private String coverImageType;

	/**
	 * 头图链接
	 */
	@ApiField("cover_image_url")
	private String coverImageUrl;

	/**
	 * 作品集id
	 */
	@ApiField("portfolio_id")
	private String portfolioId;

	/**
	 * 作品集标题
	 */
	@ApiField("portfolio_title")
	private String portfolioTitle;

	public String getCoverImageId() {
		return this.coverImageId;
	}
	public void setCoverImageId(String coverImageId) {
		this.coverImageId = coverImageId;
	}

	public String getCoverImageType() {
		return this.coverImageType;
	}
	public void setCoverImageType(String coverImageType) {
		this.coverImageType = coverImageType;
	}

	public String getCoverImageUrl() {
		return this.coverImageUrl;
	}
	public void setCoverImageUrl(String coverImageUrl) {
		this.coverImageUrl = coverImageUrl;
	}

	public String getPortfolioId() {
		return this.portfolioId;
	}
	public void setPortfolioId(String portfolioId) {
		this.portfolioId = portfolioId;
	}

	public String getPortfolioTitle() {
		return this.portfolioTitle;
	}
	public void setPortfolioTitle(String portfolioTitle) {
		this.portfolioTitle = portfolioTitle;
	}

}
