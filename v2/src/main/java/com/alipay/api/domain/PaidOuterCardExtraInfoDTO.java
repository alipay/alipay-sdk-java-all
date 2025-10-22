package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 付费外卡信息
 *
 * @author auto create
 * @since 1.0, 2023-06-25 10:48:55
 */
public class PaidOuterCardExtraInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2833145326984931585L;

	/**
	 * 用户操作类型
	 */
	@ApiField("action")
	private String action;

	/**
	 * 用户连续购买付费卡信息
	 */
	@ApiField("cycle_info")
	private PaidOuterCardCycleInfoDTO cycleInfo;

	/**
	 * 用户购买付费外卡基本信息
	 */
	@ApiField("purchase_info")
	private PaidOuterCardPurchaseInfoDTO purchaseInfo;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public PaidOuterCardCycleInfoDTO getCycleInfo() {
		return this.cycleInfo;
	}
	public void setCycleInfo(PaidOuterCardCycleInfoDTO cycleInfo) {
		this.cycleInfo = cycleInfo;
	}

	public PaidOuterCardPurchaseInfoDTO getPurchaseInfo() {
		return this.purchaseInfo;
	}
	public void setPurchaseInfo(PaidOuterCardPurchaseInfoDTO purchaseInfo) {
		this.purchaseInfo = purchaseInfo;
	}

}
