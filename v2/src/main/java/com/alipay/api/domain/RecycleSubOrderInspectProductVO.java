package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收子单质检商品信息
 *
 * @author auto create
 * @since 1.0, 2025-09-02 11:22:07
 */
public class RecycleSubOrderInspectProductVO extends AlipayObject {

	private static final long serialVersionUID = 1899796196952969621L;

	/**
	 * 商品的质检金额,币种：人民币，单位：元
	 */
	@ApiField("inspect_price")
	private String inspectPrice;

	/**
	 * 产品编码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 商品唯一ID
	 */
	@ApiField("product_unique_id")
	private String productUniqueId;

	/**
	 * 商品实际定价，币种：人民币，单位：元
	 */
	@ApiField("real_unit_pricing")
	private String realUnitPricing;

	public String getInspectPrice() {
		return this.inspectPrice;
	}
	public void setInspectPrice(String inspectPrice) {
		this.inspectPrice = inspectPrice;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductUniqueId() {
		return this.productUniqueId;
	}
	public void setProductUniqueId(String productUniqueId) {
		this.productUniqueId = productUniqueId;
	}

	public String getRealUnitPricing() {
		return this.realUnitPricing;
	}
	public void setRealUnitPricing(String realUnitPricing) {
		this.realUnitPricing = realUnitPricing;
	}

}
