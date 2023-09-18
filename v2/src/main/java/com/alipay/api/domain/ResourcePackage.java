package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资源包信息
 *
 * @author auto create
 * @since 1.0, 2023-08-29 17:49:55
 */
public class ResourcePackage extends AlipayObject {

	private static final long serialVersionUID = 2442751515742698458L;

	/**
	 * 币种
 - CNY
 - USD
 - EUR
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 资源包名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 原价（分）
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 资源包规格CODE
 - public_cloudd_cd_cn_free_bag
 - public_cloudd_cd_cn_basic_bag
 - public_cloudd_cd_cn_standard_bag
 - public_cloudd_cd_cn_pro_bag
 - public_cloudd_cd_cn_enterprise_bag
 - public_cloudd_cd_cn_flagship_bag
	 */
	@ApiField("spec_code")
	private String specCode;

	/**
	 * 资源包时间单位
 - 1_M
	 */
	@ApiField("time_unit")
	private String timeUnit;

	/**
	 * 成交价格（分）
	 */
	@ApiField("trade_price")
	private String tradePrice;

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getSpecCode() {
		return this.specCode;
	}
	public void setSpecCode(String specCode) {
		this.specCode = specCode;
	}

	public String getTimeUnit() {
		return this.timeUnit;
	}
	public void setTimeUnit(String timeUnit) {
		this.timeUnit = timeUnit;
	}

	public String getTradePrice() {
		return this.tradePrice;
	}
	public void setTradePrice(String tradePrice) {
		this.tradePrice = tradePrice;
	}

}
