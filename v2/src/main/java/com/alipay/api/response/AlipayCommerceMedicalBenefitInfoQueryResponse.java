package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.benefit.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 10:17:37
 */
public class AlipayCommerceMedicalBenefitInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8778218196835967187L;

	/** 
	 * 权益商品id
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/** 
	 * 是否可售卖
	 */
	@ApiField("can_sell")
	private Boolean canSell;

	/** 
	 * 外部商品id
	 */
	@ApiField("out_benefit_id")
	private String outBenefitId;

	/** 
	 * sku信息
	 */
	@ApiField("sku_info")
	private String skuInfo;

	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}
	public String getBenefitId( ) {
		return this.benefitId;
	}

	public void setCanSell(Boolean canSell) {
		this.canSell = canSell;
	}
	public Boolean getCanSell( ) {
		return this.canSell;
	}

	public void setOutBenefitId(String outBenefitId) {
		this.outBenefitId = outBenefitId;
	}
	public String getOutBenefitId( ) {
		return this.outBenefitId;
	}

	public void setSkuInfo(String skuInfo) {
		this.skuInfo = skuInfo;
	}
	public String getSkuInfo( ) {
		return this.skuInfo;
	}

}
