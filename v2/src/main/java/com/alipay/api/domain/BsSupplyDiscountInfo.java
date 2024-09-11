package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联营-供给-权益优惠信息
 *
 * @author auto create
 * @since 1.0, 2023-04-17 20:20:44
 */
public class BsSupplyDiscountInfo extends AlipayObject {

	private static final long serialVersionUID = 4255589369472697776L;

	/**
	 * 优惠券面额，单位元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 折扣券最大优惠金额，单位元
	 */
	@ApiField("ceiling_amount")
	private String ceilingAmount;

	/**
	 * 满减优惠券使用门槛金额，单位元
	 */
	@ApiField("floor_amount")
	private String floorAmount;

	/**
	 * 权益商品原价，单位元
	 */
	@ApiField("origin_amount")
	private String originAmount;

	/**
	 * 特价优惠券商品特价金额，单位元
	 */
	@ApiField("special_amount")
	private String specialAmount;

	/**
	 * 折扣优惠券折扣比例，0.90代表9折
	 */
	@ApiField("voucher_discount_percent")
	private String voucherDiscountPercent;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCeilingAmount() {
		return this.ceilingAmount;
	}
	public void setCeilingAmount(String ceilingAmount) {
		this.ceilingAmount = ceilingAmount;
	}

	public String getFloorAmount() {
		return this.floorAmount;
	}
	public void setFloorAmount(String floorAmount) {
		this.floorAmount = floorAmount;
	}

	public String getOriginAmount() {
		return this.originAmount;
	}
	public void setOriginAmount(String originAmount) {
		this.originAmount = originAmount;
	}

	public String getSpecialAmount() {
		return this.specialAmount;
	}
	public void setSpecialAmount(String specialAmount) {
		this.specialAmount = specialAmount;
	}

	public String getVoucherDiscountPercent() {
		return this.voucherDiscountPercent;
	}
	public void setVoucherDiscountPercent(String voucherDiscountPercent) {
		this.voucherDiscountPercent = voucherDiscountPercent;
	}

}
