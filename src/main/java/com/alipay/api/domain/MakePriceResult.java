package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 定价推荐价格列表返回类型
 *
 * @author auto create
 * @since 1.0, 2019-12-11 20:40:35
 */
public class MakePriceResult extends AlipayObject {

	private static final long serialVersionUID = 1211173268579862919L;

	/**
	 * 定价对象原价
	 */
	@ApiField("base_price_cent")
	private String basePriceCent;

	/**
	 * 定价对象类型
	 */
	@ApiField("product_type")
	private String productType;

	/**
	 * 定价对象推荐价格
	 */
	@ApiField("promo_price")
	private String promoPrice;

	public String getBasePriceCent() {
		return this.basePriceCent;
	}
	public void setBasePriceCent(String basePriceCent) {
		this.basePriceCent = basePriceCent;
	}

	public String getProductType() {
		return this.productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getPromoPrice() {
		return this.promoPrice;
	}
	public void setPromoPrice(String promoPrice) {
		this.promoPrice = promoPrice;
	}

}
