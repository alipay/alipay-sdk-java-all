package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安心付开通接口——价格关联key
 *
 * @author auto create
 * @since 1.0, 2024-08-20 19:54:28
 */
public class MerchantPriceRelInfo extends AlipayObject {

	private static final long serialVersionUID = 8539393397311866635L;

	/**
	 * 后台产品code
	 */
	@ApiField("back_product_code")
	private String backProductCode;

	/**
	 * 费率，最多两位小数，范围为0.38～0.6。
	 */
	@ApiField("price_rate")
	private String priceRate;

	public String getBackProductCode() {
		return this.backProductCode;
	}
	public void setBackProductCode(String backProductCode) {
		this.backProductCode = backProductCode;
	}

	public String getPriceRate() {
		return this.priceRate;
	}
	public void setPriceRate(String priceRate) {
		this.priceRate = priceRate;
	}

}
