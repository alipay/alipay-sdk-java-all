package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 优惠数据，仅回传优惠数据时传入
 *
 * @author auto create
 * @since 1.0, 2021-01-30 13:17:17
 */
public class DiscountTypeSyncData extends AlipayObject {

	private static final long serialVersionUID = 4887532974212848963L;

	/**
	 * 商户回传的优惠金额，如用户享受的红包金额，单位元
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 商户数据回传的优惠信息的名称。
	 */
	@ApiField("discount_desc")
	private String discountDesc;

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getDiscountDesc() {
		return this.discountDesc;
	}
	public void setDiscountDesc(String discountDesc) {
		this.discountDesc = discountDesc;
	}

}
