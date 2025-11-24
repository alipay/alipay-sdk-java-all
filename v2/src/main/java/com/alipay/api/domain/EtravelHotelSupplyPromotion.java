package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 酒旅项目-优惠信息
 *
 * @author auto create
 * @since 1.0, 2025-03-26 10:34:17
 */
public class EtravelHotelSupplyPromotion extends AlipayObject {

	private static final long serialVersionUID = 8815826933735151426L;

	/**
	 * 可对用户展示优惠信息
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 1 立减金额，2 百分比优惠
	 */
	@ApiField("discount_type")
	private Long discountType;

	/**
	 * 促销活动类型，多日相同促销活动，此值相同，可用于订单总价优惠活动计算
	 */
	@ApiField("tag")
	private String tag;

	/**
	 * 用于区分多种促销活动，例如 提前预订优惠:BookAhead,HotelDiscount：优享促销
PromotionAndReduction：促销立减
	 */
	@ApiField("tag_code")
	private String tagCode;

	/**
	 * 1 用户（基于用户身份促销），2  商品促销,3 商家促销，4 平台促销 ，5 其他
	 */
	@ApiField("type")
	private String type;

	/**
	 * 促销立减金额传具体立减金额，单位:元
百分比优惠传小数（0.92），单位:%
	 */
	@ApiField("value")
	private String value;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Long getDiscountType() {
		return this.discountType;
	}
	public void setDiscountType(Long discountType) {
		this.discountType = discountType;
	}

	public String getTag() {
		return this.tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getTagCode() {
		return this.tagCode;
	}
	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
