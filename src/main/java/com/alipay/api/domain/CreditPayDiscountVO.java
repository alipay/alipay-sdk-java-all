package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用支付折扣视图
 *
 * @author auto create
 * @since 1.0, 2019-07-12 14:25:48
 */
public class CreditPayDiscountVO extends AlipayObject {

	private static final long serialVersionUID = 7428997431179749597L;

	/**
	 * 折扣描述
	 */
	@ApiField("discount_desc")
	private String discountDesc;

	/**
	 * 折扣名
	 */
	@ApiField("discount_name")
	private String discountName;

	/**
	 * 整体折扣利率，仅在均匀打折下生效，小数形式
	 */
	@ApiField("full_discount_rate")
	private String fullDiscountRate;

	/**
	 * 是否有营销
	 */
	@ApiField("has_discount")
	private Boolean hasDiscount;

	/**
	 * 是否是非均匀打折，true-非均匀打折，false-均匀打折
	 */
	@ApiField("is_uneven_discount")
	private Boolean isUnevenDiscount;

	public String getDiscountDesc() {
		return this.discountDesc;
	}
	public void setDiscountDesc(String discountDesc) {
		this.discountDesc = discountDesc;
	}

	public String getDiscountName() {
		return this.discountName;
	}
	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}

	public String getFullDiscountRate() {
		return this.fullDiscountRate;
	}
	public void setFullDiscountRate(String fullDiscountRate) {
		this.fullDiscountRate = fullDiscountRate;
	}

	public Boolean getHasDiscount() {
		return this.hasDiscount;
	}
	public void setHasDiscount(Boolean hasDiscount) {
		this.hasDiscount = hasDiscount;
	}

	public Boolean getIsUnevenDiscount() {
		return this.isUnevenDiscount;
	}
	public void setIsUnevenDiscount(Boolean isUnevenDiscount) {
		this.isUnevenDiscount = isUnevenDiscount;
	}

}
