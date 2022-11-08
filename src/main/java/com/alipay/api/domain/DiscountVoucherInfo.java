package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 折扣券详情
 *
 * @author auto create
 * @since 1.0, 2022-11-03 16:33:13
 */
public class DiscountVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 8623935464684932159L;

	/**
	 * 封顶金额。
	 */
	@ApiField("ceiling_amount")
	private String ceilingAmount;

	/**
	 * 折扣率。
	 */
	@ApiField("discount")
	private String discount;

	/**
	 * 门槛金额。
	 */
	@ApiField("floor_amount")
	private String floorAmount;

	public String getCeilingAmount() {
		return this.ceilingAmount;
	}
	public void setCeilingAmount(String ceilingAmount) {
		this.ceilingAmount = ceilingAmount;
	}

	public String getDiscount() {
		return this.discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getFloorAmount() {
		return this.floorAmount;
	}
	public void setFloorAmount(String floorAmount) {
		this.floorAmount = floorAmount;
	}

}
