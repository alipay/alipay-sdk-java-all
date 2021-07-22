package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.logistics.express.price.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:12:31
 */
public class AlipayEcoLogisticsExpressPriceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5847713695972676481L;

	/** 
	 * 续重价格（单位：元）
	 */
	@ApiField("extra_weight_price")
	private String extraWeightPrice;

	/** 
	 * 续重单位（单位：克）
	 */
	@ApiField("extra_weight_unit")
	private Long extraWeightUnit;

	/** 
	 * 首重重量（单位：克）
	 */
	@ApiField("preset_weight")
	private Long presetWeight;

	/** 
	 * 首重价格（单位：元）
	 */
	@ApiField("preset_weight_price")
	private String presetWeightPrice;

	public void setExtraWeightPrice(String extraWeightPrice) {
		this.extraWeightPrice = extraWeightPrice;
	}
	public String getExtraWeightPrice( ) {
		return this.extraWeightPrice;
	}

	public void setExtraWeightUnit(Long extraWeightUnit) {
		this.extraWeightUnit = extraWeightUnit;
	}
	public Long getExtraWeightUnit( ) {
		return this.extraWeightUnit;
	}

	public void setPresetWeight(Long presetWeight) {
		this.presetWeight = presetWeight;
	}
	public Long getPresetWeight( ) {
		return this.presetWeight;
	}

	public void setPresetWeightPrice(String presetWeightPrice) {
		this.presetWeightPrice = presetWeightPrice;
	}
	public String getPresetWeightPrice( ) {
		return this.presetWeightPrice;
	}

}
