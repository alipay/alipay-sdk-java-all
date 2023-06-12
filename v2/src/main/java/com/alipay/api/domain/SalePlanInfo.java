package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 销售方案
 *
 * @author auto create
 * @since 1.0, 2020-09-22 15:46:02
 */
public class SalePlanInfo extends AlipayObject {

	private static final long serialVersionUID = 7169555167316778436L;

	/**
	 * 个性化价格描述
	 */
	@ApiField("custom_price_desc")
	private String customPriceDesc;

	/**
	 * 主(销售方案id)商品id
	 */
	@ApiField("main_ps_id")
	private String mainPsId;

	/**
	 * 价格描述
	 */
	@ApiField("price_desc")
	private String priceDesc;

	/**
	 * 特殊价格:STANDARD_PRICE/CUSTOM_PRICE
	 */
	@ApiField("price_type")
	private String priceType;

	/**
	 * 销售方案或者商品列表
	 */
	@ApiField("ps_id")
	private String psId;

	public String getCustomPriceDesc() {
		return this.customPriceDesc;
	}
	public void setCustomPriceDesc(String customPriceDesc) {
		this.customPriceDesc = customPriceDesc;
	}

	public String getMainPsId() {
		return this.mainPsId;
	}
	public void setMainPsId(String mainPsId) {
		this.mainPsId = mainPsId;
	}

	public String getPriceDesc() {
		return this.priceDesc;
	}
	public void setPriceDesc(String priceDesc) {
		this.priceDesc = priceDesc;
	}

	public String getPriceType() {
		return this.priceType;
	}
	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}

	public String getPsId() {
		return this.psId;
	}
	public void setPsId(String psId) {
		this.psId = psId;
	}

}
