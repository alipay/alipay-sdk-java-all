package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 优惠券咨询结果
 *
 * @author auto create
 * @since 1.0, 2021-03-30 14:59:49
 */
public class VoucherConsultInfo extends AlipayObject {

	private static final long serialVersionUID = 6852995372114639556L;

	/**
	 * 封顶优惠金额，单位为元
	 */
	@ApiField("ceiling_amount")
	private String ceilingAmount;

	/**
	 * 单品券商品优惠信息，仅针对单品券
	 */
	@ApiField("item_promo_info")
	private ItemPromoInfo itemPromoInfo;

	/**
	 * 是否为可使用的互斥券中最优的（目前返回的记录该值均为true，即可忽略该值判断）
	 */
	@ApiField("optimal")
	private Boolean optimal;

	/**
	 * 优惠总金额，单位为元
	 */
	@ApiField("promo_amount")
	private String promoAmount;

	/**
	 * 优惠文案
	 */
	@ApiField("promo_text")
	private String promoText;

	/**
	 * 优惠类型： 代金(FIX),折扣(DISCOUNT),减至(SPECIAL，即特价券)
	 */
	@ApiField("promo_type")
	private String promoType;

	/**
	 * 满减金额，单位为元，仅针对代金券
	 */
	@ApiField("reduction_amount")
	private String reductionAmount;

	/**
	 * 优惠额度，如3折券，返回0.7，仅针对折扣券
	 */
	@ApiField("reduction_ratio")
	private String reductionRatio;

	/**
	 * 减至金额，单位为元，仅针对减至券
	 */
	@ApiField("specified_amount")
	private String specifiedAmount;

	/**
	 * 优惠门槛，单位为元
	 */
	@ApiField("threshold_amount")
	private String thresholdAmount;

	/**
	 * 券id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * 券名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/**
	 * 券类型： 1）全场券(ALL) 2）单品券(ITEM)
	 */
	@ApiField("voucher_type")
	private String voucherType;

	public String getCeilingAmount() {
		return this.ceilingAmount;
	}
	public void setCeilingAmount(String ceilingAmount) {
		this.ceilingAmount = ceilingAmount;
	}

	public ItemPromoInfo getItemPromoInfo() {
		return this.itemPromoInfo;
	}
	public void setItemPromoInfo(ItemPromoInfo itemPromoInfo) {
		this.itemPromoInfo = itemPromoInfo;
	}

	public Boolean getOptimal() {
		return this.optimal;
	}
	public void setOptimal(Boolean optimal) {
		this.optimal = optimal;
	}

	public String getPromoAmount() {
		return this.promoAmount;
	}
	public void setPromoAmount(String promoAmount) {
		this.promoAmount = promoAmount;
	}

	public String getPromoText() {
		return this.promoText;
	}
	public void setPromoText(String promoText) {
		this.promoText = promoText;
	}

	public String getPromoType() {
		return this.promoType;
	}
	public void setPromoType(String promoType) {
		this.promoType = promoType;
	}

	public String getReductionAmount() {
		return this.reductionAmount;
	}
	public void setReductionAmount(String reductionAmount) {
		this.reductionAmount = reductionAmount;
	}

	public String getReductionRatio() {
		return this.reductionRatio;
	}
	public void setReductionRatio(String reductionRatio) {
		this.reductionRatio = reductionRatio;
	}

	public String getSpecifiedAmount() {
		return this.specifiedAmount;
	}
	public void setSpecifiedAmount(String specifiedAmount) {
		this.specifiedAmount = specifiedAmount;
	}

	public String getThresholdAmount() {
		return this.thresholdAmount;
	}
	public void setThresholdAmount(String thresholdAmount) {
		this.thresholdAmount = thresholdAmount;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

	public String getVoucherName() {
		return this.voucherName;
	}
	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

}
