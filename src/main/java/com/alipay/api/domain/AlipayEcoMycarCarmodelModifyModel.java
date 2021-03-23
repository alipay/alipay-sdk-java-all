package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改车型信息接口
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:52:20
 */
public class AlipayEcoMycarCarmodelModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4686186318737293889L;

	/**
	 * 支付宝车型库品牌背景图片，尺寸750 x 448（modify_type参数的值为brand时此参数必填）图片url可以通过【通用图片上传接口】alipay.eco.mycar.image.upload 上传完成后获取, 图片url需要进行URLencode进行转码
	 */
	@ApiField("background_url")
	private String backgroundUrl;

	/**
	 * 支付宝车型库品牌编号（系统唯一），品牌编号可以通过调用【批量查询车型信息接口】alipay.eco.mycar.carmodel.batchquery 获取。（modify_type参数的值为brand时此参数必填）
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 支付宝车型库品牌图片，尺寸220 x 147 （modify_type参数的值为brand时此参数必填）品牌图片url可以通过【通用图片上传接口】alipay.eco.mycar.image.upload上传完成后获取, 图片url需要进行URLencode进行转码
	 */
	@ApiField("brand_logo")
	private String brandLogo;

	/**
	 * 支付宝车型库品牌名称（add_type参数的值为brand时此参数必填）开发者自行配置，保证系统唯一
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 支付宝车型库排量（modify_type参数的值为model时此参数必填）
	 */
	@ApiField("cc")
	private String cc;

	/**
	 * 支付宝车型库厂商编号（系统唯一），厂商编号可以通过调用【批量查询车型信息接口】alipay.eco.mycar.carmodel.batchquery 获取。（modify_type参数的值为company时此参数必填）
	 */
	@ApiField("company_id")
	private String companyId;

	/**
	 * 支付宝车型库厂商名称（modify_type参数的值为company时此参数必填）
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 支付宝车型库发动机型号（modify_type参数的值为model时此参数必填）
	 */
	@ApiField("engine")
	private String engine;

	/**
	 * 支付宝车型库车型编号（系统唯一），可以通过调用【批量查询车型信息接口】alipay.eco.mycar.carmodel.batchquery 获取。（modify_type参数的值为model时此参数必填）
	 */
	@ApiField("model_id")
	private String modelId;

	/**
	 * 支付宝车型库车型名称（modify_type参数的值为model时此参数必填）
	 */
	@ApiField("model_name")
	private String modelName;

	/**
	 * 修改类型，接口通过此参数判断本次请求是修改品牌信息还是车型信息等，brand（品牌），company（厂商），serie（车系），model（车型）
	 */
	@ApiField("modify_type")
	private String modifyType;

	/**
	 * 支付宝车型库生产年份（modify_type参数的值为model时此参数必填）
	 */
	@ApiField("prod_year")
	private String prodYear;

	/**
	 * 支付宝车型库车系组名称（add_type":"serie状态时必填）
	 */
	@ApiField("serie_group")
	private String serieGroup;

	/**
	 * 支付宝车型库车系编号（系统唯一），车系编号可以通过调用【批量查询车型信息接口】alipay.eco.mycar.carmodel.batchquery 获取。（modify_type参数的值为serie时此参数必填）
	 */
	@ApiField("serie_id")
	private String serieId;

	/**
	 * 支付宝车型库车系名称（modify_type参数的值为serie时此参数必填）
	 */
	@ApiField("serie_name")
	private String serieName;

	/**
	 * 支付宝车型库车系logo图片链接地址，尺寸220 x 147 （modify_type参数的值为serie时此参数必填）图片url可以通过【通用图片上传接口】alipay.eco.mycar.image.upload 上传完成后获取,图片url需要进行URLencode进行转码
	 */
	@ApiField("serie_photo")
	private String seriePhoto;

	/**
	 * 支付宝车型库年款（modify_type参数的值为model时此参数必填）
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

	public String getBrandLogo() {
		return this.brandLogo;
	}
	public void setBrandLogo(String brandLogo) {
		this.brandLogo = brandLogo;
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

	public String getModifyType() {
		return this.modifyType;
	}
	public void setModifyType(String modifyType) {
		this.modifyType = modifyType;
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
