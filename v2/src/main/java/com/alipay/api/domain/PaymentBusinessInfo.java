package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 开放结果页复杂场景对象
 *
 * @author auto create
 * @since 1.0, 2023-07-19 19:24:50
 */
public class PaymentBusinessInfo extends AlipayObject {

	private static final long serialVersionUID = 1167355618181827557L;

	/**
	 * 开放结果页复杂场景优惠信息
	 */
	@ApiListField("discounts")
	@ApiField("custom_info")
	private List<CustomInfo> discounts;

	/**
	 * 开放结果页复杂场景其他信息
	 */
	@ApiListField("other")
	@ApiField("custom_info")
	private List<CustomInfo> other;

	/**
	 * 开放结果页复杂场景付款方式
	 */
	@ApiListField("payments")
	@ApiField("custom_info")
	private List<CustomInfo> payments;

	public List<CustomInfo> getDiscounts() {
		return this.discounts;
	}
	public void setDiscounts(List<CustomInfo> discounts) {
		this.discounts = discounts;
	}

	public List<CustomInfo> getOther() {
		return this.other;
	}
	public void setOther(List<CustomInfo> other) {
		this.other = other;
	}

	public List<CustomInfo> getPayments() {
		return this.payments;
	}
	public void setPayments(List<CustomInfo> payments) {
		this.payments = payments;
	}

}
