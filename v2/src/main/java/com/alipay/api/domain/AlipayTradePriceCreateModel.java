package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 价格创建
 *
 * @author auto create
 * @since 1.0, 2026-03-30 15:52:45
 */
public class AlipayTradePriceCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1849877876966184336L;

	/**
	 * 商户需要保存在价格模型中的元数据
	 */
	@ApiField("metadata")
	private String metadata;

	/**
	 * 商品模型，可以通过该参数一并创建商品信息
	 */
	@ApiField("product_data")
	private ProductData productData;

	/**
	 * 商品id，通过商品创建接口获取；和product_data二选其一
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 循环计价配置，用于订阅等场景
	 */
	@ApiField("recurring")
	private RecurringConfig recurring;

	/**
	 * 单位金额，单位：分
	 */
	@ApiField("unit_amount")
	private Long unitAmount;

	public String getMetadata() {
		return this.metadata;
	}
	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}

	public ProductData getProductData() {
		return this.productData;
	}
	public void setProductData(ProductData productData) {
		this.productData = productData;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public RecurringConfig getRecurring() {
		return this.recurring;
	}
	public void setRecurring(RecurringConfig recurring) {
		this.recurring = recurring;
	}

	public Long getUnitAmount() {
		return this.unitAmount;
	}
	public void setUnitAmount(Long unitAmount) {
		this.unitAmount = unitAmount;
	}

}
