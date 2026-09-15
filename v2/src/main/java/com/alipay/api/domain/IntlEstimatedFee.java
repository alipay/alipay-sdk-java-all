package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预估报价明细
 *
 * @author auto create
 * @since 1.0, 2026-09-10 10:42:27
 */
public class IntlEstimatedFee extends AlipayObject {

	private static final long serialVersionUID = 3783342743991394795L;

	/**
	 * 运费(含报关费)，单位分。支付方：寄件人
	 */
	@ApiField("base_freight")
	private Long baseFreight;

	/**
	 * 折扣前合计(各项之和，单位分)
	 */
	@ApiField("before_discount_fee")
	private Long beforeDiscountFee;

	/**
	 * 燃油附加费，单位分。支付方：寄件人
	 */
	@ApiField("fuel_fee")
	private Long fuelFee;

	/**
	 * 保价费，单位分。支付方：寄件人
	 */
	@ApiField("insured_fee")
	private Long insuredFee;

	/**
	 * 优惠抵扣合计(单位分)
	 */
	@ApiField("merchant_discount_fee")
	private Long merchantDiscountFee;

	/**
	 * 操作费(大件操作等)，单位分。支付方：寄件人
	 */
	@ApiField("operation_fee")
	private Long operationFee;

	/**
	 * 预估运费总价(折后 = before_discount_fee - merchant_discount_fee，单位分)
	 */
	@ApiField("order_fee")
	private Long orderFee;

	/**
	 * 其他增值服务费(兜底)，单位分。支付方：寄件人
	 */
	@ApiField("other_addvalue_fee")
	private Long otherAddvalueFee;

	/**
	 * 其他运费，单位分。支付方：寄件人
	 */
	@ApiField("other_freight")
	private Long otherFreight;

	/**
	 * 其他附加服务费(兜底)，单位分。支付方：寄件人
	 */
	@ApiField("other_surcharge_fee")
	private Long otherSurchargeFee;

	/**
	 * 超长超重费，单位分。支付方：寄件人
	 */
	@ApiField("oversize_overweight_fee")
	private Long oversizeOverweightFee;

	/**
	 * 包装费，单位分。支付方：寄件人
	 */
	@ApiField("packaging_fee")
	private Long packagingFee;

	/**
	 * 偏远地区附加费，单位分。支付方：寄件人
	 */
	@ApiField("remote_area_surcharge")
	private Long remoteAreaSurcharge;

	/**
	 * 敏货增值费，单位分。支付方：寄件人
	 */
	@ApiField("sensitive_goods_addvalue_fee")
	private Long sensitiveGoodsAddvalueFee;

	/**
	 * 超敏货增值费，单位分。支付方：寄件人
	 */
	@ApiField("super_sensitive_addvalue_fee")
	private Long superSensitiveAddvalueFee;

	public Long getBaseFreight() {
		return this.baseFreight;
	}
	public void setBaseFreight(Long baseFreight) {
		this.baseFreight = baseFreight;
	}

	public Long getBeforeDiscountFee() {
		return this.beforeDiscountFee;
	}
	public void setBeforeDiscountFee(Long beforeDiscountFee) {
		this.beforeDiscountFee = beforeDiscountFee;
	}

	public Long getFuelFee() {
		return this.fuelFee;
	}
	public void setFuelFee(Long fuelFee) {
		this.fuelFee = fuelFee;
	}

	public Long getInsuredFee() {
		return this.insuredFee;
	}
	public void setInsuredFee(Long insuredFee) {
		this.insuredFee = insuredFee;
	}

	public Long getMerchantDiscountFee() {
		return this.merchantDiscountFee;
	}
	public void setMerchantDiscountFee(Long merchantDiscountFee) {
		this.merchantDiscountFee = merchantDiscountFee;
	}

	public Long getOperationFee() {
		return this.operationFee;
	}
	public void setOperationFee(Long operationFee) {
		this.operationFee = operationFee;
	}

	public Long getOrderFee() {
		return this.orderFee;
	}
	public void setOrderFee(Long orderFee) {
		this.orderFee = orderFee;
	}

	public Long getOtherAddvalueFee() {
		return this.otherAddvalueFee;
	}
	public void setOtherAddvalueFee(Long otherAddvalueFee) {
		this.otherAddvalueFee = otherAddvalueFee;
	}

	public Long getOtherFreight() {
		return this.otherFreight;
	}
	public void setOtherFreight(Long otherFreight) {
		this.otherFreight = otherFreight;
	}

	public Long getOtherSurchargeFee() {
		return this.otherSurchargeFee;
	}
	public void setOtherSurchargeFee(Long otherSurchargeFee) {
		this.otherSurchargeFee = otherSurchargeFee;
	}

	public Long getOversizeOverweightFee() {
		return this.oversizeOverweightFee;
	}
	public void setOversizeOverweightFee(Long oversizeOverweightFee) {
		this.oversizeOverweightFee = oversizeOverweightFee;
	}

	public Long getPackagingFee() {
		return this.packagingFee;
	}
	public void setPackagingFee(Long packagingFee) {
		this.packagingFee = packagingFee;
	}

	public Long getRemoteAreaSurcharge() {
		return this.remoteAreaSurcharge;
	}
	public void setRemoteAreaSurcharge(Long remoteAreaSurcharge) {
		this.remoteAreaSurcharge = remoteAreaSurcharge;
	}

	public Long getSensitiveGoodsAddvalueFee() {
		return this.sensitiveGoodsAddvalueFee;
	}
	public void setSensitiveGoodsAddvalueFee(Long sensitiveGoodsAddvalueFee) {
		this.sensitiveGoodsAddvalueFee = sensitiveGoodsAddvalueFee;
	}

	public Long getSuperSensitiveAddvalueFee() {
		return this.superSensitiveAddvalueFee;
	}
	public void setSuperSensitiveAddvalueFee(Long superSensitiveAddvalueFee) {
		this.superSensitiveAddvalueFee = superSensitiveAddvalueFee;
	}

}
