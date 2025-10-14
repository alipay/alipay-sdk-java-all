package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 返回列表为json格式的列表（query_type参数的值为brands时返回品牌信息列表；query_type参数的值为series时返回车系信息列表；query_type参数的值为company时返厂商信息列表；query_type参数的值为models时返回车型信息列表）
 *
 * @author auto create
 * @since 1.0, 2017-04-12 11:47:37
 */
public class QueryResult extends AlipayObject {

	private static final long serialVersionUID = 3435894129765791834L;

	/**
	 * 支付宝车型库品牌背景图片链接地址，
query_type参数的值为brands时此参数必填；query_type参数的值为series,models，company时不返回
	 */
	@ApiField("background_url")
	private String backgroundUrl;

	/**
	 * 支付宝车型库品牌编号query_type参数的值为brands，models时此参数必填；query_type参数的值为series，company时不返回，系统唯一
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 支付宝车型库品牌名称query_type参数的值为brands， models时此参数必填；query_type参数的值为series，company时不返回
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 支付宝车型库排量，query_type参数的值为models时此参数必填, query_type参数的值为series，company, brands时此参数不返回
	 */
	@ApiField("cc")
	private String cc;

	/**
	 * 支付宝车型库厂商编号，query_type参数的值为series， models，company时此参数必填；query_type参数的值为brands时不返回，系统唯一
	 */
	@ApiField("company_id")
	private String companyId;

	/**
	 * 支付宝车型库厂商名称，query_type参数的值为series， models，company时此参数必填，query_type参数的值为brands时此参数不返回
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 支付宝车型库发动机号，query_type参数的值为models时此参数必填, query_type参数的值为series，company, brands时此参数不返回
	 */
	@ApiField("engine")
	private String engine;

	/**
	 * 支付宝车型库品牌logo图片链接地址，
query_type参数的值为brands时此参数必填；query_type参数的值为series,models，company时不返回
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 支付宝车型库车型编号，query_type参数的值为models时此参数必填，query_type参数的值为series，company, brands时此参数不返回，系统唯一
	 */
	@ApiField("model_id")
	private String modelId;

	/**
	 * 支付宝车型库车型名称，query_type参数的值为models时此参数必填, query_type参数的值为series，company, brands时此参数不返回
	 */
	@ApiField("model_name")
	private String modelName;

	/**
	 * 支付宝车型库生产年限，query_type参数的值为models时此参数必填, query_type参数的值为series，company, brands时此参数不返回
	 */
	@ApiField("prod_year")
	private String prodYear;

	/**
	 * 支付宝车型库车系组别，query_type参数的值为series时此参数必填，query_type参数的值为brands， models时此参数不返回
	 */
	@ApiField("serie_group")
	private String serieGroup;

	/**
	 * 支付宝车型库车系编号query_type参数的值为series，models，company时此参数必填；query_type参数的值为brands时不返回，系统唯一
	 */
	@ApiField("serie_id")
	private String serieId;

	/**
	 * 支付宝车型库车系名称，query_type参数的值为series，models时此参数必填；query_type参数的值为brands时不返回
	 */
	@ApiField("serie_name")
	private String serieName;

	/**
	 * 支付宝车型库车系图片连接地址，
query_type参数的值为series时此参数必填；query_type参数的值为brands,models时不返回
	 */
	@ApiField("serie_photo")
	private String seriePhoto;

	/**
	 * 支付宝车型库年款，query_type参数的值为models时此参数必填, query_type参数的值为series，company, brands时此参数不返回
	 */
	@ApiField("style")
	private String style;

	public String getBackgroundUrl() {
		return this.backgroundUrl;
	}
	public void setBackgroundUrl(String backgroundUrl) {
		this.backgroundUrl = backgroundUrl;
	}

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCc() {
		return this.cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getCompanyId() {
		return this.companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEngine() {
		return this.engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getModelId() {
		return this.modelId;
	}
	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	public String getModelName() {
		return this.modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getProdYear() {
		return this.prodYear;
	}
	public void setProdYear(String prodYear) {
		this.prodYear = prodYear;
	}

	public String getSerieGroup() {
		return this.serieGroup;
	}
	public void setSerieGroup(String serieGroup) {
		this.serieGroup = serieGroup;
	}

	public String getSerieId() {
		return this.serieId;
	}
	public void setSerieId(String serieId) {
		this.serieId = serieId;
	}

	public String getSerieName() {
		return this.serieName;
	}
	public void setSerieName(String serieName) {
		this.serieName = serieName;
	}

	public String getSeriePhoto() {
		return this.seriePhoto;
	}
	public void setSeriePhoto(String seriePhoto) {
		this.seriePhoto = seriePhoto;
	}

	public String getStyle() {
		return this.style;
	}
	public void setStyle(String style) {
		this.style = style;
	}

}
