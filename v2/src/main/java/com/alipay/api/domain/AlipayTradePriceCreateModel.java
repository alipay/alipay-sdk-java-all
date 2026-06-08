package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 价格创建
 *
 * @author auto create
 * @since 1.0, 2026-06-04 21:51:41
 */
public class AlipayTradePriceCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6313183623973366844L;

	/**
	 * 自定义单价，当 unit_amount 为空时必选
	 */
	@ApiField("custom_unit_amount")
	private CustomUnitAmount customUnitAmount;

	/**
	 * 满足了eligibility_type的身份购买后，失效的时间。如3d = 3天，
3m = 3月
	 */
	@ApiField("eligibility_expire_time")
	private String eligibilityExpireTime;

	/**
	 * 只有满足该类型的身份才可以购买。具体的枚举值待支付宝侧分配
	 */
	@ApiField("eligibility_type")
	private String eligibilityType;

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

	public CustomUnitAmount getCustomUnitAmount() {
		return this.customUnitAmount;
	}
	public void setCustomUnitAmount(CustomUnitAmount customUnitAmount) {
		this.customUnitAmount = customUnitAmount;
	}

	public String getEligibilityExpireTime() {
		return this.eligibilityExpireTime;
	}
	public void setEligibilityExpireTime(String eligibilityExpireTime) {
		this.eligibilityExpireTime = eligibilityExpireTime;
	}

	public String getEligibilityType() {
		return this.eligibilityType;
	}
	public void setEligibilityType(String eligibilityType) {
		this.eligibilityType = eligibilityType;
	}

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
