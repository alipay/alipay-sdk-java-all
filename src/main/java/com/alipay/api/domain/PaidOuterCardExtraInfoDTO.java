package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 付费外卡信息
 *
 * @author auto create
 * @since 1.0, 2022-02-21 15:46:02
 */
public class PaidOuterCardExtraInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 7275717394949549147L;

	/**
	 * 用户操作类型，枚举如下：
OPEN 开通
UPGRADE 升级
DOWNGRADE 降级
RENEW 续费
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
