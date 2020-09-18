package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.carmodel.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEcoMycarCarmodelCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7854356153746728411L;

	/** 
	 * 支付宝车型库品牌编号（新增品牌信息时返回品牌编号）系统唯一
	 */
	@ApiField("brand_id")
	private String brandId;

	/** 
	 * 支付宝车型库厂商编号（新增厂商信息时返回厂商编号）系统唯一
	 */
	@ApiField("company_id")
	private String companyId;

	/** 
	 * 支付宝车型库车型编号（新增车型信息时返回车型编号）系统唯一
	 */
	@ApiField("model_id")
	private String modelId;

	/** 
	 * 支付宝车型库车系编号（新增车系信息时返回车系编号）系统唯一
	 */
	@ApiField("serie_id")
	private String serieId;

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	public String getBrandId( ) {
		return this.brandId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getCompanyId( ) {
		return this.companyId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}
	public String getModelId( ) {
		return this.modelId;
	}

	public void setSerieId(String serieId) {
		this.serieId = serieId;
	}
	public String getSerieId( ) {
		return this.serieId;
	}

}
