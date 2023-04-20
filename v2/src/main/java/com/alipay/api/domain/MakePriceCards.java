package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户定价入参价格结构列表
 *
 * @author auto create
 * @since 1.0, 2019-12-11 20:40:43
 */
public class MakePriceCards extends AlipayObject {

	private static final long serialVersionUID = 3654792437335595119L;

	/**
	 * 定价对象原价
	 */
	@ApiField("base_price_cent")
	private Long basePriceCent;

	/**
	 * 期望推荐价格，注意：不要频繁变动。
	 */
	@ApiField("expect_promo_price")
	private String expectPromoPrice;

	/**
	 * 定价区间下限
	 */
	@ApiField("lower_promo_price")
	private Long lowerPromoPrice;

	/**
	 * 定价对象类型
	 */
	@ApiField("product_type")
	private String productType;

	/**
	 * 定价区间上限
	 */
	@ApiField("upper_promo_price")
	private Long upperPromoPrice;

	public Long getBasePriceCent() {
		return this.basePriceCent;
	}
	public void setBasePriceCent(Long basePriceCent) {
		this.basePriceCent = basePriceCent;
	}

	public String getExpectPromoPrice() {
		return this.expectPromoPrice;
	}
	public void setExpectPromoPrice(String expectPromoPrice) {
		this.expectPromoPrice = expectPromoPrice;
	}

	public Long getLowerPromoPrice() {
		return this.lowerPromoPrice;
	}
	public void setLowerPromoPrice(Long lowerPromoPrice) {
		this.lowerPromoPrice = lowerPromoPrice;
	}

	public String getProductType() {
		return this.productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}

	public Long getUpperPromoPrice() {
		return this.upperPromoPrice;
	}
	public void setUpperPromoPrice(Long upperPromoPrice) {
		this.upperPromoPrice = upperPromoPrice;
	}

}
