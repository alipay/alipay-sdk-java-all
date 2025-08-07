package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单项资源包信息
 *
 * @author auto create
 * @since 1.0, 2023-11-03 14:46:44
 */
public class ItemPackage extends AlipayObject {

	private static final long serialVersionUID = 3492625716555791349L;

	/**
	 * 商品编码
	 */
	@ApiField("commodity_code")
	private String commodityCode;

	/**
	 * 商品名称
	 */
	@ApiField("commodity_name")
	private String commodityName;

	/**
	 * 商品可购买周期数量
	 */
	@ApiField("effective_period_num")
	private Long effectivePeriodNum;

	/**
	 * 商品可购买周期类型
	 */
	@ApiField("effective_period_type")
	private String effectivePeriodType;

	/**
	 * 商品规格编码
	 */
	@ApiField("spec_code")
	private String specCode;

	/**
	 * 商品规格名称
	 */
	@ApiField("spec_name")
	private String specName;

	public String getCommodityCode() {
		return this.commodityCode;
	}
	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}

	public String getCommodityName() {
		return this.commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	public Long getEffectivePeriodNum() {
		return this.effectivePeriodNum;
	}
	public void setEffectivePeriodNum(Long effectivePeriodNum) {
		this.effectivePeriodNum = effectivePeriodNum;
	}

	public String getEffectivePeriodType() {
		return this.effectivePeriodType;
	}
	public void setEffectivePeriodType(String effectivePeriodType) {
		this.effectivePeriodType = effectivePeriodType;
	}

	public String getSpecCode() {
		return this.specCode;
	}
	public void setSpecCode(String specCode) {
		this.specCode = specCode;
	}

	public String getSpecName() {
		return this.specName;
	}
	public void setSpecName(String specName) {
		this.specName = specName;
	}

}
