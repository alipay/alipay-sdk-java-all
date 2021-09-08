package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单优惠信息;电子小票场景时，必填
 *
 * @author auto create
 * @since 1.0, 2021-08-16 10:41:16
 */
public class DiscountInfoDataDTO extends AlipayObject {

	private static final long serialVersionUID = 6262211495817131894L;

	/**
	 * 优惠金额
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 优惠名称
	 */
	@ApiField("discount_name")
	private String discountName;

	/**
	 * 优惠跳转链接地址
	 */
	@ApiField("discount_page_link")
	private String discountPageLink;

	/**
	 * 优惠数量
	 */
	@ApiField("discount_quantity")
	private Long discountQuantity;

	/**
	 * 外部优惠id
	 */
	@ApiField("external_discount_id")
	private String externalDiscountId;

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getDiscountName() {
		return this.discountName;
	}
	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}

	public String getDiscountPageLink() {
		return this.discountPageLink;
	}
	public void setDiscountPageLink(String discountPageLink) {
		this.discountPageLink = discountPageLink;
	}

	public Long getDiscountQuantity() {
		return this.discountQuantity;
	}
	public void setDiscountQuantity(Long discountQuantity) {
		this.discountQuantity = discountQuantity;
	}

	public String getExternalDiscountId() {
		return this.externalDiscountId;
	}
	public void setExternalDiscountId(String externalDiscountId) {
		this.externalDiscountId = externalDiscountId;
	}

}
