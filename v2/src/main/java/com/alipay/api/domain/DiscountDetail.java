package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 优惠信息
 *
 * @author auto create
 * @since 1.0, 2017-08-16 14:42:02
 */
public class DiscountDetail extends AlipayObject {

	private static final long serialVersionUID = 5634647628625627756L;

	/**
	 * 优惠金额
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 优惠描述，比如至多优惠XX元，满XX减XX
	 */
	@ApiListField("discount_desc")
	@ApiField("string")
	private List<String> discountDesc;

	/**
	 * 优惠类型,商家优惠（M_DISCOUNT），平台优惠（RT_DISCOUNT）
	 */
	@ApiField("discount_type")
	private String discountType;

	/**
	 * 优惠ID或活动ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 优惠是否命中, true代表命中了优惠；false代表未命中优惠
	 */
	@ApiField("is_hit")
	private String isHit;

	/**
	 * 是否是购买券, true代表是购买的券，false调表不是购买的券
	 */
	@ApiField("is_purchased")
	private String isPurchased;

	/**
	 * 优惠名称
	 */
	@ApiField("name")
	private String name;

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public List<String> getDiscountDesc() {
		return this.discountDesc;
	}
	public void setDiscountDesc(List<String> discountDesc) {
		this.discountDesc = discountDesc;
	}

	public String getDiscountType() {
		return this.discountType;
	}
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getIsHit() {
		return this.isHit;
	}
	public void setIsHit(String isHit) {
		this.isHit = isHit;
	}

	public String getIsPurchased() {
		return this.isPurchased;
	}
	public void setIsPurchased(String isPurchased) {
		this.isPurchased = isPurchased;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
