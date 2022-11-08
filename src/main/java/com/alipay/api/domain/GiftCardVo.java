package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 礼品卡对客展示对象
 *
 * @author auto create
 * @since 1.0, 2022-10-14 14:51:01
 */
public class GiftCardVo extends AlipayObject {

	private static final long serialVersionUID = 2797614792181142485L;

	/**
	 * 可用余额
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/**
	 * 面额
	 */
	@ApiField("denomination")
	private String denomination;

	/**
	 * 生效日期
	 */
	@ApiField("effective_period")
	private String effectivePeriod;

	/**
	 * 礼品卡实例id
	 */
	@ApiField("gift_card_instance_no")
	private String giftCardInstanceNo;

	/**
	 * 卡实例状态
	 */
	@ApiField("gift_card_instance_status")
	private String giftCardInstanceStatus;

	/**
	 * 卡名称
	 */
	@ApiField("gift_card_name")
	private String giftCardName;

	/**
	 * 卡号
	 */
	@ApiField("gift_card_no")
	private String giftCardNo;

	/**
	 * 状态
	 */
	@ApiField("gift_card_status")
	private String giftCardStatus;

	/**
	 * 采购方id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 卡绑定的用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 有效日期
	 */
	@ApiField("valid_period")
	private String validPeriod;

	public String getAvailableAmount() {
		return this.availableAmount;
	}
	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}

	public String getDenomination() {
		return this.denomination;
	}
	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}

	public String getEffectivePeriod() {
		return this.effectivePeriod;
	}
	public void setEffectivePeriod(String effectivePeriod) {
		this.effectivePeriod = effectivePeriod;
	}

	public String getGiftCardInstanceNo() {
		return this.giftCardInstanceNo;
	}
	public void setGiftCardInstanceNo(String giftCardInstanceNo) {
		this.giftCardInstanceNo = giftCardInstanceNo;
	}

	public String getGiftCardInstanceStatus() {
		return this.giftCardInstanceStatus;
	}
	public void setGiftCardInstanceStatus(String giftCardInstanceStatus) {
		this.giftCardInstanceStatus = giftCardInstanceStatus;
	}

	public String getGiftCardName() {
		return this.giftCardName;
	}
	public void setGiftCardName(String giftCardName) {
		this.giftCardName = giftCardName;
	}

	public String getGiftCardNo() {
		return this.giftCardNo;
	}
	public void setGiftCardNo(String giftCardNo) {
		this.giftCardNo = giftCardNo;
	}

	public String getGiftCardStatus() {
		return this.giftCardStatus;
	}
	public void setGiftCardStatus(String giftCardStatus) {
		this.giftCardStatus = giftCardStatus;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getValidPeriod() {
		return this.validPeriod;
	}
	public void setValidPeriod(String validPeriod) {
		this.validPeriod = validPeriod;
	}

}
