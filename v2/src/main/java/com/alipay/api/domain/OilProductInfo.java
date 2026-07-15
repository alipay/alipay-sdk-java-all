package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业码加油门店的油品详情
 *
 * @author auto create
 * @since 1.0, 2026-05-18 15:43:22
 */
public class OilProductInfo extends AlipayObject {

	private static final long serialVersionUID = 3667292765779789634L;

	/**
	 * 如果门店有营销活动，则返回门店油品的优惠价格，单位元，精度小数点两位
	 */
	@ApiField("discount_price")
	private String discountPrice;

	/**
	 * 门店维护的油品价格，单位元，精度小数点两位
	 */
	@ApiField("listed_price")
	private String listedPrice;

	/**
	 * 油品类型code
	 */
	@ApiField("oil_type")
	private String oilType;

	public String getDiscountPrice() {
		return this.discountPrice;
	}
	public void setDiscountPrice(String discountPrice) {
		this.discountPrice = discountPrice;
	}

	public String getListedPrice() {
		return this.listedPrice;
	}
	public void setListedPrice(String listedPrice) {
		this.listedPrice = listedPrice;
	}

	public String getOilType() {
		return this.oilType;
	}
	public void setOilType(String oilType) {
		this.oilType = oilType;
	}

}
