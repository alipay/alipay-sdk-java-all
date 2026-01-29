package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 产品费率明细信息
 *
 * @author auto create
 * @since 1.0, 2026-01-09 18:33:09
 */
public class ProductPriceInfo extends AlipayObject {

	private static final long serialVersionUID = 4722464959487334649L;

	/**
	 * 产品开通明细项费率，单位：只可以小数不能填百分号，最多小数点后两位，范围为0.38～1.0。
	 */
	@ApiField("price_rate")
	private String priceRate;

	/**
	 * 产品开通明细项编码
	 */
	@ApiField("product_detail_code")
	private String productDetailCode;

	public String getPriceRate() {
		return this.priceRate;
	}
	public void setPriceRate(String priceRate) {
		this.priceRate = priceRate;
	}

	public String getProductDetailCode() {
		return this.productDetailCode;
	}
	public void setProductDetailCode(String productDetailCode) {
		this.productDetailCode = productDetailCode;
	}

}
