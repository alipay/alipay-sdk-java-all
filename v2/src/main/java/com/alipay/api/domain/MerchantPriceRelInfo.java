package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安心付开通接口——价格关联key
 *
 * @author auto create
 * @since 1.0, 2024-11-27 15:37:19
 */
public class MerchantPriceRelInfo extends AlipayObject {

	private static final long serialVersionUID = 2556946727441993498L;

	/**
	 * 安心付直联版后台产品code使用商家扣款（I1140100001000001000）、
间联版不需要、
安心付先享次卡需要（I1140300001000013424和I1140100001000001000）
	 */
	@ApiField("back_product_code")
	private String backProductCode;

	/**
	 * 费率，最多两位小数，范围为0.38～0.6，
周期卡间联版没有收费协议该字段可不填
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
