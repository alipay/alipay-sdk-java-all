package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订阅价格属性
 *
 * @author auto create
 * @since 1.0, 2026-07-29 10:40:56
 */
public class SubscriptionPriceData extends AlipayObject {

	private static final long serialVersionUID = 4848491321242822215L;

	/**
	 * 价格元数据，必须是合法的 JSON object 字符串，且每个 value 必须是字符串
	 */
	@ApiField("metadata")
	private String metadata;

	/**
	 * 完整商品信息，引用 SubscriptionProductData 复杂类型
	 */
	@ApiField("product_data")
	private SubscriptionProductData productData;

	/**
	 * 周期价格配置；Submode 仅支持周期订阅价格，引用 SubscriptionRecurring 复杂类型
	 */
	@ApiField("recurring")
	private SubscriptionRecurring recurring;

	/**
	 * 商品单价，单位为分，必须大于 0；后端转换为以元表示的价格快照
	 */
	@ApiField("unit_amount")
	private Long unitAmount;

	public String getMetadata() {
		return this.metadata;
	}
	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}

	public SubscriptionProductData getProductData() {
		return this.productData;
	}
	public void setProductData(SubscriptionProductData productData) {
		this.productData = productData;
	}

	public SubscriptionRecurring getRecurring() {
		return this.recurring;
	}
	public void setRecurring(SubscriptionRecurring recurring) {
		this.recurring = recurring;
	}

	public Long getUnitAmount() {
		return this.unitAmount;
	}
	public void setUnitAmount(Long unitAmount) {
		this.unitAmount = unitAmount;
	}

}
