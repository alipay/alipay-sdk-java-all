package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动类型信息
 *
 * @author auto create
 * @since 1.0, 2024-03-28 14:05:48
 */
public class DtBankActivityTypeInfo extends AlipayObject {

	private static final long serialVersionUID = 4232599285184738127L;

	/**
	 * 活动类型
	 */
	@ApiField("activity_type")
	private String activityType;

	/**
	 * 首绑有礼活动信息，activity_type为FIRST_BIND_GIFT_CARD时有值
	 */
	@ApiField("first_bind_card_gift_info")
	private DtBankFirstBindCardGiftInfo firstBindCardGiftInfo;

	/**
	 * 通用渠道红包信息，activity_type为VOUCHER时有值
	 */
	@ApiField("voucher_info")
	private DtBankVoucherInfo voucherInfo;

	public String getActivityType() {
		return this.activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public DtBankFirstBindCardGiftInfo getFirstBindCardGiftInfo() {
		return this.firstBindCardGiftInfo;
	}
	public void setFirstBindCardGiftInfo(DtBankFirstBindCardGiftInfo firstBindCardGiftInfo) {
		this.firstBindCardGiftInfo = firstBindCardGiftInfo;
	}

	public DtBankVoucherInfo getVoucherInfo() {
		return this.voucherInfo;
	}
	public void setVoucherInfo(DtBankVoucherInfo voucherInfo) {
		this.voucherInfo = voucherInfo;
	}

}
