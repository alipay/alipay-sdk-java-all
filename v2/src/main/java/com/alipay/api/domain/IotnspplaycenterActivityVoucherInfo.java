package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-28 13:52:52
 */
public class IotnspplaycenterActivityVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 4396998256588594927L;

	/**
	 * 商品LOGO地址。
	 */
	@ApiField("item_logo")
	private String itemLogo;

	/**
	 * 券所属商户LOGO地址。
	 */
	@ApiField("merchant_logo")
	private String merchantLogo;

	/**
	 * 券所属商户名称。
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 商品原价，单位为人民币元。
	 */
	@ApiField("original_amount")
	private String originalAmount;

	/**
	 * 奖品ID。
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 优惠数值；unit为“元”时表示人民币元金额，unit为“折”时表示折扣值。
	 */
	@ApiField("reduction_amount")
	private String reductionAmount;

	/**
	 * 券使用门槛展示文案，文案中包含金额及单位，例如“满10元可用”。
	 */
	@ApiField("threshold_amount_text")
	private String thresholdAmountText;

	/**
	 * 优惠金额或折扣的单位，如元、折。
	 */
	@ApiField("unit")
	private String unit;

	/**
	 * 用户领取的券实例ID。
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * 券名称。
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/**
	 * 券类型。
	 */
	@ApiField("voucher_type")
	private String voucherType;

	public String getItemLogo() {
		return this.itemLogo;
	}
	public void setItemLogo(String itemLogo) {
		this.itemLogo = itemLogo;
	}

	public String getMerchantLogo() {
		return this.merchantLogo;
	}
	public void setMerchantLogo(String merchantLogo) {
		this.merchantLogo = merchantLogo;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getOriginalAmount() {
		return this.originalAmount;
	}
	public void setOriginalAmount(String originalAmount) {
		this.originalAmount = originalAmount;
	}

	public String getPrizeId() {
		return this.prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	public String getReductionAmount() {
		return this.reductionAmount;
	}
	public void setReductionAmount(String reductionAmount) {
		this.reductionAmount = reductionAmount;
	}

	public String getThresholdAmountText() {
		return this.thresholdAmountText;
	}
	public void setThresholdAmountText(String thresholdAmountText) {
		this.thresholdAmountText = thresholdAmountText;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
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
