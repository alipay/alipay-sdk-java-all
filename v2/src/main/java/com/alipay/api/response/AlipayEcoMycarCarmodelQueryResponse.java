package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.carmodel.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 01:16:29
 */
public class AlipayEcoMycarCarmodelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6448692696887373461L;

	/** 
	 * 支付宝车型库品牌背景图片链接地址
	 */
	@ApiField("background_url")
	private String backgroundUrl;

	/** 
	 * 支付宝车型库品牌编号（系统唯一）
	 */
	@ApiField("brand_id")
	private String brandId;

	/** 
	 * 支付宝车型库品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/** 
	 * 支付宝车型库车型排量
	 */
	@ApiField("cc")
	private String cc;

	/** 
	 * 支付宝车型库厂商编号（系统唯一）
	 */
	@ApiField("company_id")
	private String companyId;

	/** 
	 * 支付宝车型库厂商名称
	 */
	@ApiField("company_name")
	private String companyName;

	/** 
	 * 支付宝车型库车型发动机号
	 */
	@ApiField("engine")
	private String engine;

	/** 
	 * 支付宝车型库品牌logo图片链接地址
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/** 
	 * 支付宝车型库车型编号（系统唯一）
	 */
	@ApiField("model_id")
	private String modelId;

	/** 
	 * 支付宝车型库车型名称
	 */
	@ApiField("model_name")
	private String modelName;

	/** 
	 * 支付宝车型库车型生产年限
	 */
	@ApiField("prod_year")
	private String prodYear;

	/** 
	 * 支付宝车型库车系编号（系统唯一）
	 */
	@ApiField("serie_id")
	private String serieId;

	/** 
	 * 支付宝车型库车系名称
	 */
	@ApiField("serie_name")
	private String serieName;

	/** 
	 * 支付宝车型库车系图片连接地址
	 */
	@ApiField("serie_photo")
	private String seriePhoto;

	/** 
	 * 支付宝车型库车型年款
	 */
	@ApiField("style")
	private String style;

	public void setBackgroundUrl(String backgroundUrl) {
		this.backgroundUrl = backgroundUrl;
	}
	public String getBackgroundUrl( ) {
		return this.backgroundUrl;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	public String getBrandId( ) {
		return this.brandId;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getBrandName( ) {
		return this.brandName;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}
	public String getCc( ) {
		return this.cc;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getCompanyId( ) {
		return this.companyId;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyName( ) {
		return this.companyName;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getEngine( ) {
		return this.engine;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
	public String getLogoUrl( ) {
		return this.logoUrl;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}
	public String getModelId( ) {
		return this.modelId;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getModelName( ) {
		return this.modelName;
	}

	public void setProdYear(String prodYear) {
		this.prodYear = prodYear;
	}
	public String getProdYear( ) {
		return this.prodYear;
	}

	public void setSerieId(String serieId) {
		this.serieId = serieId;
	}
	public String getSerieId( ) {
		return this.serieId;
	}

	public void setSerieName(String serieName) {
		this.serieName = serieName;
	}
	public String getSerieName( ) {
		return this.serieName;
	}

	public void setSeriePhoto(String seriePhoto) {
		this.seriePhoto = seriePhoto;
	}
	public String getSeriePhoto( ) {
		return this.seriePhoto;
	}

	public void setStyle(String style) {
		this.style = style;
	}
	public String getStyle( ) {
		return this.style;
	}

}
