package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商圈扫码购场景优惠咨询信息模型
 *
 * @author auto create
 * @since 1.0, 2019-01-24 08:46:56
 */
public class MallDiscountDetail extends AlipayObject {

	private static final long serialVersionUID = 2674113946691526178L;

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
	 * 优惠类型,外部优惠（OUT_DISCOUNT），商家优惠（M_DISCOUNT），平台优惠（RT_DISCOUNT）
	 */
	@ApiField("discount_type")
	private String discountType;

	/**
	 * 优惠ID或活动ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 优惠名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 是否是购买券, true代表是购买的券，false调表不是购买的券
	 */
	@ApiField("purchased")
	private Boolean purchased;

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

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Boolean getPurchased() {
		return this.purchased;
	}
	public void setPurchased(Boolean purchased) {
		this.purchased = purchased;
	}

}
